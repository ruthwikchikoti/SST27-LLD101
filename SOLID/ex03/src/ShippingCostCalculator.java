public class ShippingCostCalculator {

    double cost(Shipment s){
        String type = s.getType();
        double weightKg = s.getWeightKg();
        
        IcostType costType = CostTypeFactory.createCostType(type);
        return costType.cost(weightKg);
    }
}
