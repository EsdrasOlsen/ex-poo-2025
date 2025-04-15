package exercicio2oo.testes;

import exercicio2oo.classes.Aluno;

class TestaAluno {
    public static void main(String[] args) {
        Aluno esdras = new Aluno();
        esdras.nome = "Esdras Olsen";
        esdras.idade = 19;
        esdras.nota1 = 9;
        esdras.nota2 = 10;
        esdras.nota3 = 6;
        esdras.nota4 = 9;
        System.out.println("Nome: " + esdras.nome);
        System.out.println("Idade: " + esdras.idade);
        System.out.println("Nota1: " + esdras.nota1);
        System.out.println("Nota2: " + esdras.nota2);
        System.out.println("Nota3: " + esdras.nota3);
        System.out.println("Nota4: " + esdras.nota4);
        System.out.println(esdras);
        Aluno almir = new Aluno();
        almir.nome = "Almir Pereira";
        almir.idade = 19;
        almir.nota1 = 9;
        almir.nota2 = 10;
        almir.nota3 = 6;
        almir.nota4 = 9;
        System.out.println("Nome: " + almir.nome);
        System.out.println("Idade: " + almir.idade);
        System.out.println("Nota1: " + almir.nota1);
        System.out.println("Nota2: " + almir.nota2);
        System.out.println("Nota3: " + almir.nota3);
        System.out.println("Nota4: " + almir.nota4);
        System.out.println(almir);
    }
}
