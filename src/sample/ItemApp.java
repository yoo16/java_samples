package sample;

public class ItemApp {

	public static void main(String[] args) {
		String itemName;
		int price;
		int amount;
		boolean is_sale = true;

		itemName = "コーヒー";
		price = 120;
		amount = 5;

		System.out.println(itemName);
		System.out.println(price);
		System.out.println(amount);
		System.out.println(is_sale);

		System.out.println(itemName + "の価格は" + price + "円です");

		final float TAX_RATE = 0.1f;
		System.out.println(TAX_RATE);

//		final TOKYO = "東京";
//		final int TOKYO = "東京";
//		String TOKYO = "東京";
		final String TOKYO = "東京";
		// TOKYO = "とうきょう";
		System.out.println(TOKYO);
	}

}
