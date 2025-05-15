package exercicio5oo.classes;

public class Circulo {
    double raio;

    //Construtor padrão;
    public Circulo() {
        this.raio = 0.0;
    }

    //Construtor Parametrizado;
    public Circulo(double raio) {
        this.raio = raio;
    }

    //calcular diametro
    public double CalcularDiamentro() {
        return 2 * raio;
    }

    //calcular perimetro
    public double CalcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    //calcular area
    public double CalcularArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public String toString() {
        return String.format("Círculo:\nRaio: %.2f\nDiâmetro: %.2f\nPerímetro: %.2f\nÁrea: %.2f",
                raio, CalcularDiamentro(), CalcularPerimetro(), CalcularArea());
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        if (raio < 0 || raio > 1000) {
            System.out.println("Erro: Raio deve ser entre 0 e 1000");
        } else {
            this.raio = raio;
        }
    }
}
