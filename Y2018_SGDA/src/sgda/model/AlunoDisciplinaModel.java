package sgda.model;

public class AlunoDisciplinaModel {
    private int aluno, disciplina;
    
    public AlunoDisciplinaModel (int aluno, int disciplina) {
        this.aluno = aluno;
        this.disciplina = disciplina;
    }
    
    public AlunoDisciplinaModel() { }

    public int getAluno() {
        return aluno;
    }

    public void setAluno(int aluno) {
        this.aluno = aluno;
    }

    public int getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(int disciplina) {
        this.disciplina = disciplina;
    }
}
