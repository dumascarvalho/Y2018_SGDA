package sgda.dao;

import sgda.model.CalendarioModel;

public interface InterfaceCalendarioDAO {  
    public void insert(CalendarioModel pr, String tabela);
    
    public void delete(CalendarioModel pr, String tabela);
    
    public void update(CalendarioModel pr, String tabela);  
}