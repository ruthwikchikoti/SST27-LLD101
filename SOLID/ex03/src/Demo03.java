public class Demo03 {
    public static void main(String[] args) {
        System.out.println(new ShippingCostCalculator().cost(new Shipment("EXPRESS", 2.0)));
        System.out.println(new ShippingCostCalculator().cost(new Shipment("STANDARD", 2.0)));
        System.out.println(new ShippingCostCalculator().cost(new Shipment("OVERNIGHT", 2.0)));
        System.out.println(new ShippingCostCalculator().cost(new Shipment("INVALID", 2.0)));
    }
}
