package character;

import monster.Monster;

public class Character {

	public String name;
	public String job;
	public int hp;
	public int mp;
    public int level;
    public int exp;
	public int attackPower;
	public int defencePower;
	
	public Character(String name) {
		super();
		this.name = name;
		this.level = 1;
		this.exp = 0;
	}

	public void greet(String message) {
		System.out.println(message);
	}
	
	public void showStatus() {
		System.out.println("---- Status ----");
		System.out.println("Name: " + this.name);
		System.out.println("Job: " + this.job);
		System.out.println("HP: " + this.hp);
		System.out.println("MP: " + this.mp);
		System.out.println("Lv: " + this.level);
		System.out.println("Exp: " + this.exp);
		System.out.println("Attack: " + this.attackPower);
		System.out.println("Defence: " + this.defencePower);
		System.out.println("--------");
	}
	
	public void attack(Monster monster) {
		int damage = this.attackPower - monster.defencePower;
		if (damage > 0) monster.hp -= damage;
	}

	public void magic(Monster monster, int magicType) {
		if (mp < 0) System.out.println("MPがたりない！");
		int damage = this.attackPower - monster.defencePower;
		if (damage > 0) monster.hp -= damage;
	}

	public boolean isAlive() {
		return (this.hp < 0);
	}

}
