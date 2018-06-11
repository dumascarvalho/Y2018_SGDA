package sgda.dao;

import sgda.model.LoginModel;

public interface InterfaceLoginDAO {
       
    public boolean autenticar(LoginModel lo);  
    
    public void update(LoginModel lo);
}
