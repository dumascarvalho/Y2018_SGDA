package sgda.model;

public class AlunoModel extends PessoaModel {
    private String dtmatricula, situacao;
    private int curso;

    public AlunoModel(String dtmatricula, String situacao, int curso, int matricula, int numero, String nome, String dtnascimento, String bairro, String cidade, String rua, String estado, String cep, String perfil, String genero, String rg, String cpf, String email) {
        super(matricula, numero, nome, dtnascimento, bairro, cidade, rua, estado, cep, perfil, genero, rg, cpf, email);
        this.dtmatricula = dtmatricula;
        this.situacao = situacao;
        this.curso = curso;
    }
    
    public AlunoModel() { }

    public String getDtmatricula() {
        return dtmatricula;
    }

    public void setDtmatricula(String dtmatricula) {
        this.dtmatricula = dtmatricula;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }  
}
