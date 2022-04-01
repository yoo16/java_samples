package sample;

import java.util.Arrays;

public class Drink {

	public static void main(String[] args) {
		// 配列
		String[] drinks = { "コーヒー", "紅茶", "ほうじ茶" };
		System.out.println(drinks);

		String arrayString = Arrays.toString(drinks);
		System.out.println(arrayString);

		String selectDrink = drinks[1];
		System.out.println(selectDrink);

		drinks[1] = "ウーロン茶";
		System.out.println(drinks[1]);

		// 問題1
		int[] prices = { 350, 400, 300 };
		System.out.println(prices);

		// 問題2
		System.out.println(prices[1]);
	}

}