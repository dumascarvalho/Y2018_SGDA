package sgda.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import sgda.model.AlunoModel;
import sgda.model.ConnectionFactoryModel;

public class AlunoDAO implements InterfaceAlunoDAO {
    
    private PreparedStatement stm = null;
    private Connection con = null; 

    @Override
    public void insert(AlunoModel al, String tabela) {
        try {
            con = ConnectionFactoryModel.getConnection();
            stm = con.prepareStatement("INSERT INTO " + tabela + " (matricula, dt_matricula, situacao, curso) VALUES (?, ?, ?, ?)");
            stm.setInt(1, al.getMatricula());
            stm.setString(2, al.getDtmatricula());
            stm.setString(3, al.getSituacao());
            stm.setInt(4, al.getCurso());
            stm.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Houve algum erro durante a inserção!\n\nInformações técnicas sobre o erro: " + ex, "SGDA - Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
            
        } finally {
            ConnectionFactoryModel.closeConnection(con, stm);
        }
    }

    @Override
    public void delete(AlunoModel al, String tabela) {
       
    }

    @Override
    public void update(AlunoModel al, String tabela) {
       
    }
    
}
