package character;

import item.Item;
import item.ItemType;
import monster.Monster;

public class Character implements ICharacter {

	public String name;
	public String job;
	public int hp;
	public int mp;
    public int level;
    public int exp;
	public int attackPower;
	public int defencePower;
	public Item weapon;
	public Item armor;
	public Item shield;
	
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
	
	@Override
	public void attack(Monster monster) {
		int damage = this.attackPower - monster.defencePower;
		if (damage > 0) monster.hp -= damage;
	}

	@Override
	public void attackMagic(Monster monster, Magic magic) {
		if (mp < 0) System.out.println("MPがたりない！");
		System.out.println(magic.name + "を唱えた！");
		if (magic.type == MagicType.ATTACK) {
			int damage = this.attackPower + magic.power - monster.defencePower;
			if (damage > 0) monster.hp -= damage;
			System.out.println(monster.name + "に" + magic.power + "のダメージ！");
		}
	}

	@Override
	public void defenceMagic(Magic magic) {
		if (mp < 0) System.out.println("MPがたりない！");
		System.out.println(magic.name + "を唱えた！");
		if (magic.type == MagicType.DEFENCE) {
			this.defencePower += magic.power;
			System.out.println(this.name + "の防御力が" + magic.power + "あがった！");
		} else if (magic.type == MagicType.HEAL) {
			this.hp += magic.power;
			System.out.println(this.name + "のHPが" + magic.power + "回復！");
		}
	}
	
	@Override
	public boolean isAlive() {
		return (this.hp < 0);
	}

	@Override
	public void equip(Item item) {
		if (item.type == ItemType.WEAPON) {
			this.weapon = item;
			this.attackPower += item.attackPower;
		} else if (item.type == ItemType.ARMOR) {
			this.armor = item;
			this.defencePower += item.defencePower;
		} else if (item.type == ItemType.SHIELD) {
			this.shield = item;
			this.defencePower += item.defencePower;
		}
	}

}
