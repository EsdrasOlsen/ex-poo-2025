package exercicio6oo.testes;

import exercicio6oo.classes.Aluno;

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

        //Testa Construtor Parametrizado Completo
        Aluno A2 = new Aluno("456", "Beltrano", 20,6,7,8,9);
        System.out.println("\nDados do Segundo Aluno: ");
        System.out.println(A2);
        A2.imprimirSituacao();

        //Testa Construtor encadeado
        Aluno A3 = new Aluno("789","Cilcano",22);
        System.out.println("\nDados do Terceiro Aluno: ");
        System.out.println(A3);

        //Teste de validação de nota
        System.out.println("\nTestando nota inválida: ");
        A3.setNota1(17);
    }
}