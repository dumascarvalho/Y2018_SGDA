package sgda.dao;

import javax.swing.table.TableModel;
import sgda.model.PessoaModel;

public interface InterfacePessoaDAO {
    
    public TableModel select(String tabela);
    
    public void insert(PessoaModel p, String tabela);
    
    public void update(PessoaModel p, String tabela);

    public void delete(PessoaModel p, String tabela);  
}
