package sgda.dao;

import sgda.model.ProfessorModel;

public interface InterfaceProfessorDAO {
    
    public void insert(ProfessorModel pr, String tabela);
    
    public void delete(ProfessorModel pr, String tabela);
    
    public void update(ProfessorModel pr, String tabela);       
}
