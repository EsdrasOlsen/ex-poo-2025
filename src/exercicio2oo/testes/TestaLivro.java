package exercicio2oo.testes;

import exercicio2oo.classes.Livro;

public class TestaLivro {
    public static void main(String[] args) {
        Livro book = new Livro();
        book.titulo = "O autor";
        book.autor = "Autor Desconhecido";
        book.genero = "Suspense";
        book.emprestado = false;
        System.out.println(book.titulo);
        System.out.println(book.autor);
        System.out.println(book.genero);
        System.out.println(book.emprestado);
    }
}
