package exercicio6oo.classes;

public class Circulo {
    private double raio;

    // Construtor padrão
    public Circulo() {
        this.raio = 0.0;
    }

    // Construtor parametrizado
    public Circulo(double raio) {
        setRaio(raio);
    }

    // Calcular diâmetro
    public double calcularDiametro() {
        return 2 * raio;
    }

    // Calcular perímetro
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    // Calcular área
    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public String toString() {
        return String.format("Círculo:\nRaio: %.2f\nDiâmetro: %.2f\nPerímetro: %.2f\nÁrea: %.2f",
                raio, calcularDiametro(), calcularPerimetro(), calcularArea());
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        if (raio < 0 || raio > 1000) {
            System.out.println("Erro: o raio deve estar entre 0 e 1000.");
        } else {
            this.raio = raio;
        }
    }
}