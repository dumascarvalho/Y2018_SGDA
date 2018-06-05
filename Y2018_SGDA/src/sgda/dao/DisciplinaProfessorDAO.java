package sgda.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import sgda.model.ConnectionFactoryModel;
import sgda.model.DisciplinaProfessorModel;
import sgda.model.FormatarCamposModel;

public class DisciplinaProfessorDAO implements InterfaceDisciplinaProfessorDAO {

    private PreparedStatement stm = null;
    private ResultSet rs = null;
    private Connection con = null;
    
    @Override
    public TableModel selectForTable() {
        
        try {
            con = ConnectionFactoryModel.getConnection();
            stm = con.prepareStatement("SELECT disciplina, nome_disciplina, matricula, nome FROM pessoa, disciplina_professor, disciplina WHERE perfil = 'Professor' AND disciplina = cod_disciplina AND professor = matricula ORDER BY nome_disciplina");
            rs = stm.executeQuery();

            return FormatarCamposModel.colocarDadosTabela(rs);

        } catch (SQLException ex) {
            throw new RuntimeException("Exceção: " + ex);

        } finally {
            ConnectionFactoryModel.closeConnection(con, stm, rs);
        }
    }

    @Override
    public TableModel selectForTable(String texto) {
        
        try {
            con = ConnectionFactoryModel.getConnection();
            stm = con.prepareStatement("SELECT disciplina, nome_disciplina, matricula, nome FROM pessoa, disciplina_professor, disciplina WHERE perfil = 'Professor' AND disciplina = cod_disciplina AND professor = matricula AND nome_disciplina LIKE '" + texto + "%' ORDER BY nome_disciplina");
            rs = stm.executeQuery();

            return FormatarCamposModel.colocarDadosTabela(rs);

        } catch (SQLException ex) {
            throw new RuntimeException("Exceção: " + ex);

        } finally {
            ConnectionFactoryModel.closeConnection(con, stm, rs);
        }
    }
    
    @Override
    public void insert(DisciplinaProfessorModel dp) {
        try {
            con = ConnectionFactoryModel.getConnection();
            stm = con.prepareStatement("INSERT INTO disciplina_professor (disciplina, professor) VALUES (?, ?)");
            stm.setInt(1, dp.getDisciplina());
            stm.setInt(2, dp.getProfessor());
            stm.executeUpdate();

            JOptionPane.showConfirmDialog(null, "Inserção feita com sucesso!", "SGDA - Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception ex) {
            JOptionPane.showConfirmDialog(null, "Houve algum erro durante a inserção!\n\nInformações técnicas sobre o erro: " + ex, "SGDA - Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);

        } finally {
            ConnectionFactoryModel.closeConnection(con, stm, rs);
        }
    }

    @Override
    public void delete(DisciplinaProfessorModel dp) {
        try {
            con = ConnectionFactoryModel.getConnection();
            stm = con.prepareStatement("DELETE FROM disciplina_professor WHERE disciplina = ? AND professor = ?");
            stm.setInt(1, dp.getDisciplina());
            stm.setInt(2, dp.getProfessor());
            stm.executeUpdate();

            JOptionPane.showConfirmDialog(null, "Remoção feita com sucesso!", "SGDA - Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception ex) {
            JOptionPane.showConfirmDialog(null, "Houve algum erro durante a remoção!\n\nInformações técnicas sobre o erro: " + ex, "SGDA - Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);

        } finally {
            ConnectionFactoryModel.closeConnection(con, stm, rs);
        }
    }

    @Override
    public void update(DisciplinaProfessorModel dp, DisciplinaProfessorModel dpu) {
        try {
            con = ConnectionFactoryModel.getConnection();
            stm = con.prepareStatement("UPDATE disciplina_professor SET disciplina = ?, professor = ? WHERE disciplina = ? AND professor = ?");
            stm.setInt(1, dp.getDisciplina());
            stm.setInt(2, dp.getProfessor());
            stm.setInt(3, dpu.getDisciplina());
            stm.setInt(4, dpu.getProfessor());
            stm.executeUpdate();

            JOptionPane.showConfirmDialog(null, "Inserção feita com sucesso!", "SGDA - Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception ex) {
            JOptionPane.showConfirmDialog(null, "Houve algum erro durante a inserção!\n\nInformações técnicas sobre o erro: " + ex, "SGDA - Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);

        } finally {
            ConnectionFactoryModel.closeConnection(con, stm, rs);
        }
    }    

    @Override
    public List selectForCombo(String coluna, String perfil) {
        try {
            List<String> listColuna = new ArrayList();

            con = ConnectionFactoryModel.getConnection();
            stm = con.prepareStatement("SELECT * FROM pessoa WHERE perfil = '" + perfil + "'");
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
