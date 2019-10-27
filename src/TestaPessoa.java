public class TestaPessoa {
    public static void main(String[] args){
        Pessoa pessoa1 = new Pessoa("Red", "Rua x", "003");
        Fornecedor for1 = new Fornecedor("Blue", "Rua y", "004", 3500.55, 1200.4);
        Empregado emp1 = new Empregado("Yellow", "Rua z", "005", "X01", 2000, 0.2);
        Administrador adm1 = new Administrador("Orange", "Rua a", "006", "X02", 2000, 0.1, 700);
        Operario op1 = new Operario("Pink", "Rua b", "007", "X03", 1500, 0.1, 10000, 0.09);
        
        System.out.println(for1.obterSaldo());
        System.out.println(emp1.calcularSalario());
        System.out.println(adm1.calcularSalario());
        System.out.println(op1.calcularSalario());
    }
}
