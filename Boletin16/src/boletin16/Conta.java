package boletin16;

public class Conta {
    private long numeroConta;
    private double saldo;
    private Persona cliente = new Persona();

    public Conta(long numeroConta, double saldo, Persona cliente) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.cliente = cliente;
    }
    public Conta(){  
    }
    
    public long getnConta() {
        return numeroConta;
    }

    public void setnumeroConta(long numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Persona getCliente() {
        return cliente;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }


    public void ingresar(double ingreso){
        this.saldo += ingreso;
    }
    public void retirar(double retirada){
        this.saldo -= retirada;

    }
    public void actualizarSaldo(){
        System.out.println("el saldo es: " + getSaldo());
    }

   
    public String toString() {
        return "Conta{" + "numeroConta=" + numeroConta + ", saldo=" + saldo + ", cliente=" + cliente + '}';
    }
    
    
}
