package exercicio4oo.testes;

import exercicio4oo.classes.Carro;

public class TestaCarro {
    public static void main(String[] args) {
        Carro p = new Carro();
        p.setModelo("M2 Competition");
        p.setMarca("BMW");
        p.setAno(2025);
        p.setVelocidade(300.0);
        System.out.println(p.getModelo());
        System.out.println(p.getMarca());
        System.out.println(p.getAno());
        System.out.println(p.getVelocidade());
    }
}
