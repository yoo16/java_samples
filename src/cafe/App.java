package cafe;

import java.util.HashMap;
import java.util.Map;

public class App {

	public static void main(String[] args) {
		
		Map<Integer, Drink> drinkMap = new HashMap<>();
		drinkMap.put(1, new Drink("コーヒー", 350));
		drinkMap.put(2, new Drink("紅茶", 400));
		drinkMap.put(3, new Drink("ほうじ茶", 300));
		
		for (Integer key :drinkMap.keySet()) {
			System.out.println(key);
		}
		
		for (Drink drink :drinkMap.values()) {
			System.out.println(drink.name);
		}
		
		Drink drink = drinkMap.get(2);
		System.out.println(drink.price);

		Map<String, String> cityMap = new HashMap<>();
		cityMap.put("tokyo", "東京");
		cityMap.put("osaka", "大阪");
		cityMap.put("yokohama", "横浜");

		for (String key : cityMap.keySet()) {
			System.out.println(key);
		}
		for (String value : cityMap.values()) {
			System.out.println(value);
		}
	}

}
