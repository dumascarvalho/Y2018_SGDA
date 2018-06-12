package sgda.model;

public class CalendarioModel {
    private int disciplina;
    private String data, descricao;
    
    public CalendarioModel (int disciplina, String data, String descricao) {
       this.disciplina = disciplina;
       this.data = data;
       this.descricao = descricao;
    }

    public int getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(int disciplina) {
        this.disciplina = disciplina;
    }
    
    public CalendarioModel() { };

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    
}
