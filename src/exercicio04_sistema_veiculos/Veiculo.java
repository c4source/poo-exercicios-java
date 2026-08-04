package exercicio04_sistema_veiculos;

public class Veiculo {

    private String modelo;
    private String marca;
    private int ano;
    private Proprietario proprietario; //Veiculo tem proprietario

    public Veiculo(String modelo, String marca, int ano, Proprietario usuario) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.proprietario = usuario;
    }

    // metodos da classe veiculo

    public void exibirDados() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Marca: " + this.marca);
        System.out.println("ano: " + this.ano);
        System.out.println("Proprietario: " + this.proprietario.getNome());
    }

    public void alterarProprietario(Proprietario novoUsuario) {
        if (novoUsuario != null) {
            this.proprietario = novoUsuario;
            System.out.println("Troca relizada com sucesso!");
        }
        else {
            System.out.println("Troca nula, informe um novo proprietario.");
        }
    }

    public Proprietario proprietarioAtual() {
        return this.proprietario;
    }


}
