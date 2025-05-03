package exercicio4oo.testes;

import exercicio4oo.classes.Aluno;

public class TestaAluno {
    public static void main(String[] args) {
        Aluno esdras = new Aluno();
        esdras.setNome("Esdras Olsen");
        esdras.setMatricula("Primeira Matricula");
        esdras.setIdade(19);
        esdras.setNota1(9);
        esdras.setNota2(10);
        esdras.setNota3(10);
        esdras.setNota4(10);
        System.out.printf("Aluno: %s \n - Idade: %d \n- Matricula: %s \n- Nota1: %d \n- Nota2: %d \n- Nota3: %d \n- Nota4: %d \n- Media: %.2f\n", esdras.getNome(),esdras.getIdade(),esdras.getMatricula(),esdras.getNota1(),esdras.getNota2(),esdras.getNota3(),esdras.getNota4(),esdras.CalcularMedia());esdras.imprimirSituacao();
    }
}
