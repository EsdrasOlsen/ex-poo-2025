package exercicio6oo.testes;

import exercicio6oo.classes.ContaBancaria;

public class TestaContaBancaria {
    public static void main(String[] args) {
        ContaBancaria banco = new ContaBancaria();
        System.out.println("Dados da Conta");
        System.out.println(banco);
        banco.setSaldo(65000.0);
        banco.setTitular("Pedrinho");
        banco.setNumeroConta("123456789");
        System.out.println("\nDados Atualizados!");
        System.out.println(banco);
        banco.depositar(10000.0);
        banco.sacar(2000.0);
        System.out.println(banco);
    }
}