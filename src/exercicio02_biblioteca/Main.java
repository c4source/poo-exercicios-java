package exercicio02_biblioteca;

public class Main {
    public static void main(String[] args) {

        Livro livro1 = new Livro ("A divina comedia", "Dante Aligheri");
        Livro livro2 = new Livro("Stars Wars", "Jorge Lucas");

        //Exibir dados dos livros
        livro1.exibirDadosLivro();
        livro2.exibirDadosLivro();

        Usuario user2 = new Usuario("Ronaldo", "555-555-555-55");
        //Emprestar o livro
        livro1.emprestarLivro(user2);
        livro1.exibirDadosLivro();

        //Usuario
        Usuario user1 = new Usuario("Gabriel", "585-884-025-06");

        //o println ja chama o toString automaticamente, nao é necessario dar (user1.toString());
        System.out.println(user1);






    }
}
