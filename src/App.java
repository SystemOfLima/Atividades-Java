public class App {
    public static void main(String[] args) {
        Conta conta1 = new Conta("Sofia");
        Conta conta2 = new Conta("Pedro");

        System.out.println("Nome do titular 1: " + conta1.getTitular());
        System.out.println("Nome do titular 2: " + conta2.getTitular());
        System.out.println("--------------------------");

        conta1.setSaldo(1000);
        conta2.setSaldo((2000));

        conta1.sacar(100);       
    }
}
