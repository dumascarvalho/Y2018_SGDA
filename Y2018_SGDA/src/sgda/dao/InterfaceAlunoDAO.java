package sgda.dao;

import sgda.model.AlunoModel;

public interface InterfaceAlunoDAO {
    
    public void insert(AlunoModel al, String tabela);
    
    public void delete(AlunoModel al, String tabela);
    
    public void update(AlunoModel al, String tabela);   
}
