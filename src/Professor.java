public class Professor {
    private String nome;
    private int idade;
    private int matricula;
    
    public void setNome(String n){
        this.nome = n;
    }
    public String getNome(){
        return this.nome;
    }
    public void setIdade(int i){
        this.idade = i;
    }
    public int getIdade(){
        return this.idade;
    }
    public void setMatricula(int m){
        this.matricula = m;
    }
    public int getMatricula(){
        return this.matricula;
    }
}
