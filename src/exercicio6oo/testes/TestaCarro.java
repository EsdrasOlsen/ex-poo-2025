package exercicio6oo.testes;

import exercicio6oo.classes.Carro;

public class TestaCarro {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        System.out.println("Dados do Carro: ");
        System.out.println(c1);
        System.out.println("\nDados do Carro Atualizados: ");
        c1.setModelo("M2 Competition");
        c1.setMarca("BMW");
        c1.setAno(2025);
        c1.setVelocidade(100.0);
        System.out.println(c1);
        System.out.println("\nDados do Carro após acelerar: ");
        c1.acelerar();
        System.out.println(c1);
        System.out.println("\nDados do Carro após frear: ");
        c1.frear();
        System.out.println(c1);

        //Testa construtores
        Carro c2 = new Carro("Civic","Honda",2025);
        System.out.println("\nCarro Criado com cnstrutor encadeado: ");
        System.out.println(c2);

        Carro c3 = new Carro("911 Carrera GTS","Porshe",2022,120.0);
        System.out.println("\nCarro Criado com construtor completo: ");
        System.out.println(c3);

        //Validação de entrada
        System.out.println("\nTestando validações: ");
        c1.setAno(1800);//inválido
        c1.setVelocidade(500);//inválido

        //Testa Limite de Velocidade
        System.out.println("\nAcelerando até o Limite: ");
        for (int i = 0; i < 25; i++){
            c1.acelerar();
        }
        System.out.println(c1);
    }
}