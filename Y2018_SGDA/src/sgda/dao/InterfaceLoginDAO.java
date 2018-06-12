package sgda.dao;

import sgda.model.LoginModel;

public interface InterfaceLoginDAO {
       
    public LoginModel autenticar(LoginModel lo);  
    
    public void incrementarAcesso(int matricula);
    
    public void update(LoginModel lo, String novaSenha);
}
