public class OrderService {
    TaxCalculator taxCalculator;
    OrderStorage orderStorage;
    EmailClient email;

    public OrderService(TaxCalculator taxCalculator, OrderStorage orderStorage, EmailClient email){
        this.taxCalculator = taxCalculator;
        this.orderStorage = orderStorage;
        this.email = email;
    }

    void checkout(String customerEmail, double subtotal){
        double total = taxCalculator.totalWithTax(subtotal);
        email.send(customerEmail, "Thanks! Your total is " + total);
        orderStorage.store(total, customerEmail);
    }

   

}
