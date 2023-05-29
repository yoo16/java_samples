package rpg;

import rpg.monster.Monster;
import rpg.character.*;
import rpg.character.Character;

public class App {

	public static void main(String[] args) {
		Wizard wizard = new Wizard("アリス");
		wizard.greet("こんにちは");

		Warrior warrior = new Warrior("ボブ");
		warrior.greet("どーも");
		warrior.showStatus();

		Monster monster = new Monster();
		//		wizard.attack(monster);
		warrior.attack(monster);

		System.out.println(monster.hp);
		System.out.println(monster.isAlive());

		Wizard wizard1 = new Wizard("アリス");
		Wizard wizard2 = new Wizard("テリー");
		Warrior warrior1 = new Warrior("ボブ");

		Character[] characters = { wizard1, wizard2, warrior1 };
		System.out.println(characters);

		System.out.println("--- Battle ---");
		Monster monster1 = new Monster();

		for (Character character : characters) {
			System.out.println(character.getName() + "の攻撃");
			character.attack(monster1);
			System.out.println(monster1.isAlive());
		}

	}

}
