package exercicio5oo.classes;

public class Circulo {
    private double raio;

    //calcular diametro
    public double CalcularDiamentro(){
    return 2 * raio;
    }
    //calcular perimetro
    public double CalcularPerimetro(){
        return 2 * Math.PI * raio;
    }

    //calcular area
    public double CalcularArea(){
        return Math.PI * raio * raio;
    }

    public double getRaio() {return raio;}
    public void setRaio(double raio) {this.raio = raio;}
}
