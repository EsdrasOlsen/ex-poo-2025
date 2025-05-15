package exercicio5oo.classes;

public class Retangulo {
    double largura;
    double altura;

    //Construtor Padrão;
    public Retangulo() {
        this.largura = 0.0;
        this.altura = 0.0;
    }

    //Construtor Parametrizado;
    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    //Calcula à Area;
    public double calcularArea() {
        return this.largura * this.altura;
    }

    //Metodo toString
    @Override
    public String toString() {
        return "Largura: " + this.largura + "\nAltura: " + this.altura;
    }

    public Double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        if (largura < 0 || largura > 1000) {
            System.out.println("Erro: Largura deve estar entre 0 e 1000");
        } else {
            this.largura = largura;
        }
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura < 0 || altura > 1000) {
            System.out.println("Erro: Altura deve estar entre 0 e 1000");
        } else {
            this.altura = altura;
        }
    }
}
