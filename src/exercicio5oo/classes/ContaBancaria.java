package exercicio5oo.classes;

public class ContaBancaria {
    private String numeroConta;
    private String titular;
    private double saldo;

    //depositos
    public void depositar(double valor){
        if (valor > 0){
            saldo += valor;
            System.out.printf("\n Deposito de R$" + valor + " realizado com sucesso!\n");
        }
        else{
            System.out.printf("Valor de depósito inválido.");
        }
    }

    //Saques
    public void sacar(double valor){
        if (valor > 0){
            saldo -= valor;
            System.out.println("\n Saque realizado com sucesso!\n");
        }
        else{
            System.out.println("Saque inválido. Verifique o saldo ou o valor digitado.");
        }
    }

    //consultar saldo

    public double consultarSaldo(){
        return saldo;
    }

    public String getNumeroConta() {return numeroConta;}
    public void setNumeroConta(String numeroConta) {this.numeroConta = numeroConta;}

    public String getTitular() {return titular;}
    public void setTitular(String titular) {this.titular = titular;}

    public double getSaldo() {return saldo;}
    public void setSaldo(double saldo) {this.saldo = saldo;}
}
