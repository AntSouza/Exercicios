public class DisciplinaGraduacao extends Disciplina{
    private int quantidadeAlunos;
    
    public DisciplinaGraduacao(String n, String c, int qa){
        super(n,c);
        this.setQuantidadeAlunos(qa);
    }
    
    public void setQuantidadeAlunos(int qa){
        this.quantidadeAlunos = qa;
    }
    public int getQuantidadeAlunos(){
        return this.quantidadeAlunos;
    }
}
