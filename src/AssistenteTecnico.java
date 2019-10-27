public class AssistenteTecnico extends Assistente{
    private double bonus;
    
    public AssistenteTecnico(String n, String m, Gerente s, double b){
        super(n, m, s);
        this.setBonus(b);
    }
    
    public void setBonus(double b){
        this.bonus = b;
    }
    public double getBonus(){
        return this.bonus;
    }
}
