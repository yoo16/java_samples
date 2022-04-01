package sample;

import java.util.Random;

public class ItemRepeat {

	public static void main(String[] args) {
		//for
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}

		for (int x = 1; x <= 10; x++) {
			for (int y = 1; y <= 10; y++) {
				String plot = "(" + x + "," + y + ")";
				System.out.print(plot);
			}
			System.out.println();
		}

		//length
		String[] drinks = { "コーヒー", "紅茶", "ほうじ茶" };
		for (int i = 0; i < drinks.length; i++) {
			String drink = drinks[i];
			System.out.println(drink);
		}
		
		//問題1
		int sum = 0;
		for (int i = 1; i <= 1000; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		//問題2
		for (int x = 1; x <= 9; x++) {
			for (int y = 1; y <= 9; y++) {
				int answer = x * y;
				
				System.out.print(answer + " ");
			}
			System.out.println();
		}		
		
		//問題3
	    Random rand = new Random();
	    String[] marks = { "○", "●" };
	   
		for (int x = 1; x <= 5; x++) {
			for (int y = 1; y <= 5; y++) {
				int markIndex = rand.nextInt(marks.length);
				String mark = marks[markIndex];
				String result = "|" + mark;
				System.out.print(result);
			}
			System.out.println("|");
		}

		//while
		int i = 0;
		while (i <= 10) {
			i++;
		}
		System.out.println(i);
		
		//break
		i = 0;
		while (i <= 10) {
		    System.out.println(i);
		    break;
		}
		System.out.println(i);
		
		//do while
		i = 0;
		do {
		    i++;
		} while (i <= 10);
		System.out.println(i);

		//問題1
		int count = 0;
		int number = 1;
		int multiple = 17;
		while (number < 1000) {
		    count++;
		    number = multiple * count;
		    //System.out.println(number);
		}
		String countMessage = multiple + "の倍数は" + count + "個あります";
		System.out.println(countMessage);
		
		//問題2
		float money = 1000000;
		float target = 2000000;
		float interestRate = 0.01f;
		int year = 0;
		while (money < target) {
			money *= (1 + interestRate);
			year++;
		}
		String message = year + "年後に" + money + "円になります。";
		System.out.println(message);
	    
	}

}
