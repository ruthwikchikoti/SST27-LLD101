public class CostTypeFactory {
    public static IcostType createCostType(String type){
        if (type.equals("STANDARD")) return new StandardShipping();
        if (type.equals("EXPRESS")) return new Express();
        if (type.equals("OVERNIGHT")) return new Overnight();
        throw new IllegalArgumentException("Unknown type: " + type);
    }
}
