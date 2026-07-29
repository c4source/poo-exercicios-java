package exercicio01_funcionario;

public class Main {
    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario("Dante", "Tecnologia");
        funcionario1.statusDados();
        funcionario1.aumentarSalario(3500.00f);
        funcionario1.statusDados();
        funcionario1.aumentarSalario(500.00f);
        System.out.println("");

        Funcionario funcionario2 = new Funcionario("Beatriz", "Tecnologia");
        funcionario2.statusDados();
        funcionario2.aumentarSalario(-200);
        funcionario2.aumentarSalario(4000f);

        //Dado é obtido pelo getSalario bruto, o PRINT decide como apresentar este dado.
        System.out.format("Salário R$ %.2f", funcionario2.getSalario());


    }
}
