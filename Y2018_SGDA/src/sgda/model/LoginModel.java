package sgda.model;

public class LoginModel {
    
    private int matricula, qtdAcesso;
    private String usuario, senha, email;

    public LoginModel(int matricula, int qtdAcesso, String usuario, String senha, String email) {
        this.matricula = matricula;
        this.qtdAcesso = qtdAcesso;
        this.usuario = usuario;
        this.senha = senha;
        this.email = email;
    }

    public LoginModel() { }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getQtdAcesso() {
        return qtdAcesso;
    }

    public void setQtdAcesso(int qtdAcesso) {
        this.qtdAcesso = qtdAcesso;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }  
}
