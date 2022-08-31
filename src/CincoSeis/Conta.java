package CincoSeis;

public class Conta {

 

    private static int totalDeContas;
    
    public void setTotalDeContas (int totalDeContas){
        this.totalDeContas= totalDeContas;
    }
    Conta(){
        this.totalDeContas = this.totalDeContas + 1;
    } 
    public int getTotalDeContas() {
        return Conta.totalDeContas;
        }
} class FF {
    public static void main(String[] args) {
        Conta c = new Conta();
        int total = c.getTotalDeContas();
    }
}
