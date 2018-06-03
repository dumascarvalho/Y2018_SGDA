package sgda.dao;

import java.util.List;
import javax.swing.table.TableModel;
import sgda.model.PessoaContatoModel;

public interface InterfacePessoaContatoDAO {
    
    public List selectForCombo(String coluna);
    
    public List selectForCombo(String coluna, String texto);
    
    public TableModel selectForTable();
    
    public void insert(PessoaContatoModel pc);
    
    public void delete(PessoaContatoModel pc);
    
    public void update(PessoaContatoModel pc, PessoaContatoModel pcu);  
}
