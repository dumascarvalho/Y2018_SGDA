package sgda.model;

public class CursoModel {
    
    private int codCurso, cargaHoras;
    private String descricao, periodo;

    public CursoModel(int codCurso, int cargaHoras, String descricao, String periodo) {
        this.codCurso = codCurso;
        this.cargaHoras = cargaHoras;
        this.descricao = descricao;
        this.periodo = periodo;
    }
    
    public CursoModel() { }

    public int getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(int codCurso) {
        this.codCurso = codCurso;
    }

    public int getCargaHoras() {
        return cargaHoras;
    }

    public void setCargaHoras(int cargaHoras) {
        this.cargaHoras = cargaHoras;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
    
    
    
}
