public class Main {
	public static void main(String[] argv) {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();

		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("Dora ordered a " + pizza.getName() + "\n");

		pizza = nyStore.orderPizza("veggie");
		System.out.println("Dima ordered a " + pizza.getName() + "\n");

		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("Doma ordered a " + pizza.getName() + "\n");

		pizza = chicagoStore.orderPizza("veggie");
		System.out.println("Doa ordered a " + pizza.getName() + "\n");

		
	}
}