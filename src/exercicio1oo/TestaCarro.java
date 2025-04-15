package exercicio1oo;

public class TestaCarro {
    public static void main(String[] args) {
        Carro pneu = new Carro();
        pneu.modelo = "M2 Competition";
        pneu.marca = "BMW";
        pneu.ano = 2025;
        pneu.velocidade = 300.0;
        System.out.println(pneu.modelo);
        System.out.println(pneu.marca);
        System.out.println(pneu.ano);
        System.out.println(pneu.velocidade);
    }
}
