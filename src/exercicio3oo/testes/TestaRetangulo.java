package exercicio3oo.testes;

import exercicio3oo.classes.Retangulo;

public class TestaRetangulo {
    public static void main(String[] args) {
        Retangulo r1 = new Retangulo();
        r1.setLargura(3.0);
        r1.setAltura(4.0);
        System.out.printf("Largura = %.2f - Altura = %.2f \n", r1.getLargura(), r1.getAltura());
    }
}
