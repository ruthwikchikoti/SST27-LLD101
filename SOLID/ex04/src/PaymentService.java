
public class PaymentService {
    IProvider provider;
    PaymentService(IProvider provider){
        this.provider = provider;
    }
    void pay(Payment p){
      provider.pay(p);
    }
}