package sgda.dao;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import sgda.model.AlunoDisciplinaModel;
import sgda.model.ConnectionFactoryModel;

public class AlunoDisciplinaDAO implements InterfaceAlunoDisciplinaDAO {
    private PreparedStatement stm = null;
    private Connection con = null;
    
    @Override
    public void insert(AlunoDisciplinaModel ad) {
        try {
            con = ConnectionFactoryModel.getConnection();
            stm = con.prepareStatement("INSERT INTO aluno_disciplina (aluno, disciplina) VALUES (?, ?)");
            stm.setInt(1, ad.getAluno());
            stm.setInt(2, ad.getDisciplina());
            stm.executeUpdate();

            JOptionPane.showConfirmDialog(null, "Inserção feita com sucesso!", "SGDA - Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);

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
            stm = con.prepareStatement("DELETE FROM aluno_disciplina WHERE disciplina = ?");
            stm.setInt(1, ad.getDisciplina());
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
            stm = con.prepareStatement("UPDATE aluno_disciplina SET aluno = ?, disciplina = ? WHERE disciplina = ?");
            stm.setInt(1, ad.getAluno());
            stm.setInt(2, ad.getDisciplina());
            stm.setInt(3, ad.getDisciplina());
            stm.executeUpdate();

            JOptionPane.showConfirmDialog(null, "Alteração feita com sucesso!", "SGDA - Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);

        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Houve algum erro durante a inserção!\n\nInformações técnicas sobre o erro: " + ex, "SGDA - Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);

        } finally {
            ConnectionFactoryModel.closeConnection(con, stm);
        }    
    }
}