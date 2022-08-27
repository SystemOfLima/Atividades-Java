package CincoUm;

public class Conta {
    String titular;
    int numero;
    private double saldo;

    public void sacar(double valor) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
        } else {
            System.out.println("Sem saldo suficiente");
        }
    }
}