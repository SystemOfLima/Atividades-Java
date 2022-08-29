package CincoTres;

public class GetAndSet {

    private String titular;
    private int numero;
    private double saldo;
    
    public void sacar(double valor) {
        if(this.saldo >= valor) {
                this.saldo -= valor;
        } else {
                System.out.println("Sem saldo suficiente");
        }
    }
//getandset para "titular"//
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
//getandset para "número"//
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
//getandset para "saldo"//
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
