package sgda.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import sgda.model.CalendarioModel;
import sgda.model.ConnectionFactoryModel;

public class CalendarioDAO implements InterfaceCalendarioDAO{

    private PreparedStatement stm = null;
    private Connection con = null;
    
    @Override
    public void insert(CalendarioModel pr, String tabela) {
        try {
            con = ConnectionFactoryModel.getConnection();
            stm = con.prepareStatement("INSERT INTO " + tabela + " (disciplina, data, descricao) VALUES (?, ?, ?)");
            stm.setInt(1,pr.getDisciplina());
            stm.setString(2, pr.getData());
            stm.setString(3, pr.getDescricao());
            stm.executeUpdate();

            JOptionPane.showConfirmDialog(null, "Inserção feita com sucesso!", "SGDA - Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Houve algum erro durante a inserção!\n\nInformações técnicas sobre o erro: " + ex, "SGDA - Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
            
        } finally {
            ConnectionFactoryModel.closeConnection(con, stm);
        }
    }

    @Override
    public void delete(CalendarioModel pr, String tabela) {
        try {
            con = ConnectionFactoryModel.getConnection();
            stm = con.prepareStatement("DELETE FROM " + tabela + " WHERE disciplina = ?");
            stm.setInt(1, pr.getDisciplina());
            stm.executeUpdate();
            
            JOptionPane.showConfirmDialog(null, "Remoção feita com sucesso!", "SGDA - Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Houve algum erro durante a remoção!\n\nInformações técnicas sobre o erro: " + ex, "SGDA - Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
        
        } finally {
            ConnectionFactoryModel.closeConnection(con, stm);
        }
    }

    @Override
    public void update(CalendarioModel pr, String tabela) {
        try {
            con = ConnectionFactoryModel.getConnection();
            stm = con.prepareStatement("UPDATE " + tabela + " SET disciplina = ?, data = ?, descricao = ? WHERE disciplina = ?");
            stm.setInt(1, pr.getDisciplina());
            stm.setString(2, pr.getData());
            stm.setString(3, pr.getDescricao());
            stm.setInt(4, pr.getDisciplina());
            stm.executeUpdate();
            
            JOptionPane.showConfirmDialog(null, "Alteração feita com sucesso!", "SGDA - Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Houve algum erro durante a atualização!\n\nInformações técnicas sobre o erro: " + ex, "SGDA - Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
            
        } finally {
            ConnectionFactoryModel.closeConnection(con, stm);
        }
    }
    
}
