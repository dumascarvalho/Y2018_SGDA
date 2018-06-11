package sgda.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import sgda.model.ConnectionFactoryModel;
import sgda.model.LoginModel;

public class LoginDAO implements InterfaceLoginDAO {

    private PreparedStatement stm = null;
    private ResultSet rs = null;
    private Connection con = null;
    
    @Override
    public boolean autenticar(LoginModel lo) {
        try {
            con = ConnectionFactoryModel.getConnection();
            stm = con.prepareStatement("SELECT * FROM login WHERE usuario = ? AND senha = ?");
            stm.setString(1, lo.getUsuario());
            stm.setString(2, lo.getSenha());
            rs = stm.executeQuery();
            
            return rs.next();

        } catch (SQLException ex) {
            throw new RuntimeException("Exceção: " + ex);

        } finally {
            ConnectionFactoryModel.closeConnection(con, stm, rs);
        }     
    }

    @Override
    public void update(LoginModel lo) {
        
    }    
}
