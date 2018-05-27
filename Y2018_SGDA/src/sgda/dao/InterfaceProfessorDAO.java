package sgda.dao;

import sgda.model.ProfessorModel;

public interface InterfaceProfessorDAO {
    
    public void insert(ProfessorModel a, String tabela);
    
    public void delete(ProfessorModel a, String tabela);
    
    public void update(ProfessorModel a, String tabela);       
}
