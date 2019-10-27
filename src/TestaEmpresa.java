public class TestaEmpresa {
    public static void main(String args[]){
        Gerente gerente1 = new Gerente("Blue","X001","Vendas");
        AssistenteAdm assistente_adm1 = new AssistenteAdm("Yellow","X002",gerente1,3.9);
        AssistenteTecnico assistente_tec1 = new AssistenteTecnico("Red","X003",gerente1,4.5);
    }
            
}
