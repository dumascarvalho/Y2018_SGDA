package sgda.model;

public class PessoaModel {
    
    private int matricula, numero;
    private String nome, dtnascimento, bairro, cidade, rua, estado, cep, perfil, genero, rg, cpf;

    public PessoaModel(int matricula, int numero, String nome, String dtnascimento, String bairro, String cidade, String rua, String estado, String cep, String perfil, String genero, String rg, String cpf, String email) {
        this.matricula = matricula;
        this.numero = numero;
        this.nome = nome;
        this.dtnascimento = dtnascimento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.rua = rua;
        this.estado = estado;
        this.cep = cep;
        this.perfil = perfil;
        this.genero = genero;
        this.rg = rg;
        this.cpf = cpf;
    }
    
    public PessoaModel() { }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDtnascimento() {
        return dtnascimento;
    }

    public void setDtnascimento(String dtnascimento) {
        this.dtnascimento = dtnascimento;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
