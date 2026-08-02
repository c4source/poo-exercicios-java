package exercicio03_contaBancaria;

public class Main {
    public static void main(String[] args) {
        /*
            # Exercício 3 — Sistema de Conta Bancária

            Um banco deseja um sistema simples para controlar contas bancárias.

            ## Cliente

            Cada cliente possui:

            - Nome
            - CPF

            O sistema deve permitir que um cliente:

            - Exiba seus dados.

            ## Conta Bancária

            Cada conta bancária possui:

            - Número da conta
            - Saldo
            - Cliente titular

            O sistema deve permitir que uma conta:

            - Exiba seus dados;
            - Realize depósitos;
            - Realize saques;
            - Consulte o saldo.

            ## Regras

            - Toda conta deve possuir um cliente titular.
            - O valor do depósito deve ser maior que zero.
            - O valor do saque deve ser maior que zero.
            - O saque só poderá ser realizado se houver saldo suficiente.
            - Após um depósito, o saldo deverá ser atualizado.
            - Após um saque, o saldo deverá ser atualizado.

            ## Main

            - Crie um cliente. ok
            - Crie uma conta para esse cliente. ok
            - Exiba os dados da conta. ok
            - Realize um depósito. ok
            - Realize um saque válido.ok
            - Tente realizar um saque maior que o saldo. ok 4
            - Consulte o saldo final.

         */

        //Instancias do tipo Cliente:
        Cliente cliente1 = new Cliente("Gabriel", "777-888-969-12");
        Cliente cliente2 = new Cliente("Osvaldo", "778-888--888-12");

        //Mostrando os dados do cliente
        System.out.println(cliente1);
        System.out.println("");
        System.out.printf(cliente2.toString());

        System.out.println("");

        ContaBancaria conta1 = new ContaBancaria("7255", cliente1);
        ContaBancaria conta2 = new ContaBancaria("2323", cliente2);

        //conta1.consultarDados(); ok
        //conta2.consultarDados(); ok

        //conta1.exibirDados();  ok
        //conta2.consultarSaldo(); ok

        conta1.exibirDados();
        conta1.depositar(10);
        conta1.exibirDados();
        conta1.sacar(10);
        conta1.exibirDados();
        conta1.depositar(10);
        conta1.sacar(-30);
        conta1.sacar(1000);
        conta1.sacar(1000);
        System.out.printf("Saldo final: R$ %.2f%n", conta1.consultarSaldo());
        conta1.consultarSaldo();














    }


}
