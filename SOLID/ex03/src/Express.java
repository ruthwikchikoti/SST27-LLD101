public class Express implements IcostType {
    public double cost(double weightKg){
        return 80 + 8*weightKg;
    }
}
