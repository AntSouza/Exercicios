public class Gerente extends Funcionario{
    private String nomeDepto;
    
    public Gerente(String n, String m, String nd){
        super(n, m);
        this.setNomeDepto(nd);
    }
    
    public void setNomeDepto(String nd){
        this.nomeDepto = nd;
    }
    public String getNomeDepto(){
        return this.nomeDepto;
    }
}
