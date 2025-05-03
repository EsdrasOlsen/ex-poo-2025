package exercicio4oo.testes;

import exercicio4oo.classes.ContaBancaria;

public class TestaContaBancaria {
    public static void main(String[] args) {
        ContaBancaria banco = new ContaBancaria();
        banco.setSaldo(65.000);
        banco.setTitular("Fulano");
        banco.setNumeroConta("123456789");
        System.out.printf("Saldo: %.2f - Titular: %s - Numero da Conta: %s\n",banco.getSaldo(),banco.getTitular(),banco.getNumeroConta());
    }
}