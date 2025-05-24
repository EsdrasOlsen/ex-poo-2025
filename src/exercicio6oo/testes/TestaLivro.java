package exercicio6oo.testes;

import exercicio6oo.classes.Livro;

public class TestaLivro {
    public static void main(String[] args) {
        Livro book = new Livro();
        System.out.println("\nDados do livro: ");
        System.out.println(book);
        book.setTitulo("O Programador");
        book.setAutor("Desconhecido");
        book.setGenero("Suspense");
        book.setEmprestado(true);
        System.out.println("\nDados do livro Atualizados: ");
        System.out.println(book);
        System.out.println(book.verificarDisponibilidade());
        System.out.println(book.emprestarLivro());
        System.out.println(book.verificarDisponibilidade());
        System.out.println(book.devolverLivro());
        System.out.println(book.verificarDisponibilidade());
    }
}
