package sgda.model;

public class DisciplinaModel {

    private int codDisciplina, qntVagas, qntMatriculado, qntAulas;
    private String descricao, semestre, situacao;

    public DisciplinaModel(int codDisciplina, int qntVagas, int qntMatriculado, int qntAulas, String descricao, String semestre, String situacao) {
        this.codDisciplina = codDisciplina;
        this.qntVagas = qntVagas;
        this.qntMatriculado = qntMatriculado;
        this.qntAulas = qntAulas;
        this.descricao = descricao;
        this.semestre = semestre;
        this.situacao = situacao;
    }

    public DisciplinaModel() {
    }

    public int getCodDisciplina() {
        return codDisciplina;
    }

    public void setCodDisciplina(int codDisciplina) {
        this.codDisciplina = codDisciplina;
    }

    public int getQntVagas() {
        return qntVagas;
    }

    public void setQntVagas(int qntVagas) {
        this.qntVagas = qntVagas;
    }

    public int getQntMatriculado() {
        return qntMatriculado;
    }

    public void setQntMatriculado(int qntMatriculado) {
        this.qntMatriculado = qntMatriculado;
    }

    public int getQntAulas() {
        return qntAulas;
    }

    public void setQntAulas(int qntAulas) {
        this.qntAulas = qntAulas;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
}
