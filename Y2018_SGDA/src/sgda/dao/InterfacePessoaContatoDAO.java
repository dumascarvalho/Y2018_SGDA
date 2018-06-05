package sgda.dao;

import javax.swing.table.TableModel;
import sgda.model.PessoaContatoModel;

public interface InterfacePessoaContatoDAO {
           
    public TableModel selectForTable();
    
    public TableModel selectForTable(String texto);
    
    public void insert(PessoaContatoModel pc);
    
    public void delete(PessoaContatoModel pc);
    
    public void update(PessoaContatoModel pc, PessoaContatoModel pcu);  
}
