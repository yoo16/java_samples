package rpg;

import java.util.ArrayList;
import java.util.Arrays;
import rpg.character.*;
import rpg.character.Character;

public class App2 {

	public static void main(String[] args) {
		ArrayList<Character> characterList = new ArrayList<Character>(
				Arrays.asList(
						new Wizard("アリス"),
						new Wizard("テリー"),
						new Warrior("ボブ")));

		for (Character character : characterList) {
			System.out.println(character.getName());
		}
		
		//データ取得
		Character selectCharacter = characterList.get(1);
		System.out.println(selectCharacter.getName());
		
		//データ追加
		characterList.add(new Warrior("ライアン"));
		int count = characterList.size();
		System.out.println(count);
		int lastIndex = count - 1;
		System.out.println(characterList.get(lastIndex).getName());
		
		//データ削除
		characterList.remove(1);
		for (Character character : characterList) {
			System.out.println(character.getName());
		}
		
		
	}

}
