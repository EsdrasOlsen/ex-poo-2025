package exercicio6oo.testes;

import exercicio6oo.classes.Carro;

public class TestaCarro {
    public static void main(String[] args) {
        Carro p = new Carro();
        System.out.println("Dados do Carro: ");
        System.out.println(p);
        System.out.println("\nDados do Carro Atualizados: ");
        p.setModelo("M2 Competition");
        p.setMarca("BMW");
        p.setAno(2025);
        p.setVelocidade(100.0);
        System.out.println(p);
        System.out.println("\nDados do Carro após acelerar: ");
        p.acelerar();
        System.out.println(p);
        System.out.println("\nDados do Carro após frear: ");
        p.frear();
        System.out.println(p);
    }
}