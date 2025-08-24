

public class Demo01 {
    public static void main(String[] args) {
       EmailClient email = new EmailClient();
       TaxCalculator taxCalculator = new TaxCalculator();
       OrderStorage orderStorage = new OrderStorage();
       OrderService orderService = new OrderService(taxCalculator, orderStorage, email);
       orderService.checkout("a@shop.com", 100.0);
       orderService.checkout("b@shop.com", 200.0);
       orderService.checkout("c@shop.com", 300.0);
    }
}
