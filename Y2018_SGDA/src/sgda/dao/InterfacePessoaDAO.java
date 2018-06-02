package sgda.dao;

import java.util.List;
import javax.swing.table.TableModel;
import sgda.model.PessoaModel;

public interface InterfacePessoaDAO {
    
    public TableModel select(String tabela);

    public List selectForCombo(String coluna, String perfil);
    
    public List selectForCombo(String coluna, String perfil, String texto);
    
    public TableModel pesquisarPessoas(String tabela, String texto);
    
    public void insert(PessoaModel p, String tabela);
    
    public void update(PessoaModel p, String tabela);

    public void delete(PessoaModel p, String tabela);  
}
