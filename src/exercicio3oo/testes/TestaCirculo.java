package exercicio3oo.testes;

import exercicio3oo.classes.Circulo;

public class TestaCirculo {
    public static void main(String[] args) {
        Circulo bolinha = new Circulo();
        bolinha.setRaio(13.5);
        System.out.println(bolinha.getRaio());
    }
}