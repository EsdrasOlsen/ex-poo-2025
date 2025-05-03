package exercicio3oo.testes;

import exercicio3oo.classes.Aluno;

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
        System.out.printf("Aluno: %s - Idade: %d - Matricula: %s - Nota1: %d - Nota2: %d - Nota3: %d - Nota4: %d\n", esdras.getNome(),esdras.getIdade(),esdras.getMatricula(),esdras.getNota1(),esdras.getNota2(),esdras.getNota3(),esdras.getNota4());
    }
}
