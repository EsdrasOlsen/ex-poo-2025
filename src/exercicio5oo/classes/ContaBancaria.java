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
        setSaldo(saldo); // usa validação
    }

    // Consultar saldo
    public double consultarSaldo() {
        return saldo;
    }

    // Depósitos
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso!");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    // Saques
    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso!");
        } else {
            System.out.println("Saque inválido. Verifique o saldo ou o valor digitado.");
        }
    }

    @Override
    public String toString() {
        return "Banco do Brasil\n" +
                "Número da Conta: " + numeroConta + "\n" +
                "Titular: " + titular + "\n" +
                "Saldo: R$" + String.format("%.2f", saldo);
    }

    // Getters e Setters
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
            System.out.println("Erro: saldo não pode ser negativo.");
        } else {
            this.saldo = saldo;
        }
    }
}