public class StandardShipping implements IcostType {
    public double cost(double weightKg){
        return 50 + 5*weightKg;
    }
}
