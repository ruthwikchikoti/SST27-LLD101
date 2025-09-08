package beverages_decorator;

public class BeverageFactory {
    public static Beverage create(String type, boolean milk, boolean sugar) {
        Beverage base;
        if ("latte".equalsIgnoreCase(type)) {
            base = new Latte();
        } else if ("cappuccino".equalsIgnoreCase(type)) {
            base = new Cappuccino();
        } else {
            throw new IllegalArgumentException("Unknown beverage: " + type);
        }

        if (milk) base = new MilkDecorator(base);
        if (sugar) base = new SugarDecorator(base);
        return base;
    }
}

