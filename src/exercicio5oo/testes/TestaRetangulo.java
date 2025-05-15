package exercicio5oo.testes;

import exercicio5oo.classes.Retangulo;

public class TestaRetangulo {
    public static void main(String[] args) {
        Retangulo r1 = new Retangulo();
        System.out.println("Dados do Retangulo: ");
        System.out.println(r1);
        r1.setLargura(45.0);
        r1.setAltura(66.0);
        System.out.println("\nDados do Retangulo Atualizados: ");
        System.out.println(r1);
        System.out.println(r1.calcularArea());
    }
}
