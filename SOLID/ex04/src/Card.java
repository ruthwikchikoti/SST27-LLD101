public class Card implements IProvider {
    public void pay(Payment p){
        System.out.println("Charged card: " + p.amount);
    }
}
