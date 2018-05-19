package sgda.dao;

import sgda.model.PessoaModel;

public interface InterfacePessoaDAO {
    
    public void select();
    
    public void create(PessoaModel p);
    
    public void update(PessoaModel p);

    public void delete(PessoaModel p);  
}
