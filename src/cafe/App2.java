package cafe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;

public class App2 {

	public static void main(String[] args) {

        System.out.println("--- ArrayList Drink key ---");
		ArrayList<Drink> drinkList = new ArrayList<>();
		drinkList.add(new Drink("コーヒー", 350));
		drinkList.add(new Drink("紅茶", 400));
		drinkList.add(new Drink("ほうじ茶", 300));
		Iterator<Drink> iterator = drinkList.iterator();
		while (iterator.hasNext()) {
			Drink drink = iterator.next();
			System.out.println(drink.name);
		}
		
		Map<Integer, Drink> drinkMap = new HashMap<>();
		drinkMap.put(1, new Drink("コーヒー", 350));
		drinkMap.put(2, new Drink("紅茶", 400));
		drinkMap.put(3, new Drink("ほうじ茶", 300));

        System.out.println("--- Map Drink key ---");
		Iterator<Integer> keyIterator = drinkMap.keySet().iterator();
		while (keyIterator.hasNext()) {
			Integer key = keyIterator.next();
			System.out.println(key);
		}	

        System.out.println("--- Map Drink Value ---");
		Iterator<Drink> valueIterator = drinkMap.values().iterator();
		while (valueIterator.hasNext()) {
			Drink drink = valueIterator.next();
			System.out.println(drink.price);
		}	
		
        System.out.println("--- ListIterator ---");
        ListIterator<Drink> listIterator = drinkList.listIterator();
        listIterator.add(new Drink("カフェモカ", 350));
        //イテレータを1つ戻す
        listIterator.previous();
		while (listIterator.hasNext()) {
			Drink drink = listIterator.next();
			System.out.println(drink.name);
		}
		
		// 演習
        System.out.println("--- 演習 ---");
		Map<String, String> cityMap = new HashMap<>();
		cityMap.put("tokyo", "東京");
		cityMap.put("osaka", "大阪");
		cityMap.put("yokohama", "横浜");
		Iterator<String> cityIterator = cityMap.keySet().iterator();
		while (cityIterator.hasNext()) {
			String key = cityIterator.next();
			System.out.println(key);
		}	
		
		Map<Integer, Score> scoreMap = new HashMap<>();
		scoreMap.put(1, new Score("A", 67));
		scoreMap.put(2, new Score("B", 91));
		scoreMap.put(3, new Score("C", 55));
		scoreMap.put(3, new Score("D", 83));
		scoreMap.put(3, new Score("E", 74));

		Integer max = 0;
		Iterator<Score> scoreIterator = scoreMap.values().iterator();
		while (scoreIterator.hasNext()) {
			Score score = scoreIterator.next();
			if (score.value > max) {
				max = score.value;
			}
		}	
		System.out.println("最大値:" + max);
	}

}
