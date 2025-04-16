package exercicio2oo.testes;

import exercicio2oo.classes.ContaBancaria;

public class TestaContaBancaria {
    public static void main(String[] args) {
        ContaBancaria banco = new ContaBancaria();
        banco.saldo = 650000;
        banco.titular = "João";
        banco.numeroConta = "123456789";
        System.out.println("Saldo: " + banco.saldo);
        System.out.println("Titular: " + banco.titular);
        System.out.println("Numero Conta: " + banco.numeroConta);
    }
}