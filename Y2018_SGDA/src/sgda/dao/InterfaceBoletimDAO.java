package sgda.dao;

import sgda.model.BoletimModel;

public interface InterfaceBoletimDAO {
    public void insert(BoletimModel bo);
    
    public void delete(BoletimModel bo);
    
    public void update(BoletimModel bo); 
}
