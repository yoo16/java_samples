package rpg;

import java.util.HashMap;
import java.util.Map;
import rpg.character.*;
import rpg.character.Character;

public class App3 {

	public static void main(String[] args) {
		Map<Integer, Character> characterMap = new HashMap<>();
		characterMap.put(1, new Wizard("アリス"));
		characterMap.put(2, new Wizard("テリー"));
		characterMap.put(3, new Warrior("ボブ"));
		
		for (Integer key :characterMap.keySet()) {
			System.out.println(key);
		}

		for (Character character :characterMap.values()) {
			System.out.println(character.getName());
		}
	}

}
