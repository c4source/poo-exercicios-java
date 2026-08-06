package exercicio05_reserva_de_quartos;

public class Main {

    /*
    # Exercício 5 — Reserva de Quarto
    Um hotel deseja controlar a reserva de seus quartos.

    ## Hóspede

    Cada hóspede possui:

    - Nome
    - CPF

    O hóspede deve poder exibir seus dados.

    ## Quarto

    Cada quarto possui:

    - Número
    - Valor da diária
    - Disponibilidade
    - Hóspede responsável pela reserva

    O quarto deve poder:

    - Exibir seus dados;
    - Ser reservado por um hóspede;
    - Cancelar a reserva;
    - Informar o hóspede atual.

    ## Regras

    - Todo quarto começa disponível.
    - Um quarto só pode ser reservado se estiver disponível.
    - Para reservar, deve ser informado um hóspede válido.
    - Após a reserva, o quarto fica indisponível e guarda o hóspede.
    - Um quarto indisponível não pode ser reservado novamente.
    - Ao cancelar a reserva, o quarto volta a ficar disponível e deixa de possuir um hóspede.
    - Não é possível cancelar a reserva de um quarto que já está disponível.

    ## Main

    - Crie dois hóspedes.
    - Crie dois quartos.
    - Exiba os estados iniciais.
    - Reserve um quarto para o primeiro hóspede.
    - Tente reservar o mesmo quarto para o segundo hóspede.
    - Exiba quem está hospedado.
    - Cancele a reserva.
    - Reserve novamente para o segundo hóspede.


     */

    public static void main(String[] args) {




        Hospede h1 = new Hospede("Gabriel", "556-523-355-11");
        Hospede h2 = new Hospede("Pamela", "124-363-588-14");
        Hospede h3 = new Hospede("Osvaldo", "124-363-588-14");

        System.out.println(h1);
        System.out.println("");
        System.out.println(h2);

        Quarto q1 = new Quarto(222, 150);
        Quarto q2 = new Quarto(255, 250);



        q1.reservarQuarto(h1);
        q2.reservarQuarto(h2);

        q1.exibirHospede();
        q2.exibirHospede();

        q1.cancelarReserva();
        q1.exibirHospede();

        q1.reservarQuarto(h3);
        q1.cancelarReserva();
        q2.cancelarReserva();
        q1.reservarQuarto(h1);
        q2.reservarQuarto(h2);
        q1.reservarQuarto(h3);
        q2.exibirDados();
        q1.exibirDados();

        //q1.exibirDados();
        //q2.exibirDados();





    }



}
