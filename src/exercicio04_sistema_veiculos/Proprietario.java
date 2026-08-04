package exercicio04_sistema_veiculos;

public class Proprietario {

        private String nome;
        private String cpf;

        //Construtor
        public Proprietario (String nome, String cpf) {
            this.nome = nome;
            this.cpf = cpf;
        }

        //Metodo da classe proprietario


    @Override
    public String toString() {
        return "Proprietario{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
        }

        public String getNome() {
            return this.nome;
        }
        public String getCpf() {
             return this.cpf;
        }
}
