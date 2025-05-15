package exercicio5oo.testes;

import exercicio4oo.classes.Circulo;

public class TestaCirculo {
    public static void main(String[] args) {
        Circulo bolinha = new Circulo();
        bolinha.setRaio(13.5);
        System.out.println(bolinha.getRaio());
        System.out.printf(" Diametro = %.2f -\n Perimetro = %.2f -\n Area = %.2f \n",bolinha.CalcularDiamentro(),bolinha.CalcularPerimetro(),bolinha.CalcularArea());
    }
}