package shop;

import shop.item.Drink;
import shop.item.Size;

public class App {

	public static void main(String[] args) {
		Drink drink = new Drink("コーヒー", 150, 100, Size.LARGE);
		System.out.println(drink.name);
		System.out.println(drink.size);
	}

}
