public class UPI implements IProvider {
    public void pay(Payment p){
        System.out.println("Paid via UPI: " + p.amount);
    }
}
