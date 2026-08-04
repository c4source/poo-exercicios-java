package exercicio04_sistema_veiculos;

public class Main {
    public static void main(String[] args) {

        /*
        # Exercício 4 — Sistema de Veículos

        Uma concessionária deseja um sistema simples para controlar seus veículos.

        ## Proprietário

        Cada proprietário possui:

        - Nome
        - CPF

        O sistema deve permitir que um proprietário:

        - Exiba seus dados.

        ## Veículo

        Cada veículo possui:

        - Modelo
        - Marca
        - Ano
        - Proprietário

        O sistema deve permitir que um veículo:

        - Exiba seus dados;
        - Altere seu proprietário;
        - Exiba o nome do proprietário atual.

        ## Regras

        - Todo veículo deve possuir um proprietário.
        - Um veículo só poderá trocar de proprietário se um novo proprietário for informado.
        - Após a troca, o novo proprietário deverá ficar associado ao veículo.

        ## Main

        - Crie dois proprietários.
        - Crie um veículo para o primeiro proprietário.
        - Exiba os dados do veículo.
        - Troque o proprietário do veículo.
        - Exiba novamente os dados do veículo para verificar a alteração.


         */

        Proprietario p1 = new Proprietario("Osvaldo", "777-939-769-98");
        Proprietario p2 = new Proprietario("Pamela", "9815-1986-554-777");
        Proprietario p3 = new Proprietario("Luiza", "555-888-663-22");


        Veiculo v1 = new Veiculo("USV","JAGUAR", 2030, p1);
        Veiculo v2 = new Veiculo("Esportivo", "LAND ROVER", 2029, p2);




        v1.exibirDados();
        v1.alterarProprietario(p3);
        v1.exibirDados();











    }
}
