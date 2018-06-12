package sgda.controller;

import javax.swing.JOptionPane;
import sgda.dao.LoginDAO;
import sgda.dao.PessoaDAO;
import sgda.model.LoginModel;
import sgda.view.TelaRedefinirSenhaView;
import sgda.view.TelaPrincipalView;

public class DadosLoginController {

    public void primeiroAcesso(LoginModel dadosLogin) {

        LoginDAO daoLogin = new LoginDAO();
        
        if (dadosLogin.getQtdAcesso() == -1) {
            JOptionPane.showConfirmDialog(null, "Primeiro acesso detectado, favor alterar a senha.\nApós sua senha ter sido alterada, basta realizar um novo login com a mesma.", "SGDA - Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);          
            TelaRedefinirSenhaView senha = new TelaRedefinirSenhaView();
            senha.pack();
            senha.primeiroAcesso(dadosLogin);
            senha.setVisible(true);
            daoLogin.incrementarAcesso(dadosLogin.getMatricula());
            
        } else {     
            daoLogin.incrementarAcesso(dadosLogin.getMatricula());
            acessarTelaPrincipal(dadosLogin);
        }
    }
    
    private void acessarTelaPrincipal(LoginModel dadosLogin) {      
        PessoaDAO daoPessoa = new PessoaDAO();
        TelaPrincipalView principal = new TelaPrincipalView(dadosLogin, daoPessoa.select(dadosLogin.getMatricula()));  
        
        principal.pack();
        principal.setVisible(true);       
    }    
}
