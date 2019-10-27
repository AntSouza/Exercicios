public class AssistenteAdm extends Assistente{
    private double adcNoturno;
    
    public AssistenteAdm(String n, String m, Gerente s, double an){
        super(n, m, s);
        this.setAdcNoturno(an);        
    }
    
    public void setAdcNoturno(double an){
        this.adcNoturno = an;
    }
    public double getAdcNoturno(){
        return this.adcNoturno;
    }
}
