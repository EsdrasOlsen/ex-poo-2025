package exercicio6oo.classes;

public class Carro {
    private String modelo;
    private String marca;
    private int ano;
    private double velocidade;

    // Construtor padrão
    public Carro() {
        this.modelo = "";
        this.marca = "";
        this.ano = 0;
        this.velocidade = 0;
    }

    // Construtor parametrizado
    public Carro(String modelo, String marca, int ano, double velocidade) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        setVelocidade(velocidade); // validação
    }

    // Acelerar
    public double acelerar() {
        if (velocidade < 300.0) {
            velocidade += 10.0;
            velocidade = Math.min(velocidade, 300.0);
        } else {
            System.out.println("Velocidade máxima atingida (300 km/h).");
        }
        return velocidade;
    }

    // Frear
    public double frear() {
        if (velocidade > 0) {
            velocidade -= 10.0;
            velocidade = Math.max(velocidade, 0.0);
        } else {
            System.out.println("O carro já está parado.");
        }
        return velocidade;
    }

    @Override
    public String toString() {
        return "Concessionária Brasil -\n" +
                "Modelo: " + modelo + "\n" +
                "Marca: " + marca + "\n" +
                "Ano: " + ano + "\n" +
                "Velocidade: " + velocidade + " km/h";
    }

    // Getters e Setters
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
            System.out.println("Erro: o ano deve ser entre 1940 e 2026.");
        } else {
            this.ano = ano;
        }
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        if (velocidade < 0 || velocidade > 300.0) {
            System.out.println("Erro: a velocidade deve ser entre 0 e 300.");
        } else {
            this.velocidade = velocidade;
        }
    }
}
