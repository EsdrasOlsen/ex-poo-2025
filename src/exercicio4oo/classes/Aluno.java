package exercicio4oo.classes;

public class Aluno {
    private String matricula;
    private String nome;
    private int idade;
    private int nota1, nota2, nota3, nota4;

    //calcular media
    public double CalcularMedia(){
        double media = (nota1 + nota2 + nota3 + nota4) / 4.;
        return media;
    }
    public void imprimirSituacao(){
        if (this.CalcularMedia() >= 7){
            System.out.printf(this.nome + " está aprovado com sucesso!\n");
        }
        else{
            System.out.printf(this.nome + " está reprovado!\n");
        }
    }

    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }

    public int getNota1() { return nota1; }
    public void setNota1(int nota1) { this.nota1 = nota1; }

    public int getNota2() { return nota2; }
    public void setNota2(int nota2) { this.nota2 = nota2; }

    public int getNota3() { return nota3; }
    public void setNota3(int nota3) { this.nota3 = nota3; }

    public int getNota4() { return nota4; }
    public void setNota4(int nota4) { this.nota4 = nota4; }
    }
