public class CAR  implements Recharge , StartEngine{

    public void startEngine(){
        System.out.println("Starting engine");
    }

    public void recharge(int kWh){
        System.out.println("Recharging " + kWh + " kWh");
    }
    

}
