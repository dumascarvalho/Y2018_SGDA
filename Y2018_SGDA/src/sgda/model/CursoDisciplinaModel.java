package sgda.model;

public class CursoDisciplinaModel {

    private int curso, disciplina;

    public CursoDisciplinaModel(int curso, int disciplina) {
        this.curso = curso;
        this.disciplina = disciplina;
    }
    
    public CursoDisciplinaModel() { }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public int getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(int disciplina) {
        this.disciplina = disciplina;
    }
}
