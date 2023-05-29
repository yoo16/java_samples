package rpg.monster;

import rpg.character.Character;

public class Monster {

	public String name;
	public int hp;
	public int mp;
	public int attackPower;
	public int defencePower;

	public Monster() {
		super();

		this.name = "スライム";
		this.hp = 5;
		this.mp = 0;
		this.attackPower = 2;
		this.defencePower = 1;
	}

	public void attack(Character character) {
		int damage = this.attackPower - character.getDefencePower();
		if (damage > 0) {
			character.setHp(character.getHp() - damage);
		}
	}

	public boolean isAlive() {
		return (this.hp > 0);
	}

}