package sgda.model;

import java.math.BigDecimal;

public class ProfessorModel extends PessoaModel {
    private String dtadmissao, banco, agencia, conta, formacao, nivel;
    private BigDecimal salario;

    public ProfessorModel(String dtadmissao, String banco, String agencia, String conta, String formacao, String nivel, BigDecimal salario, int matricula, int numero, String nome, String dtnascimento, String bairro, String cidade, String rua, String estado, String cep, String perfil, String genero, String rg, String cpf, String email) {
        super(matricula, numero, nome, dtnascimento, bairro, cidade, rua, estado, cep, perfil, genero, rg, cpf, email);
        this.dtadmissao = dtadmissao;
        this.banco = banco;
        this.agencia = agencia;
        this.conta = conta;
        this.formacao = formacao;
        this.nivel = nivel;
        this.salario = salario;
    }
    
    public ProfessorModel() { }

    public String getDtadmissao() {
        return dtadmissao;
    }

    public void setDtadmissao(String dtadmissao) {
        this.dtadmissao = dtadmissao;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }
}
