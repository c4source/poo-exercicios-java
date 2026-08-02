package exercicio03_contaBancaria;

public class ContaBancaria {

    //Atributos privados
    private String numeroConta;
    private double saldo;
    private Cliente titular; // uma conta bancaria tem um cliente.

    //Construtor
    public ContaBancaria(String numeroConta, Cliente titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = 0.00;

    }

    //Metodos da classe Bancaria.

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.printf("Deposito de R$ %.2f realizado com sucesos.\n", valor);
        }
        else {
            System.out.println("Deposito inválido!");
        }
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.printf("Saque inválido!\n");
        }
        else if (valor > this.saldo) {
            System.out.printf("Saldo insuficiente\n");

        }
        else {
            this.saldo -= valor;
            System.out.printf("Saque de R$ %.2f Realizado com sucesso \n", valor);
        }

    }

    public void exibirDados() {
        System.out.println("===== Dados da conta =====");
        System.out.println("Titular: " + this.titular.getNome());
        System.out.println("Numero da conta: " + this.numeroConta);
        System.out.printf("Saldo: R$ %.2f%n", this.saldo);
    }

    public double consultarSaldo () {
        return this.saldo;
    }


    //Metodos de acesso.
    public String getNumeroConta() {
        return numeroConta;
    }


    public Cliente getTitular() {
        return titular;
    }





}
