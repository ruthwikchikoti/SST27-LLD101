public class Wallet implements IProvider {
    public void pay(Payment p){
        System.out.println("Wallet debit: " + p.amount);
    }
}
