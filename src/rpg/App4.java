package rpg;

import rpg.character.*;
import rpg.character.Character;

public class App4 {

	public static void main(String[] args) {
		//抽象クラスは直接インスタンス生成できない
		//CharacterAbstract = new CharacterAbstract();

		Character character = new Character("チャーリー");
		Wizard wizard = new Wizard("アリス");

		System.out.println(character.getName());
		System.out.println(wizard.getName());
	}

}
