package rpg;

public class App {

	public static void main(String[] args) {
		Character wizard = new Character("アリス", "wizard");

		System.out.println(wizard.name);
		System.out.println(wizard.job);
		System.out.println(wizard.hp);
		System.out.println(wizard.level);
		
		wizard.walk("left");
		
		Character warrior = new Character("ボブ",  "warrior");

		wizard.talk(warrior, "勝負しましょう！");
		
		System.out.println(warrior.hp);
		wizard.attack(warrior);
		System.out.println(warrior.hp);
	}

}
