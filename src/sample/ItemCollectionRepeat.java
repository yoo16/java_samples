package sample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ItemCollectionRepeat {

	public static void main(String[] args) {
		//ArrayList Iterator
		ArrayList<String> drinkList = new ArrayList<>();
		drinkList.add("コーヒー");
		drinkList.add("紅茶");
		drinkList.add("ほうじ茶");
		
		Iterator<String> iterator = drinkList.iterator();
		while (iterator.hasNext()) {
			String drink = iterator.next();
			System.out.println(drink);
		}
		
		//Map Iterator
		Map<String, String> drinkMap = new HashMap<>();
		drinkMap.put("coffee", "コーヒー");
		drinkMap.put("black tea", "紅茶");
		drinkMap.put("roasted green tea", "紅茶");
		
		Iterator<String> keyIterator = drinkMap.keySet().iterator();
		while (keyIterator.hasNext()) {
			String value = keyIterator.next();
			System.out.println(value);
		}
		
		Iterator<String> valueIterator = drinkMap.values().iterator();
		while (valueIterator.hasNext()) {
			String value = valueIterator.next();
			System.out.println(value);
		}
	}

}
