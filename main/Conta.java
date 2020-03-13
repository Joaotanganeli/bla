package Main;

public class Conta {
    private String qual;
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
    
    public void debitar(double valor){
        saldo -= valor; saldo = saldo - valor;
    }
    
    public void creditar(double valor){
        saldo += valor;
    }
    
    public Conta(String qual,double saldo, String titular, int numero){
        this.qual = qual;
        this.saldo = saldo;
        this.titular = titular;
        this.numero = numero;
    }
    public void almondega(){
        System.out.println("------------"+this.qual+"------------");
        System.out.println("Saldo:"+this.saldo);
        System.out.println("Titular:"+this.titular);
        System.out.println("Numero:"+this.numero);
    }
}

 
