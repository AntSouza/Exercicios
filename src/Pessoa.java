public class Pessoa {
    private String nome;
    private String endereco;
    private String telefone;
    
    public Pessoa(String n, String e, String t){
        this.setNome(n);
        this.setEndereco(e);
        this.setTelefone(t);        
    }
    
    public void setNome(String n){
        this.nome = n;
    }
    public String getNome(){
        return this.nome;
    }
    public void setEndereco(String e){
        this.endereco = e;
    }
    public String getEndereco(){
        return this.endereco;
    }
    public void setTelefone(String t){
        this.telefone = t;
    }
    public String getTelefone(){
        return this.telefone;
    }
}
