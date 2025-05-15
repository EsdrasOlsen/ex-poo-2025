package exercicio5oo.classes;

public class Carro {
    private String modelo;
    private String marca;
    private int ano;
    private double velocidade;

    // Acelerar
    public double acelerarCarro() {
        velocidade += 10.0;
        return velocidade;
    }

    // Frear
    public double desacelerarCarro() {
        if (velocidade >= 10.0) {
            velocidade -= 10.0;
        }
        return velocidade;
    }

    public String getModelo(){return modelo;}
    public void setModelo(String modelo){this.modelo = modelo;}

    public String getMarca(){return marca;}
    public void setMarca(String marca){this.marca = marca;}

    public int getAno(){return ano;}
    public void setAno(int ano){this.ano = ano;}

    public double getVelocidade(){return velocidade;}
    public void setVelocidade(double velocidade){this.velocidade = velocidade;}
}

