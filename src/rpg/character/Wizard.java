package rpg.character;

public class Wizard extends Character {
	
	public Wizard(String name) {
		super(name);
		this.setJob("wizard");
		this.setHp(10);
		this.setMp(20);
		this.setAttackPower(3);
		this.setDefencePower(5);
	}

}
