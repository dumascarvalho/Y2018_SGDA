package sgda.model;

public class BoletimModel {
    private int aluno, disciplina;
    private float nota, frequencia;
    
    public BoletimModel(int aluno, int disciplina, float nota, float frequencia) {
        this.aluno = aluno;
        this.disciplina = disciplina;
        this.nota = nota;
        this.frequencia = frequencia;
    }
    
    public BoletimModel () { }

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

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public float getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(float frequencia) {
        this.frequencia = frequencia;
    }
}
