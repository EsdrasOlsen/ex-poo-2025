package exercicio4oo.testes;

import exercicio4oo.classes.Livro;

public class TestaLivro {
    public static void main(String[] args) {
        Livro book = new Livro();
        book.setTitulo("O autor");
        book.setAutor("Auto Desconhecido");
        book.setGenero("Suspense");
        book.setEmprestado(false);
        System.out.printf("Titulo: %s - Autor: %s - Genero: %s - Emprestado: %s \n",book.getTiutulo(),book.getAutor(),book.getGenero(),book.getEmprestado());
    }
}
