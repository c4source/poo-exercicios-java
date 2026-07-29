package exercicio01_funcionario;

public class Funcionario {
    /*
        Exercício 1 — Sistema de Funcionários
        Uma empresa deseja um pequeno sistema para controlar seus funcionários.

        Cada funcionário possui:

        nome
        salário
        setor

        O sistema deve permitir que um funcionário:

        receba um aumento em reais;
        tenha seu salário consultado;
        exiba seus dados completos.
        Regras

        O salário de um funcionário não pode ser alterado diretamente pela classe de teste.

        Ao tentar conceder um aumento:

        o valor precisa ser maior que zero;
        se for válido, o salário deve ser atualizado;
        se for inválido, o salário permanece igual.

     */

    //Atributos. -> salario está encapsulado.
    private String nome;
    private float salario;
    private String setor;

    //Construtor.
    public Funcionario(String nome, String setor) {
        this.nome = nome;
        this.setor = setor;
        this.salario = 0.00f;
    }

    //Métodos da classe.
    public void aumentarSalario(float valor){
        if(valor > 0) {
            this.salario += valor;
            System.out.format("Aumento de R$ %.2f realizado.%n", valor);
        } else {
            System.out.println("Valor inválido!");
        }
    }

    public void statusDados(){
        System.out.println("--------------------------------");
        System.out.println("Funcíonario: " + this.nome);
        System.out.println("Setor: " + this.setor);
        System.out.println("Sálario: R$ %.2f%n" + this.salario);
    }

    //O getSalario já faz isso, entao e desnecessario este metodo, ele faz exatamente o que o getter faz

    /*
        public float consultarSalario() {
        return this.salario;
    */

    //Métodos de acesso.
    //Dependendo do que se pede do exercicio nao é necessario criar um metodo de acesso get/setter.
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }


    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }




}
