package exercicio5oo.classes;

public class Aluno {
    String matricula;
    String nome;
    int idade;
    int nota1, nota2, nota3, nota4;

    //Construtor Padrão:
    public Aluno() {
        this.matricula = "";
        this.nome = "";
        this.idade = 0;
        this.nota1 = 0;
        this.nota2 = 0;
        this.nota3 = 0;
        this.nota4 = 0;
    }

    //Construtor Parametrizado:
    public Aluno(String matricula, String nome, int idade, int nota1, int nota2, int nota3, int nota4) {
        this.matricula = matricula;
        this.nome = nome;
        this.idade = idade;
        setNota1(nota1);
        setNota2(nota2);
        setNota3(nota3);
        setNota4(nota4);
    }

    //calcular media
    public double calcularMedia() {
        return (nota1 + nota2 + nota3 + nota4) / 4.0;
    }

    public void imprimirSituacao() {
        if (this.calcularMedia() >= 7) {
            System.out.printf(this.nome + " está aprovado com sucesso!\n");
        } else {
            System.out.printf(this.nome + " está reprovado!\n");
        }
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "matricula='" + matricula + '\'' +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", nota1=" + nota1 +
                ", nota2=" + nota2 +
                ", nota3=" + nota3 +
                ", nota4=" + nota4 +
                '}';
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        if (nota1 < 0 || nota1 > 10) {
            System.out.println("Nota 1 deve estar entre 0 e 10.");
        } else {
            this.nota1 = nota1;
        }
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        if (nota2 < 0 || nota2 > 10) {
            System.out.println("Nota 2 deve estar entre 0 e 10.");
        } else {
            this.nota2 = nota2;
        }
    }

    public int getNota3() {
        return nota3;
    }

    public void setNota3(int nota3) {
        if (nota3 < 0 || nota3 > 10) {
            System.out.println("Nota 3 deve estar entre 0 e 10.");
        } else {
            this.nota3 = nota3;
        }
    }

    public int getNota4() {
        return nota4;
    }

    public void setNota4(int nota4) {
        if (nota4 < 0 || nota4 > 10) {
            System.out.println("Nota 4 deve estar entre 0 e 10.");
        } else {
            this.nota4 = nota4;
        }
    }
}