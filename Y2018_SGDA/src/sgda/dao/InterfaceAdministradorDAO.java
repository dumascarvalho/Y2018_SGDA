package sgda.dao;

import sgda.model.AdministradorModel;

public interface InterfaceAdministradorDAO {
    
    public void insert(AdministradorModel ad, String tabela);
    
    public void delete(AdministradorModel ad, String tabela);
    
    public void update(AdministradorModel ad, String tabela);    
}
