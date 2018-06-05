package sgda.dao;

import java.util.List;
import javax.swing.table.TableModel;
import sgda.model.PessoaModel;

public interface InterfacePessoaDAO {
    
    public List selectForCombo(String coluna); 
    
    public List selectForComboTexto(String coluna, String texto); 
            
    public List selectForComboPerfil(String coluna, String perfil); 
    
    public TableModel select(String tabela);
    
    public TableModel pesquisarPessoas(String tabela, String texto);
        
    public void insert(PessoaModel p, String tabela);
    
    public void update(PessoaModel p, String tabela);

    public void delete(PessoaModel p, String tabela);  
}
