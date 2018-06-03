package sgda.model;

public class PessoaContatoModel {

    private int pessoa;
    private String contato;

    public PessoaContatoModel(int pessoa, String contato) {
        this.pessoa = pessoa;
        this.contato = contato;
    }

    public PessoaContatoModel() { }

    public int getPessoa() {
        return pessoa;
    }

    public void setPessoa(int pessoa) {
        this.pessoa = pessoa;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }
}
