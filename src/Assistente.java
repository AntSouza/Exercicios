public class Assistente extends Funcionario {
    private Gerente surpervisor;
    
    public Assistente(String n, String m, Gerente s){
        super(n,m);
        this.surpervisor = s;
    }        
            
    public void setSurpervisor(Gerente s){
        this.surpervisor = s;
    } 
    public Gerente getSurpervisor(){
        return this.surpervisor;
    }
}
