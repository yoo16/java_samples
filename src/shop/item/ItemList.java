package shop.item;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ItemList {

	public static void main(String[] args) {
		//List
		List<Drink> drinks = Arrays.asList(
				new Drink("コーヒー", 350, 10),
				new Drink("紅茶", 350, 10),
				new Drink("ほうじ茶", 350, 10));
		
		for (Drink drink : drinks) {
			System.out.println(drink.name);
			System.out.println(drink.price);
			System.out.println(drink.stock);
		}

		// ArrayList
		ArrayList<String> drinkList = new ArrayList<>(Arrays.asList("コーヒー", "紅茶", "ほうじ茶"));
		String selectListDrink = drinkList.get(1);
		System.out.println(selectListDrink);

		drinkList.add("炭酸水");
		System.out.println(drinkList);

		drinkList.remove(2);
		System.out.println(drinkList);

		// LinkedList
		LinkedList<String> drinkList2 = new LinkedList<>(Arrays.asList("コーヒー", "紅茶", "ほうじ茶"));
		drinkList2.add("炭酸水");
		System.out.println(drinkList2);

		drinkList2.remove(2);
		System.out.println(drinkList2);

		// Map
		Map<Integer, String> drinkNames = new HashMap<>();
		drinkNames.put(1, "コーヒー");
		drinkNames.put(2, "紅茶");
		drinkNames.put(3, "ほうじ茶");

		System.out.println(drinkNames);

		String selectMap = drinkNames.get(2);
		System.out.println(selectMap);

		Map<String, String> drinkMap = new HashMap<>();
		drinkMap.put("coffee", "コーヒー");
		drinkMap.put("black tea", "紅茶");
		drinkMap.put("roasted green tea", "紅茶");
	}

}
