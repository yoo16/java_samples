package sample;

public class Method {

	public static void main(String[] args) {
		Float answer = calculate(2f);
		System.out.println(answer);
		//コンパイルエラー
//		Float answer2 = calculate2(2f);

		//オーバーロード
		greet("東京 太郎");
		greet("東京 太郎", "晴れ");

		//演習1
		String message = loginMessage("東京 太郎");
		System.out.println(message);

		//演習2
		int point = calculatePoint(400);
		System.out.println(point + "pt");
		point = calculatePoint(400, 0.05f);
		System.out.println(point + "pt");
		
		//演習3
		int totalPrice = calculateTotalPrice(200, 5);
		System.out.println(totalPrice + "円");

		totalPrice = (int) calculateTotalPrice(200, 5, 0.1f);
		System.out.println(totalPrice + "円");
	}

	public static Float calculate(Float x) {
		Float y = x + 5;
		return y;
	}

	public Float calculate2(Float x) {
		Float y = x + 5;
		return y;
	}
	
	//引数が1つのメソッド
	static void greet(String name) {
		System.out.println(name + "さん、こんにちは！");
	}

	//引数が2つのメソッド
	static void greet(String name, String weather) {
		System.out.println(name + "さん。今日天気は" + weather + "です。");
	}

	static int calculateTotalPrice(int price, int amount) {
		int totalPrice = price * amount;
		return totalPrice;
	}

	static int calculateTotalPrice(int price, int amount, float tax) {
		float totalPrice = (float) price * (float) amount * (1 + tax);
		return (int) totalPrice;
	}

	static int calculatePoint(int price) {
		float point = price * 0.01f;
		return (int) point;
	}

	static int calculatePoint(int price, float pointRate) {
		float point = (float) price * pointRate;
		return (int) point;
	}

	static String loginMessage(String userName) {
		String message = "ようこそ、" + userName + "さん！";
		return message;
	}
	
}
