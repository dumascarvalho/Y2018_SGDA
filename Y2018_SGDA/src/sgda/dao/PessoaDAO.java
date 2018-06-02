package sgda.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import sgda.model.PessoaModel;
import sgda.model.AdministradorModel;
import sgda.model.AlunoModel;
import sgda.model.ConnectionFactoryModel;
import sgda.model.FormatarCamposModel;
import sgda.model.ProfessorModel;

public class PessoaDAO implements InterfacePessoaDAO {

    private PreparedStatement stm = null;
    private ResultSet rs = null;  
    private Connection con = null; 
    
    @Override
    public TableModel select(String tabela) {  
        
        try {
            con = ConnectionFactoryModel.getConnection();
                    
            if(!"pessoa".equals(tabela)) {
                stm = con.prepareStatement("SELECT * FROM pessoa AS a INNER JOIN " + tabela + " AS b ON a.matricula = b.matricula");
            } else {
                stm = con.prepareStatement("SELECT * FROM pessoa");
            }
            
            rs = stm.executeQuery();       
            
            return FormatarCamposModel.colocarDadosTabela(rs);
            
        } catch (SQLException ex) {
            throw new RuntimeException("Exceção: " + ex);
            
        } finally {
            ConnectionFactoryModel.closeConnection(con, stm, rs);
        }
    }

    @Override
    public void insert(PessoaModel p, String tabela) {
        
        try {
            con = ConnectionFactoryModel.getConnection();
            stm = con.prepareStatement("INSERT INTO pessoa (nome, perfil, genero, dt_nascimento, rg, cpf, cep, numero, rua, bairro, cidade, estado) VALUES (?, ? , ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            stm.setString(1, p.getNome());
            stm.setString(2, p.getPerfil());
            stm.setString(3, p.getGenero());
            stm.setString(4, p.getDtnascimento());
            stm.setString(5, p.getRg());
            stm.setString(6, p.getCpf());
            stm.setString(7, p.getCep());
            stm.setInt(8, p.getNumero());
            stm.setString(9, p.getRua());
            stm.setString(10, p.getBairro());
            stm.setString(11, p.getCidade());
            stm.setString(12, p.getEstado());
            stm.executeUpdate();          
            
            con = ConnectionFactoryModel.getConnection();
            stm = con.prepareStatement("SELECT MAX(matricula) AS matricula FROM pessoa");
            rs = stm.executeQuery();  
            
            while(rs.next()) {
                p.setMatricula(rs.getInt("matricula")); 
            }                 
            
            switch(tabela) {
                case "administrador":
                    AdministradorDAO ad = new AdministradorDAO();
                    ad.insert((AdministradorModel) p, tabela);
                    break;
                    
                case "aluno":
                    AlunoDAO al = new AlunoDAO();
                    al.insert((AlunoModel) p, tabela);
                    break;
                    
                case "professor":
                    ProfessorDAO pr = new ProfessorDAO();
                    pr.insert((ProfessorModel) p, tabela);
                    break;
            }
            
            JOptionPane.showConfirmDialog(null, "Inserção feita com sucesso!", "SGDA - Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
            
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Houve algum erro durante a inserção!\n\nInformações técnicas sobre o erro: " + ex, "SGDA - Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
            
        } finally {
            ConnectionFactoryModel.closeConnection(con, stm, rs);
        }
    }

    @Override
    public void update(PessoaModel p, String tabela) {
       
        try {
            con = ConnectionFactoryModel.getConnection();
            stm = con.prepareStatement("UPDATE pessoa SET nome = ?, perfil = ?, genero = ?, dt_nascimento = ?, rg = ?, cpf = ?, cep = ?, numero = ?, rua = ?, bairro = ?, cidade = ?, estado = ? WHERE matricula = ?");
            stm.setString(1, p.getNome());
            stm.setString(2, p.getPerfil());
            stm.setString(3, p.getGenero());
            stm.setString(4, p.getDtnascimento());
            stm.setString(5, p.getRg());
            stm.setString(6, p.getCpf());
            stm.setString(7, p.getCep());
            stm.setInt(8, p.getNumero());
            stm.setString(9, p.getRua());
            stm.setString(10, p.getBairro());
            stm.setString(11, p.getCidade());
            stm.setString(12, p.getEstado());
            stm.setInt(13, p.getMatricula());
            stm.executeUpdate();          
                                    
            switch(tabela) {
                case "administrador":
                    AdministradorDAO ad = new AdministradorDAO();
                    ad.update((AdministradorModel) p, tabela);
                    break;
                    
                case "aluno":
                    AlunoDAO al = new AlunoDAO();
                    al.update((AlunoModel) p, tabela);
                    break;
                    
                case "professor":
                    ProfessorDAO pr = new ProfessorDAO();
                    pr.update((ProfessorModel) p, tabela);
                    break;
            }
            
            JOptionPane.showConfirmDialog(null, "Atualização feita com sucesso!", "SGDA - Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
            
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Houve algum erro durante a atualização!\n\nInformações técnicas sobre o erro: " + ex, "SGDA - Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
            
        } finally {
            ConnectionFactoryModel.closeConnection(con, stm, rs);
        }
    }

    @Override
    public void delete(PessoaModel p, String tabela) {
        
        try {
            switch (tabela) {             
                case "administrador":
                    AdministradorDAO ad = new AdministradorDAO();
                    ad.delete((AdministradorModel) p, tabela);
                    break;

                case "aluno":
                    AlunoDAO al = new AlunoDAO();
                    al.delete((AlunoModel) p, tabela);
                    break;

                case "professor":
                    ProfessorDAO pr = new ProfessorDAO();
                    pr.delete((ProfessorModel) p, tabela);
                    break;
            }
            
            con = ConnectionFactoryModel.getConnection();
            stm = con.prepareStatement("DELETE FROM pessoa WHERE matricula = ?");
            stm.setInt(1, p.getMatricula());
            stm.executeUpdate();

            JOptionPane.showConfirmDialog(null, "Remoção feita com sucesso!", "SGDA - Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Houve algum erro durante a remoção!\n\nInformações técnicas sobre o erro: " + ex, "SGDA - Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);

        } finally {
            ConnectionFactoryModel.closeConnection(con, stm, rs);
        }
    }

    @Override
    public TableModel pesquisarPessoas(String tabela, String texto) {
        try {
            con = ConnectionFactoryModel.getConnection();
            
            if(!"pessoa".equals(tabela)) {
                stm = con.prepareStatement("SELECT * FROM pessoa AS a INNER JOIN " + tabela + " AS b ON a.matricula = b.matricula WHERE a.nome LIKE '" + texto + "%'");
            } else {
                stm = con.prepareStatement("SELECT * FROM pessoa");
            }

            rs = stm.executeQuery();       
            
            return FormatarCamposModel.colocarDadosTabela(rs);
            
        } catch (SQLException ex) {
            throw new RuntimeException("Exceção: " + ex);
            
        } finally {
            ConnectionFactoryModel.closeConnection(con, stm, rs);
        }
    }
}