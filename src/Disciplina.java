public class Disciplina {
    private String nome;
    private String codDisciplina;
    
    public Disciplina(String n, String c){
        this.setNome(n);        
        this.setCodDisciplina(c);
    }
    
    public void setNome(String n){
        this.nome = n;
    }
    public String getNome(){
        return this.nome;
    }            
    public void setCodDisciplina(String c){
        this.codDisciplina = c;
    }
    public String getCodDisciplina(){
        return this.codDisciplina;
    }
    
}
