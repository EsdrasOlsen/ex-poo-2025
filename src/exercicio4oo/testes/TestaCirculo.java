package exercicio4oo.testes;

import exercicio4oo.classes.Circulo;

public class TestaCirculo {
    public static void main(String[] args) {
        Circulo bolinha = new Circulo();
        bolinha.setRaio(13.5);
        System.out.println(bolinha.getRaio());
    }
}