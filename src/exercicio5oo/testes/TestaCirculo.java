package exercicio5oo.testes;

import exercicio5oo.classes.Circulo;

public class TestaCirculo {
    public static void main(String[] args) {
        Circulo bolinha = new Circulo();
        System.out.println("Dados de circulo: ");
        System.out.println(bolinha);
        bolinha.setRaio(19);
        System.out.println("Dados de circulo Atualizados: ");
        System.out.println(bolinha);
    }
}