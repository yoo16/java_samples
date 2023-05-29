package sample;

import java.util.Arrays;
import java.util.Random;

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

		//
		int[] numbers = new int[3];
		numbers[0] = 55;
		numbers[1] = 31;
		numbers[2] = 72;
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);

		// コンパイルエラー
		// numbers[3] = 20;
		// System.out.println(numbers[3]);

		// 問題1
		int[] prices = { 350, 400, 300 };
		System.out.println(prices);

		// 問題2
		System.out.println(prices[1]);

		// 問題3
		String hands[] = { "グー", "チョキ", "パー" };
		Random rand = new Random();
		int handIndex = rand.nextInt(3);
		String hand = hands[handIndex];
		System.out.println(hand);
	}

}