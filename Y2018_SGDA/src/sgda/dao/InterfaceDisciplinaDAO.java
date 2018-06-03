package sgda.dao;

import java.util.List;
import javax.swing.table.TableModel;
import sgda.model.DisciplinaModel;

public interface InterfaceDisciplinaDAO {
  
    public List selectForCombo(String coluna); 
    
    public List selectForComboRelacoes(String coluna, String curso); 
    
    public TableModel selectForTable();
    
    public void insert(DisciplinaModel ds);
    
    public void delete(DisciplinaModel ds);
    
    public void update(DisciplinaModel ds);  
}
