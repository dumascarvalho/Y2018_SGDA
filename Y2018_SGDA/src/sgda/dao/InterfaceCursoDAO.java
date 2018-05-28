package sgda.dao;

import java.util.List;
import javax.swing.table.TableModel;
import sgda.model.CursoModel;

public interface InterfaceCursoDAO {
    
    public List selectForCombo(String coluna); 
    
    public TableModel selectForTable();
    
    public void insert(CursoModel cr);
    
    public void delete(CursoModel cr);
    
    public void update(CursoModel cr);     
}
