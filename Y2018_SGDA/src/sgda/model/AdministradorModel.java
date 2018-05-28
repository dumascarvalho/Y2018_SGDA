package sgda.model;

import java.math.BigDecimal;

public class AdministradorModel extends PessoaModel {
    private String dtadmissao, banco, agencia, conta;
    private BigDecimal salario;

    public AdministradorModel(String dtadmissao, String banco, String agencia, String conta, BigDecimal salario, int matricula, int numero, String nome, String dtnascimento, String bairro, String cidade, String rua, String estado, String cep, String perfil, String genero, String rg, String cpf, String email) {
        super(matricula, numero, nome, dtnascimento, bairro, cidade, rua, estado, cep, perfil, genero, rg, cpf, email);
        this.dtadmissao = dtadmissao;
        this.banco = banco;
        this.agencia = agencia;
        this.conta = conta;
        this.salario = salario;
    }
    
    public AdministradorModel() { }    
    
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

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    } 
}
