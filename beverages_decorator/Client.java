package beverages_decorator;

public class Client {

	public static void main(String[] args) {
		Beverage c1 = BeverageFactory.create("cappuccino", true, true);
		System.out.println("Cappuccino + milk + sugar: " + c1.cost());
		Beverage c2 = BeverageFactory.create("latte", true, false);
		System.out.println("Latte + milk: " + c2.cost());
	}

}