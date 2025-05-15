package exercicio5oo.classes;

public class ContaBancaria {
    private String numeroConta;
    private String titular;
    private double saldo;

    public ContaBancaria() {
        this.numeroConta = "";
        this.titular = "";
        this.saldo = 0.0;
    }

    public ContaBancaria(String numeroConta, String titular, double saldo) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    //consultar saldo

    public double consultarSaldo() {
        return saldo;
    }

    //depositos
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.printf("\nDeposito de R$" + valor + " realizado com sucesso!\n");
        } else {
            System.out.printf("\nValor de depósito inválido.");
        }
    }

    //Saques
    public void sacar(double valor) {
        if (valor > 0) {
            saldo -= valor;
            System.out.printf("\nSaque de R$" + valor + " realizado com sucesso!\n");
        } else {
            System.out.println("\nSaque inválido. Verifique o saldo ou o valor digitado.");
        }
    }

    @Override
    public String toString() {
        return "Banco do Brasil \n" + "Numero da Conta: " + numeroConta + "\n" + "Titular: " + titular + "\n" + "Saldo: " + saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo < 0) {
            System.out.println("Error: Saldo Negativo!");
        } else {
            this.saldo = saldo;
        }
    }
}
