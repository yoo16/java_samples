package cafe;

public class App3 {

	public static void main(String[] args) {
		Drink drink1 = new Drink("コーヒー", 350, Size.SMALL);
		Drink drink2 = new Drink("コーヒー", 400, Size.MEDIUM);
		Drink drink3 = new Drink("コーヒー", 450, Size.LARGE);
		
		System.out.println(drink1.size);
		System.out.println(drink2.size);
		System.out.println(drink3.size);

		System.out.println(drink1.size.getValue());
		System.out.println(drink2.size.getValue());
		System.out.println(drink3.size.getValue());
	}
}
