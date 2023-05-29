package rpg.character;

import java.util.Random;
import rpg.monster.Monster;

public class Warrior extends Character {

	public Warrior(String name) {
		super(name);
		this.setJob("warrior");
		this.setHp(30);
		this.setMp(0);
		this.setAttackPower(10);
		this.setDefencePower(5);
	}

	@Override
	public void attack(Monster monster) {
		System.out.println("オーバーライド");
		
		//元の攻撃力をキャッシュ
		int attackPower = this.getAttackPower();

		// 1/5の確率で攻撃力を倍にする
		Random rand = new Random();
		if (rand.nextInt(5) == 0) this.setAttackPower(attackPower * 2);

		// スーパークラスのattack() を実行
		super.attack(monster);

		// 攻撃力を元に戻す
		this.setAttackPower(attackPower);
	}
}
