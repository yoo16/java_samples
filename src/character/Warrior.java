package character;

import java.util.Random;

import monster.Monster;

public class Warrior extends Character {

	public Warrior(String name) {
		super(name);
		this.job = "warrior";
		this.hp = 30;
		this.mp = 0;
		this.attackPower = 10;
		this.defencePower = 5;
	}

	@Override
	public void attack(Monster monster) {
		System.out.println("オーバーライド");
		
		//元の攻撃力をキャッシュ
		int attackPower = this.attackPower;

		// 1/5の確率で攻撃力を倍にする
		Random rand = new Random();
		if (rand.nextInt(5) == 0) this.attackPower = attackPower * 2;

		// スーパークラスのattack() を実行
		super.attack(monster);

		// 攻撃力を元に戻す
		this.attackPower = attackPower;
	}
}
