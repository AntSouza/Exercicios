public class AlunoPosGraduacao extends Aluno{
    private Disciplina disciplinaCursada;
    
    public AlunoPosGraduacao(String n, String m, Disciplina d){
        super(n,m);
        this.setDisciplinaCursada(d);
    }
    
    public void setDisciplinaCursada(Disciplina d){
        this.disciplinaCursada = d;
    }
    public Disciplina getDisciplinaCursada(){
        return this.disciplinaCursada;
    }
}
