package exercicio5oo.classes;

public class Carro {
    private String modelo;
    private String marca;
    private int ano;
    private double velocidade;

    //Construtor Padrão
    public Carro() {
        this.modelo = "";
        this.marca = "";
        this.ano = 0;
        this.velocidade = 0;
    }

    //Construtor Parametrizado
    public Carro(String modelo, String marca, int ano, double velocidade) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.velocidade = velocidade;
    }

    // Acelerar
    public double acelerarCarro() {
        if (velocidade < 300.0) {
            velocidade += 10.0;
            if (velocidade > 300.0) {
                velocidade = 300.0;
            }
        } else {
            System.out.println("Velocidade máxima atingida (300 km/h).");
        }
        return velocidade;
    }

    // Frear
    public double desacelerarCarro() {
        if (velocidade > 0) {
            velocidade -= 10.0;
            if (velocidade < 0) {
                velocidade = 0;
            }
        } else {
            System.out.println("O carro já está parado.");
        }
        return velocidade;
    }

    @Override
    public String toString() {
        return "Concessionaria Brasil -" + "\nModelo: " + modelo + "\nMarca: " + marca + "\nAno: " + ano + "\nVelocidade: " + velocidade;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (ano < 1940 || ano > 2026) {
            System.out.println("O ano deve ser entre 1940 e 2026");
        } else {
            this.ano = ano;
        }
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        if (velocidade < 0 || velocidade > 300.00) {
            System.out.println("A velocidade deve ser entre 0 e 300.");
        } else {
            this.velocidade = velocidade;
        }
    }
}


