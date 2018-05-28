package sgda.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import sgda.model.ConnectionFactoryModel;
import sgda.model.ProfessorModel;

public class ProfessorDAO implements InterfaceProfessorDAO {
    
    private PreparedStatement stm = null;
    private Connection con = null; 

    @Override
    public void insert(ProfessorModel pr, String tabela) {
        try {
            con = ConnectionFactoryModel.getConnection();
            stm = con.prepareStatement("INSERT INTO " + tabela + " (matricula, dt_admissao, salario, banco, agencia, conta, formacao, nivel) VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
            stm.setInt(1, pr.getMatricula());
            stm.setString(2, pr.getDtadmissao());
            stm.setString(3, pr.getSalario().toString());
            stm.setString(4, pr.getBanco());
            stm.setString(5, pr.getAgencia());
            stm.setString(6, pr.getConta());
            stm.setString(7, pr.getFormacao());
            stm.setString(8, pr.getNivel());
            stm.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Houve algum erro durante a inserção!\n\nInformações técnicas sobre o erro: " + ex, "SGDA - Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
            
        } finally {
            ConnectionFactoryModel.closeConnection(con, stm);
        }
    }

    @Override
    public void delete(ProfessorModel pr, String tabela) {
        try {
            con = ConnectionFactoryModel.getConnection();
            stm = con.prepareStatement("DELETE FROM " + tabela + " WHERE matricula = ?");
            stm.setInt(1, pr.getMatricula());
            stm.executeUpdate();
        
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Houve algum erro durante a remoção!\n\nInformações técnicas sobre o erro: " + ex, "SGDA - Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
        
        } finally {
            ConnectionFactoryModel.closeConnection(con, stm);
        }
    }

    @Override
    public void update(ProfessorModel pr, String tabela) {
        try {
            con = ConnectionFactoryModel.getConnection();
            stm = con.prepareStatement("UPDATE " + tabela + " SET dt_admissao = ?, salario = ?, banco = ?, agencia = ?, conta = ?, formacao = ?, nivel = ? WHERE matricula = ?");
            stm.setString(1, pr.getDtadmissao());
            stm.setString(2, pr.getSalario().toString());
            stm.setString(3, pr.getBanco());
            stm.setString(4, pr.getAgencia());
            stm.setString(5, pr.getConta());
            stm.setString(6, pr.getFormacao());
            stm.setString(7, pr.getNivel());
            stm.setInt(8, pr.getMatricula());
            stm.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Houve algum erro durante a atualização!\n\nInformações técnicas sobre o erro: " + ex, "SGDA - Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
            
        } finally {
            ConnectionFactoryModel.closeConnection(con, stm);
        }
    }
}