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
    public void delete(ProfessorModel a, String tabela) {

    }

    @Override
    public void update(ProfessorModel a, String tabela) {

    }
    
}
