package exercicio6oo.testes;

import exercicio6oo.classes.Circulo;

public class TestaCirculo {
    public static void main(String[] args) {
        Circulo bolinha = new Circulo();
        System.out.println("Dados de circulo: ");
        System.out.println(bolinha);
        bolinha.setRaio(19);
        System.out.println("Dados de circulo Atualizados: ");
        System.out.println(bolinha);

        //Testa construtor com parâmetro
        Circulo circuloComRaio = new Circulo(10);
        System.out.println("Dados do círculo com raio 10:");
        System.out.println(circuloComRaio);

        //Testa Validações
        System.out.println("Tentando definir raio inválido: ");
        bolinha.setRaio(-5);//Deve mostrar mensagem de erro

        //Mostrar Cálculos separadamente
        System.out.println("\nCálculos do circulo bolinha: ");
        System.out.printf("Área: %.2f\n", bolinha.calcularArea());
        System.out.printf("Perímetro: %.2f\n", bolinha.calcularPerimetro());
        System.out.printf("Diâmetro: %.2f\n", bolinha.calcularDiametro());

    }
}