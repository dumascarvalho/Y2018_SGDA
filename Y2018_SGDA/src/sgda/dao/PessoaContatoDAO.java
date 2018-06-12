package sgda.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import sgda.model.ConnectionFactoryModel;
import sgda.model.FormatarCamposModel;
import sgda.model.PessoaContatoModel;

public class PessoaContatoDAO implements InterfacePessoaContatoDAO {

    private PreparedStatement stm = null;
    private ResultSet rs = null;
    private Connection con = null;
    boolean duplicado = false;
    
    @Override
    public TableModel selectForTable() {
        
        try {
            con = ConnectionFactoryModel.getConnection();
            stm = con.prepareStatement("SELECT matricula, perfil, nome, contato \n" +
            "FROM pessoa p \n" +
            "JOIN pessoa_contato pc ON (p.matricula = pc.pessoa) \n" +
            "ORDER BY perfil, nome");
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
            stm = con.prepareStatement("SELECT matricula, perfil, nome, contato \n" +
            "FROM pessoa p \n" +
            "JOIN pessoa_contato pc ON (p.matricula = pc.pessoa) \n" +
            "WHERE UPPER(nome) LIKE UPPER('" + texto + "%') \n" +
            "ORDER BY perfil, nome");
            rs = stm.executeQuery();

            return FormatarCamposModel.colocarDadosTabela(rs);

        } catch (SQLException ex) {
            throw new RuntimeException("Exceção: " + ex);

        } finally {
            ConnectionFactoryModel.closeConnection(con, stm, rs);
        }
    }

    @Override
    public void insert(PessoaContatoModel pc) {
        
        try {
            con = ConnectionFactoryModel.getConnection();
            stm = con.prepareStatement("SELECT * FROM pessoa_contato");
            rs = stm.executeQuery();
            
            while (rs.next()) {                
                if (pc.getPessoa()== rs.getInt("pessoa") && pc.getContato().equals(rs.getString("contato"))) {
                    duplicado = true;
                }                
            }
            
            stm = null;
            
            if (duplicado == false) {
                stm = con.prepareStatement("INSERT INTO pessoa_contato (pessoa, contato) VALUES (?, ?)");
                stm.setInt(1, pc.getPessoa());
                stm.setString(2, pc.getContato());
                stm.executeUpdate();

                JOptionPane.showConfirmDialog(null, "Inserção feita com sucesso!", "SGDA - Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
            
            } else {
                JOptionPane.showConfirmDialog(null, "Não foi possível realizar a inserção!\nMotivo: a relação informada já existe.", "SGDA - Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE);
            }
        } catch (Exception ex) {
            JOptionPane.showConfirmDialog(null, "Houve algum erro durante a inserção!\n\nInformações técnicas sobre o erro: " + ex, "SGDA - Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);

        } finally {
            ConnectionFactoryModel.closeConnection(con, stm, rs);
        }
    }

    @Override
    public void delete(PessoaContatoModel pc) {
        
        try {
            con = ConnectionFactoryModel.getConnection();
            stm = con.prepareStatement("DELETE FROM pessoa_contato WHERE pessoa = ? AND contato = ?");
            stm.setInt(1, pc.getPessoa());
            stm.setString(2, pc.getContato());
            stm.executeUpdate();

            JOptionPane.showConfirmDialog(null, "Remoção feita com sucesso!", "SGDA - Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception ex) {
            JOptionPane.showConfirmDialog(null, "Houve algum erro durante a remoção!\n\nInformações técnicas sobre o erro: " + ex, "SGDA - Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);

        } finally {
            ConnectionFactoryModel.closeConnection(con, stm, rs);
        }
    }

    @Override
    public void update(PessoaContatoModel pc, PessoaContatoModel pcu) {
        
        try {
            con = ConnectionFactoryModel.getConnection();
            stm = con.prepareStatement("SELECT * FROM pessoa_contato");
            rs = stm.executeQuery();
            
            while (rs.next()) {                
                if (pc.getPessoa()== rs.getInt("pessoa") && pc.getContato().equals(rs.getString("contato"))) {
                    duplicado = true;
                }                
            }
            
            stm = null;
            
            if (duplicado == false) {
                stm = con.prepareStatement("UPDATE pessoa_contato SET pessoa = ?, contato = ? WHERE pessoa = ? AND contato = ?");
                stm.setInt(1, pc.getPessoa());
                stm.setString(2, pc.getContato());
                stm.setInt(3, pcu.getPessoa());
                stm.setString(4, pcu.getContato());
                stm.executeUpdate();

                JOptionPane.showConfirmDialog(null, "Atualização feita com sucesso!", "SGDA - Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
            
            } else {
                JOptionPane.showConfirmDialog(null, "Não foi possível realizar a inserção!\nMotivo: a relação informada já existe.", "SGDA - Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE);
            }
        } catch (Exception ex) {
            JOptionPane.showConfirmDialog(null, "Houve algum erro durante a atualização!\n\nInformações técnicas sobre o erro: " + ex, "SGDA - Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);

        } finally {
            ConnectionFactoryModel.closeConnection(con, stm, rs);
        }
    }
}
