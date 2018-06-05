package sgda.dao;

import javax.swing.table.TableModel;
import sgda.model.CursoDisciplinaModel;

public interface InterfaceCursoDisciplinaDAO {
    
    public TableModel selectForTable();
    
    public TableModel selectForTable(String texto);
    
    public void insert(CursoDisciplinaModel cd);
    
    public void delete(CursoDisciplinaModel cd);
    
    public void update(CursoDisciplinaModel cd, CursoDisciplinaModel cdu);   
}
