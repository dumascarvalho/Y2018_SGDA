package sgda.dao;

import java.util.List;
import javax.swing.table.TableModel;
import sgda.model.DisciplinaProfessorModel;

public interface InterfaceDisciplinaProfessorDAO {
        
    public List selectForCombo(String coluna, String perfil);
    
    public TableModel selectForTable();
    
    public void insert(DisciplinaProfessorModel dp);
    
    public void delete(DisciplinaProfessorModel dp);
    
    public void update(DisciplinaProfessorModel dp, DisciplinaProfessorModel dpu);    
}
