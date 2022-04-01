package sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ItemCollection {

	public static void main(String[] args) {
		//List
		List<String> list = Arrays.asList("コーヒー", "紅茶", "ほうじ茶");
		System.out.println(list);
		
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
		drinkList.add("炭酸水");
		System.out.println(drinkList2);

		drinkList.remove(2);
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
