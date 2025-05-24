package exercicio6oo.classes;

public class Retangulo {
    private double largura;
    private double altura;

    // Construtor padrão
    public Retangulo() {
        this.largura = 0.0;
        this.altura = 0.0;
    }

    // Construtor parametrizado
    public Retangulo(double largura, double altura) {
        this.setLargura(largura);
        this.setAltura(altura);
    }

    // Calcula a área
    public double calcularArea() {
        return this.largura * this.altura;
    }

    // Método toString
    @Override
    public String toString() {
        return "Largura: " + this.largura + "\nAltura: " + this.altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        if (largura < 0 || largura > 1000) {
            System.out.println("Erro: a largura deve estar entre 0 e 1000.");
        } else {
            this.largura = largura;
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura < 0 || altura > 1000) {
            System.out.println("Erro: a altura deve estar entre 0 e 1000.");
        } else {
            this.altura = altura;
        }
    }
}