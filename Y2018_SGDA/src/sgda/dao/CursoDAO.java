package sgda.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.TableModel;
import sgda.model.ConnectionFactoryModel;
import sgda.model.CursoModel;
import sgda.model.FormatarCamposModel;

public class CursoDAO implements InterfaceCursoDAO {

    private PreparedStatement stm = null;
    private ResultSet rs = null;  
    private Connection con = null; 
    
    @Override
    public List selectForCombo(String coluna) {
        
        try {        
            List <String> listColuna = new ArrayList();
            
            con = ConnectionFactoryModel.getConnection();
            stm = con.prepareStatement("SELECT * FROM curso");
            rs = stm.executeQuery();       
            
            while(rs.next()) {            
                listColuna.add(rs.getString(coluna)); 
            }
            
            return listColuna;
            
        } catch (SQLException ex) {
            throw new RuntimeException("Exceção: " + ex);
            
        } finally {
            ConnectionFactoryModel.closeConnection(con, stm, rs);
        } 
    }

    @Override
    public TableModel selectForTable() {
        try {
            con = ConnectionFactoryModel.getConnection();
            stm = con.prepareStatement("SELECT * FROM curso");
            rs = stm.executeQuery();       
            
            return FormatarCamposModel.colocarDadosTabela(rs);
            
        } catch (SQLException ex) {
            throw new RuntimeException("Exceção: " + ex);
            
        } finally {
            ConnectionFactoryModel.closeConnection(con, stm, rs);
        }
    }

    @Override
    public void insert(CursoModel cr) {
       
    }

    @Override
    public void delete(CursoModel cr) {
       
    }

    @Override
    public void update(CursoModel cr) {
      
    }   
}