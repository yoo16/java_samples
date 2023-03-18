package sample;

public class ItemCalculate {

	public static void main(String[] args) {
		// calculate
		int answer = 1 + 2;
		answer = answer + 3;
		answer = answer - 2;
		answer = answer * 5;
		answer = answer / 2;

		System.out.println("答えは" + answer);

		int mod = answer % 3;
		System.out.println("余りは" + mod);

		// cast
		int price = 200;
		float pointRate = 0.05f;
		// price を float にキャスト
		float point = (float) price * pointRate;
		// point を int にキャスト
		System.out.println((int) point + "pt");

		String itemName = "コーヒー";
		String message = itemName + "の価格は" + price + "円です。";
		System.out.println(message);

		// cast
		answer = 4 / 3;
		System.out.println(answer);

		// 単項演算
		int amount = 5;
		// amount に 1 足した結果を amount に代入
		amount++;
		System.out.println(amount);

		// amount から 1 引いた結果を amount に代入
		amount--;
		System.out.println(amount);

		amount = 10;
		System.out.println(amount++ + amount++);

		amount = 10;
		System.out.println(++amount + ++amount);

		// 複合演算
		price = 110;
		amount = 3;
		// price から10ひく
		price -= 10;
		// price に amount をかける
		price *= amount;
		System.out.println(price);

		message = itemName + "の価格は" + price + "円です。";
		message += "購入しますか？";
		System.out.println(message);

		// 演習
		// 1
		int hp = 5;
		hp++;
		hp -= 4;
		hp *= 4;
		hp /= 2;

		System.out.println("HPは" + hp);

		// 論理演算
		price = 100;
		boolean is_match = false;

		// 左項と右項が等しいか
		is_match = (price == 100);
		System.out.println(is_match);

		// 左項と右項が等しくないか
		is_match = (price != 100);
		System.out.println(is_match);

		// 左項が右項より小さいか
		is_match = (price < 100);
		System.out.println(is_match);

		// 左項が右項より大きいか
		is_match = (price > 100);
		System.out.println(is_match);

		// 左項が右項以上か
		is_match = (price >= 100);
		System.out.println(is_match);

		// 同値チェック
		String str1 = "20";
		String str2 = "20";
		int number1 = 20;
		int number2 = 30;

		// String同士の比較
		is_match = (str1 == str2);
		System.out.println(is_match);

		// int同士の比較
		is_match = (number1 == number2);
		System.out.println(is_match);

		// Stringとintの比較
		is_match = (Integer.parseInt(str1) == number1);
		System.out.println(is_match);

		// オーバーフロー
		price = 100000;
		amount = 100000;
		int total_price = price * amount;
		System.out.println(total_price);

		// zero div
		// price = 100;
		// amount = 0;
		// float average = price / amount;
		// System.out.println(average);

		//
		price = 150;
		int money = 200;
		message = (money >= price) ? "購入できます" : "購入できません";
		System.out.println(message);

		// 演習
		// 1
		System.out.println("問題1");
		int temperature = 30;
		boolean is_hot = (temperature > 30);
		boolean is_cold = (temperature < 10);

		System.out.println(is_hot);
		System.out.println(is_cold);

		// 2
		// コンパイルエラー
		// float value1 = 20.f;
		// String value2 = "20";
		// boolean is_equal = (value1 == value2);
		// System.out.println(is_match);

		// 3
		System.out.println("問題3");
		String character_name = "Tokyo";
		String monster_name = "スライム";
		// int character_hp = 20;
		int monster_hp = 5;
		int damage = 10;
		String battle_message = character_name + "のこうげき！";
		String attack_message = (monster_hp > damage) ? "に" + damage + "のダメージ" : "はたおれた！";
		battle_message += monster_name + attack_message;
		System.out.println(battle_message);
	}

}
