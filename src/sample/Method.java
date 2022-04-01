package sample;

public class Method {

	public static void main(String[] args) {
		Float answer = calculate(2f);
		System.out.println(answer);
		
		//オーバーロード
		hello("東京 太郎");
		hello("東京 太郎", "晴れ");
		
		int totalPrice = calculateTotalPrice(200, 5);
		System.out.println(totalPrice + "円");
		
		totalPrice = (int) calculateTotalPrice(200, 5, 0.1f);
		System.out.println(totalPrice + "円");
	}
	
	static Float calculate(Float x) {
		Float y = x + 5;
		return y;
	}

	//引数が1つのメソッド
	static void hello(String name) {
	    System.out.println(name + "さん、こんにちは！");
	}

	//引数が2つのメソッド
	static void hello(String name, String weather) {
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

	public Float totalPrice(Float x) {
		Float y = x + 5;
		return y;
	}
}
