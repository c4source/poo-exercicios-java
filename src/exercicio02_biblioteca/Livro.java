package exercicio02_biblioteca;

public class Livro {
            /*
            exercicio 2 — Sistema de Biblioteca

            Uma biblioteca deseja um sistema para controlar o empréstimo de livros.

            ## Livro

            Cada livro possui:

            - Título
            - Autor
            - Disponibilidade para empréstimo

            O sistema deve permitir que um livro:

            - Exiba seus dados;
            - Seja emprestado;
            - Seja devolvido.

            ## Usuário

            Cada usuário possui:

            - Nome
            - CPF

            O sistema deve permitir que um usuário:

            - Exiba seus dados.

            ## Regras

            - Um livro só pode ser emprestado se estiver disponível.
            - Após o empréstimo, o livro fica indisponível.
            - Ao ser devolvido, o livro volta a ficar disponível.

            ## Main

            - Crie um usuário.
            - Crie dois livros.
            - Exiba os dados dos livros.
            - Empreste um dos livros.
            - Tente emprestá-lo novamente.
            - Devolva o livro.
            - Empreste-o novamente.

             */


        private String titulo;
        private String autor;
        private boolean disponivel;

        public  Livro(String titulo, String autor) {
            this.titulo = titulo;
            this.autor = autor;
            this.disponivel = true;  // todo livro começa true para emprestimo
        }

        public void exibirDadosLivro() {
            System.out.println("=============== Dados do Livro ==============");
            System.out.println("Titulo:" + this.titulo);
            System.out.println("Autor: " + this.autor);
            System.out.println("Disponibilidade: " + this.disponivel);

        }

        public void emprestarLivro() {
            if (this.disponivel) {
                this.disponivel = false;
                System.out.format("Livro %s emprestado!\n", titulo);
            }else {
                System.out.format("Livro %s indisponíel para emprestimo!\n", titulo);
            }
        }

        public void devolverLivro() {
            if(!this.disponivel) {
                this.disponivel = true;
                System.out.printf("Livro devolvido");
            }
            else {
                System.out.println("Livro já está disponível");
            }

        }

        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public String getAutor() {
            return autor;
        }

        public void setAutor(String autor) {
            this.autor = autor;
        }

        //Boolean em getter tem é Is, ao inves de getDisponivel, use o IS
        /*public boolean isDisponivel() {
            return disponivel;
        }*/

        /*public void setDisponivel(boolean disponivel) {
            this.disponivel = disponivel;
        }*/
}
