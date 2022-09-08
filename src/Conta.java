

public class Conta {
    // variaveis
    private static int totalDeContas;
    private String titular;    
    private double saldo;
    private int numero;
    
    // construtor
    Conta(String titular) {
        this.titular = titular;
        Conta.totalDeContas++;
    }

    // metodos
    public void sacar(double valor) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Valor atual: " + this.saldo + "," + "valor sacado: " + valor);
        } else {
            System.out.println("Sem saldo suficiente");
        }
    }
    
    // getters and setters
    public String getTitular() {
        return titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getTotalDeConta(){
        return Conta.totalDeContas;
    }
}
