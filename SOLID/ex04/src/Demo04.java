
public class Demo04 {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService(new UPI());
        paymentService.pay(new Payment("UPI", 499));
        paymentService = new PaymentService(new Card());
        paymentService.pay(new Payment("CARD", 499));
        paymentService = new PaymentService(new Wallet());
        paymentService.pay(new Payment("WALLET", 499));
    }
}
