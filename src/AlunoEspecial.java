public class AlunoEspecial extends Aluno{    
    private Disciplina disciplinaAtual;  
    
    public AlunoEspecial(String n, String m,Disciplina da){
        super(n,m);
        this.setDisciplinaAtual(da);
    }
    public Disciplina getDisciplinaAtual(){
        return this.disciplinaAtual;
    }
    public void setDisciplinaAtual(Disciplina da){
        this.disciplinaAtual = da;
    }
}
