package exercicio5oo.testes;

import exercicio4oo.classes.Retangulo;

public class TestaRetangulo {
    public static void main(String[] args) {
        Retangulo r1 = new Retangulo();
        r1.setLargura(3.0);
        r1.setAltura(4.0);
        System.out.printf("Largura = %.2f - Altura = %.2f - Area do Retangulo: %.2f\n", r1.getLargura(), r1.getAltura(),r1.calcularArea());
    }
}
