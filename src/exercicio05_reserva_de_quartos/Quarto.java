package exercicio05_reserva_de_quartos;

public class Quarto {

    private int numero;
    private double valorDiaria;
    private boolean disponibilidade;
    private Hospede hospede;

    public Quarto(int numero, double valorDiaria) {
        this.numero = numero;
        this.valorDiaria = valorDiaria;
        this.disponibilidade = true;
        this.hospede = null;
    }

    //Metodos da classe
    public void exibirDados () {
        System.out.println("====== Dados do quarto ===== ");
        System.out.println("Numero: " + this.numero);
        System.out.printf("Diaría: R$ %.2f%n", this.valorDiaria);
        System.out.println("Disponível: " + this.disponibilidade);
        if (this.hospede == null) {
            System.out.println("Hóspede: Nenhum" );
        }
        else {
            System.out.println("Hóspede: " + this.hospede.getNome());
        }
    }

    public void reservarQuarto(Hospede hospede) {

            //lembre-se: this. referece ao atributo. Quando parametro vai sem this.
        if (this.disponibilidade && hospede != null) {
            this.disponibilidade = false; // reserva fica indisponivel
            this.hospede = hospede; // o objeto passo do tipo hospede sera passado e guardado no atributo hospede da classe
            System.out.println("Reserva concluida com sucesso!");

        }
        else {
            System.out.println("Impossível realizar está reserva.");
        }

    }



    public void cancelarReserva() {
        // - Ao cancelar a reserva, o quarto volta a ficar disponível e deixa de possuir um hóspede.
        // - Não é possível cancelar a reserva de um quarto que já está disponível

        if(this.disponibilidade) {
            System.out.println("Impossível Cancelar reserva.");

        }
        else {
            this.disponibilidade = true;
            this.hospede = null;
            System.out.println("Reserva Cancelada! ");
        }


    }

    public void exibirHospede () {
        if (this.hospede == null ) {
            System.out.println("Hospede: Nenhum" );
            System.out.println("Quarto: " + this.numero);
        } else {
        System.out.println("Hospede: " + this.hospede.getNome());
        System.out.println("Quarto: " + this.numero);

        }
    }



    public int getNumero() {
        return numero;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public Hospede getHospede() {
        return hospede;
    }


}
