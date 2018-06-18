package sgda.dao;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import sgda.model.AlunoDisciplinaModel;
import sgda.model.ConnectionFactoryModel;
import sgda.model.LoginModel;

public class AlunoDisciplinaDAO implements InterfaceAlunoDisciplinaDAO {

    private PreparedStatement stm = null;
    private ResultSet rs = null;
    private Connection con = null;
    boolean duplicado = false;

    @Override
    public void insert(AlunoDisciplinaModel ad) {
        
        try {
            con = ConnectionFactoryModel.getConnection();
            stm = con.prepareStatement("SELECT * FROM aluno_disciplina");
            rs = stm.executeQuery();
            
            while (rs.next()) {                
                if (ad.getAluno()== rs.getInt("aluno") && ad.getDisciplina() == rs.getInt("disciplina")) {
                    duplicado = true;
                }                
            }
            
            stm = null;
            
            if (duplicado == false) {            
                stm = con.prepareStatement("INSERT INTO aluno_disciplina (aluno, disciplina) VALUES (?, ?)");
                stm.setInt(1, ad.getAluno());
                stm.setInt(2, ad.getDisciplina());
                stm.executeUpdate();

                JOptionPane.showConfirmDialog(null, "Disciplina adicionada com sucesso!\nObservação: esta adição pode ser alterada somente pelos administradores do sistema.", "SGDA - Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showConfirmDialog(null, "Não foi possível realizar a inserção!\nMotivo: a relação informada já existe.", "SGDA - Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE);
            }

        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Houve algum erro durante a inserção!\n\nInformações técnicas sobre o erro: " + ex, "SGDA - Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);

        } finally {
            ConnectionFactoryModel.closeConnection(con, stm);
        }
    }

    @Override
    public void delete(AlunoDisciplinaModel ad) {

        try {
            con = ConnectionFactoryModel.getConnection();
            stm = con.prepareStatement("DELETE FROM aluno_disciplina WHERE aluno = ? AND disciplina = ?");
            stm.setInt(1, ad.getAluno());
            stm.setInt(2, ad.getDisciplina());
            stm.executeUpdate();

            JOptionPane.showConfirmDialog(null, "Remoção feita com sucesso!", "SGDA - Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);

        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Houve algum erro durante a inserção!\n\nInformações técnicas sobre o erro: " + ex, "SGDA - Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);

        } finally {
            ConnectionFactoryModel.closeConnection(con, stm);
        }
    }

    @Override
    public void update(AlunoDisciplinaModel ad) {

        try {
            con = ConnectionFactoryModel.getConnection();
            stm = con.prepareStatement("UPDATE aluno_disciplina SET aluno = ?, disciplina = ? WHERE aluno = ? AND disciplina = ?");
            stm.setInt(1, ad.getAluno());
            stm.setInt(2, ad.getDisciplina());
            stm.setInt(3, ad.getAluno());
            stm.setInt(4, ad.getDisciplina());
            stm.executeUpdate();

            JOptionPane.showConfirmDialog(null, "Atualização feita com sucesso!", "SGDA - Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);

        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Houve algum erro durante a inserção!\n\nInformações técnicas sobre o erro: " + ex, "SGDA - Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);

        } finally {
            ConnectionFactoryModel.closeConnection(con, stm);
        }
    }
    
    @Override
    public List selectForComboComCurso(String coluna, LoginModel lo) {

        try {
            List<String> listColuna = new ArrayList();

            con = ConnectionFactoryModel.getConnection();
            stm = con.prepareStatement("SELECT cod_curso, nome_curso, cod_disciplina, nome_disciplina FROM curso_disciplina cd \n" +
            "JOIN curso c ON (c.cod_curso = cd.curso) \n" +
            "JOIN disciplina d ON (d.cod_disciplina = cd.disciplina) \n" +
            "JOIN aluno a ON (c.cod_curso = a.curso) \n" +
            "WHERE a.matricula = ? AND d.situacao = 'Matrículas Abertas'");
            stm.setInt(1, lo.getMatricula());
            rs = stm.executeQuery();

            while (rs.next()) {
                listColuna.add(rs.getString(coluna));
            }

            return listColuna;

        } catch (SQLException ex) {
            throw new RuntimeException("Exceção: " + ex);

        } finally {
            ConnectionFactoryModel.closeConnection(con, stm, rs);
        }
    }
}
