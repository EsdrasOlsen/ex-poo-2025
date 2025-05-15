package exercicio5oo.testes;

import exercicio5oo.classes.Aluno;

public class TestaAluno {
    public static void main(String[] args) {
        Aluno A1 = new Aluno();
        System.out.println("Dados do Aluno: ");
        System.out.println(A1);
        A1.setMatricula("123");
        A1.setNome("Fulano");
        A1.setIdade(18);
        A1.setNota1(8);
        A1.setNota2(7);
        A1.setNota3(9);
        A1.setNota4(10);
        System.out.println("\nDados Atualizados do Aluno: ");
        System.out.println(A1);
        A1.imprimirSituacao();
    }
}