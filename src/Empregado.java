public class Empregado extends Pessoa{
    private String codSetor;
    private double salarioBase;
    private double imposto;
    
    public Empregado(String n, String e,String t, String cs, double sb, double i){
        super(n,e,t);
        this.setCodSetor(cs);
        this.setSalarioBase(sb);
        this.setImposto(i);        
    }
    
    public void setCodSetor(String cs){
        this.codSetor = cs;
    }
    public String getCodSetor(){
        return this.codSetor;
    }
    public void setSalarioBase(double sb){
        this.salarioBase = sb;
    }
    public double getSalarioBase(){
        return this.salarioBase;
    }
   public void setImposto(double i){
       this.imposto = i;
   }
   public double getImposto(){
       return this.imposto;
   }   
   public double calcularSalario(){
       return this.getSalarioBase() - this.getSalarioBase() * this.getImposto();
   }
}
