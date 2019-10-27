public class AlunoGraduacao extends Aluno{
    private String dataDeNascimento;
    
    AlunoGraduacao(String n, String m, String dn){
        super(n,m);
        this.setDataDeNascimento(dn);
    }
    
    public void setDataDeNascimento(String dn){
        this.dataDeNascimento = dn;
    }
    public String getDataDeNascimento(){
        return this.dataDeNascimento;
    }
}
