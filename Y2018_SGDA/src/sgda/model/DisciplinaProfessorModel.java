package sgda.model;

public class DisciplinaProfessorModel {
    
    private int disciplina, professor;

    public DisciplinaProfessorModel(int disciplina, int professor) {
        this.disciplina = disciplina;
        this.professor = professor;
    }

    public DisciplinaProfessorModel() { }

    public int getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(int disciplina) {
        this.disciplina = disciplina;
    }

    public int getProfessor() {
        return professor;
    }

    public void setProfessor(int professor) {
        this.professor = professor;
    }
}
