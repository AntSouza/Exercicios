public class Aluno {
    private String nome;
    private String matricula;
    
    public Aluno(String n, String m){
        this.setNome(n);
        this.setMatricula(m);
    }
    
    public void setNome(String n){
        this.nome = n;
    }
    public String getNome(){
        return this.nome;
    }
    public void setMatricula(String m){
        this.matricula = m;
    }
    public String getMatricula(){
        return this.matricula;
    }
}
