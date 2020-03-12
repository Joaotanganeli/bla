package main;

public class Conta {
    private double saldo;
    private String titular;
    private int numero;
   
    
    
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public void debito(double valor){
        saldo -= valor; saldo = saldo - valor;
    }
    
    public void creditar(double valor){
        saldo += valor;
    }
    
    public Conta(double saldo, String titular, int numero){
        this.saldo = saldo;
        this.titular = titular;
        this.numero = numero;
    }
    
    public void almondega(){
        System.out.println("----------------");
        System.out.println(this.saldo);
        System.out.println(this.titular);
        System.out.println(this.numero);
    }
}
