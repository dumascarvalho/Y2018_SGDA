package sgda.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import sgda.model.ConnectionFactoryModel;
import sgda.model.LoginModel;

public class LoginDAO implements InterfaceLoginDAO {

    private PreparedStatement stm = null;
    private ResultSet rs = null;
    private Connection con = null;
    private boolean existe;
    
    @Override
    public LoginModel autenticar(LoginModel lo) {
        
        try {
            con = ConnectionFactoryModel.getConnection();
            stm = con.prepareStatement("SELECT * FROM login WHERE usuario = ? AND senha = ?");
            stm.setString(1, lo.getUsuario());
            stm.setString(2, lo.getSenha());
            rs = stm.executeQuery();
            
            LoginModel dadosLogin = new LoginModel();
            
            while (rs.next()) {
                dadosLogin.setMatricula(rs.getInt("matricula"));
                dadosLogin.setPerfil(rs.getString("perfil"));
                dadosLogin.setUsuario(rs.getString("usuario"));
                dadosLogin.setSenha(rs.getString("senha"));
                dadosLogin.setEmail(rs.getString("email"));
                dadosLogin.setQtdAcesso(rs.getInt("qtd_acesso"));                
            }           
            
            return dadosLogin;

        } catch (SQLException ex) {
            throw new RuntimeException("Exceção: " + ex);

        } finally {
            ConnectionFactoryModel.closeConnection(con, stm, rs);
        }     
    }

    @Override
    public void update(LoginModel lo, String novaSenha) {

        try {
            con = ConnectionFactoryModel.getConnection();
            stm = con.prepareStatement("SELECT * FROM login");
            rs = stm.executeQuery();

            while (rs.next()) {
                if (lo.getUsuario().equals(rs.getString("usuario")) && lo.getEmail().equals(rs.getString("email"))) {
                    existe = true;
                }
            }

            stm = null;

            if (existe == true) {
                stm = con.prepareStatement("UPDATE login SET senha = ? WHERE usuario = ? AND email = ?");
                stm.setString(1, novaSenha);
                stm.setString(2, lo.getUsuario());
                stm.setString(3, lo.getEmail());
                stm.executeUpdate();

                JOptionPane.showConfirmDialog(null, "Atualização feita com sucesso!", "SGDA - Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showConfirmDialog(null, "Não foi possível aterar a senha!\nMotivo: o email e/ou usuário estão inválidos.", "SGDA - Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE);
            }
        } catch (Exception ex) {
            JOptionPane.showConfirmDialog(null, "Houve algum erro durante a atualização!\n\nInformações técnicas sobre o erro: " + ex, "SGDA - Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);

        } finally {
            ConnectionFactoryModel.closeConnection(con, stm, rs);
        }
    } 
    
    @Override
    public void incrementarAcesso(int matricula) {
        
         try {           
             con = ConnectionFactoryModel.getConnection();
             stm = con.prepareStatement("UPDATE login SET qtd_acesso = qtd_acesso + 1 WHERE matricula = '" + matricula + "'");
             stm.executeUpdate();

        } catch (Exception ex) {
            JOptionPane.showConfirmDialog(null, "Houve algum erro durante a atualização!\n\nInformações técnicas sobre o erro: " + ex, "SGDA - Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);

        } finally {
            ConnectionFactoryModel.closeConnection(con, stm, rs);
        }
    } 
}
