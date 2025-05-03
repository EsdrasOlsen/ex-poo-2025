package exercicio4oo.testes;

import exercicio4oo.classes.Livro;

public class TestaLivro {
    public static void main(String[] args) {
        Livro book = new Livro();
        book.setTitulo("O Programador");
        book.setAutor("Desconhecido");
        book.setGenero("Suspense");
        book.setEmprestado(false);
        System.out.printf("Titulo: %s\nAutor: %s\nGenero: %s\nEmprestado: %s\n",book.getTitulo(),book.getAutor(),book.getGenero(),book.getEmprestado());
        System.out.println(book.verificarDisponibilidade());
        System.out.println(book.emprestarLivro());
        System.out.println(book.verificarDisponibilidade());
        System.out.println(book.devolverLivro());
        System.out.println(book.verificarDisponibilidade());
    }
}
