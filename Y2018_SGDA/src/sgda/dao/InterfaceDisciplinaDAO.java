package sgda.dao;

import java.util.List;
import javax.swing.table.TableModel;
import sgda.model.DisciplinaModel;

public interface InterfaceDisciplinaDAO {
  
    public List selectForCombo(String coluna); 
       
    public TableModel selectForTable();
    
    public TableModel selectForTable(String texto);
    
    public void insert(DisciplinaModel ds);
    
    public void delete(DisciplinaModel ds);
    
    public void update(DisciplinaModel ds);  
}
