public class Operario extends Empregado{
    private double valorProducao;
    private double comissao;
    
    public Operario(String n, String e,String t, String cs, double sb, double i, double vp, double c){
        super(n,e,t,cs,sb,i);
        this.setValorProducao(vp);
        this.setComissao(c);       
    }
    
    public void setValorProducao(double vp){
        this.valorProducao = vp;
    }    
    public double getValorProducao(){
        return this.valorProducao;
    }
    public void setComissao(double c){
        this.comissao = c;
    }
    public double getComissao(){
        return this.comissao;
    }
    
    public double calcularSalario(){
        return getSalarioBase() + (this.getValorProducao() * this.getComissao()) - (getSalarioBase() * getImposto());
    }
    
}
