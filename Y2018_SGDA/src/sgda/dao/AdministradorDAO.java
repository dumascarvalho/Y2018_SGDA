package sgda.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import sgda.model.AdministradorModel;
import sgda.model.ConnectionFactoryModel;

public class AdministradorDAO implements InterfaceAdministradorDAO {
    
    private PreparedStatement stm = null;
    private Connection con = null; 

    @Override
    public void insert(AdministradorModel ad, String tabela) {
        try {
            con = ConnectionFactoryModel.getConnection();
            stm = con.prepareStatement("INSERT INTO " + tabela + " (matricula, dt_admissao, salario, banco, agencia, conta) VALUES (?, ?, ?, ?, ?, ?)");
            stm.setInt(1, ad.getMatricula());
            stm.setString(2, ad.getDtadmissao());
            stm.setString(3, ad.getSalario().toString());
            stm.setString(4, ad.getBanco());
            stm.setString(5, ad.getAgencia());
            stm.setString(6, ad.getConta());
            stm.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Houve algum erro durante a inserção!\n\nInformações técnicas sobre o erro: " + ex, "SGDA - Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
            
        } finally {
            ConnectionFactoryModel.closeConnection(con, stm);
        }
    }

    @Override
    public void delete(AdministradorModel ad, String tabela) {

    }

    @Override
    public void update(AdministradorModel ad, String tabela) {

    }    
}
