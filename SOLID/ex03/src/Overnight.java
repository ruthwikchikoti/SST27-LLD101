public class Overnight implements IcostType {
    public double cost(double weightKg){
        return 120 + 10*weightKg;
    }
}
