package rpg.character;

import rpg.item.Item;
import rpg.item.ItemType;
import rpg.monster.Monster;

public class Character implements ICharacter {

	
	private String name;
	private String job;
	private int hp;
	private int mp;
    private int level;
    private int exp;
	private int attackPower;
	private int defencePower;
	private Item weapon;
	private Item armor;
	private Item shield;
	
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

	public void greet(Character character, String message) {
		System.out.println(character.name + "!" + message);	
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
		if (item.getType() == ItemType.WEAPON) {
			this.weapon = item;
			this.attackPower += item.getAttackPower();
		} else if (item.getType() == ItemType.ARMOR) {
			this.armor = item;
			this.defencePower += item.getDefencePower();
		} else if (item.getType() == ItemType.SHIELD) {
			this.shield = item;
			this.defencePower += item.getDefencePower();
		}
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getHp() {
		return hp;
	}


	public void setHp(int hp) {
		this.hp = hp;
	}


	public int getMp() {
		return mp;
	}


	public void setMp(int mp) {
		this.mp = mp;
	}


	public int getLevel() {
		return level;
	}


	public void setLevel(int level) {
		this.level = level;
	}


	public int getExp() {
		return exp;
	}


	public void setExp(int exp) {
		this.exp = exp;
	}


	public int getAttackPower() {
		return attackPower;
	}


	public void setAttackPower(int attackPower) {
		this.attackPower = attackPower;
	}


	public int getDefencePower() {
		return defencePower;
	}


	public void setDefencePower(int defencePower) {
		this.defencePower = defencePower;
	}


	public Item getWeapon() {
		return weapon;
	}


	public void setWeapon(Item weapon) {
		this.weapon = weapon;
	}


	public Item getArmor() {
		return armor;
	}


	public void setArmor(Item armor) {
		this.armor = armor;
	}


	public Item getShield() {
		return shield;
	}


	public void setShield(Item shield) {
		this.shield = shield;
	}

}
