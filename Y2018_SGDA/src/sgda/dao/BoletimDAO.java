package sgda.dao;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import sgda.model.BoletimModel;
import sgda.model.ConnectionFactoryModel;

public class BoletimDAO implements InterfaceBoletimDAO{

    private PreparedStatement stm = null;
    private Connection con = null;
    
    @Override
    public void insert(BoletimModel bo) {
        try {
            con = ConnectionFactoryModel.getConnection();
            stm = con.prepareStatement("INSERT INTO boletim (aluno, disciplina, nota, frequencia) VALUES (?, ?, ?, ?)");
            stm.setInt(1, bo.getAluno());
            stm.setInt(2, bo.getDisciplina());
            stm.setFloat(3, bo.getNota());
            stm.setFloat(4, bo.getFrequencia());
            stm.executeUpdate();

            JOptionPane.showConfirmDialog(null, "Inserção feita com sucesso!", "SGDA - Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);

        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Houve algum erro durante a inserção!\n\nInformações técnicas sobre o erro: " + ex, "SGDA - Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);

        } finally {
            ConnectionFactoryModel.closeConnection(con, stm);
        }
    }

    @Override
    public void delete(BoletimModel bo) {
        try {
            con = ConnectionFactoryModel.getConnection();
            stm = con.prepareStatement("DELETE FROM boletim WHERE disciplina = ?");
            stm.setInt(1, bo.getDisciplina());
            stm.executeUpdate();

            JOptionPane.showConfirmDialog(null, "Remoção feita com sucesso!", "SGDA - Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);

        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Houve algum erro durante a inserção!\n\nInformações técnicas sobre o erro: " + ex, "SGDA - Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);

        } finally {
            ConnectionFactoryModel.closeConnection(con, stm);
        }
    }

    @Override
    public void update(BoletimModel bo) {
        try {
            con = ConnectionFactoryModel.getConnection();
            stm = con.prepareStatement("UPDATE boletim SET aluno = ?, disciplina = ?, nota = ?, frequencia = ? WHERE disciplina = ?");
            stm.setInt(1, bo.getAluno());
            stm.setInt(2, bo.getDisciplina());
            stm.setFloat(3, bo.getNota());
            stm.setFloat(4, bo.getFrequencia());
            stm.setInt(5, bo.getDisciplina());
            stm.executeUpdate();

            JOptionPane.showConfirmDialog(null, "Alteração feita com sucesso!", "SGDA - Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);

        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Houve algum erro durante a inserção!\n\nInformações técnicas sobre o erro: " + ex, "SGDA - Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);

        } finally {
            ConnectionFactoryModel.closeConnection(con, stm);
        }
    }
}
