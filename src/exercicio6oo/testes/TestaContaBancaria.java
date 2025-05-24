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
        System.out.printf("Saldo atual: %.2f\n", banco.getSaldo());
        System.out.println(banco);

        //Testa saque
        banco.sacar(999999);//maior que o saldo atual - deve falhar

        //Testar depósito
        banco.depositar(-50);//valor negativo - deve falhar

        //Criando conta diretamente com Construtor
        ContaBancaria novaConta = new ContaBancaria("987654321","Nelson",500);
        System.out.println("\nConta criada com sucesso!");
        System.out.println(novaConta);
    }
}