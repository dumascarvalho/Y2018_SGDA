package sgda.dao;

import java.util.List;
import sgda.model.ProfessorModel;

public interface InterfaceProfessorDAO {
    
    public List selectForCombo(String coluna, String tabela);
    
    public void insert(ProfessorModel pr, String tabela);
    
    public void delete(ProfessorModel pr, String tabela);
    
    public void update(ProfessorModel pr, String tabela);       
}
