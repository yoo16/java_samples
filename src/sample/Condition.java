package sample;

import java.util.Calendar;

public class Condition {

	public static void main(String[] args) {
		
		float distance = 3.0f;
		String moveingMethod;
		boolean isRain = false;
		if (isRain) {
			moveingMethod = "家にいます";
		} else {
			if (distance >= 5) {
				moveingMethod = "電車";
			} else if (distance >= 1 && distance < 5) {
				moveingMethod = "自転車";
			} else {
				moveingMethod = "徒歩";
			}
		}
		System.out.println(moveingMethod);

		//		String weekday = "月";
		//		String garbage = "";
		//		switch (weekday) {
		//		    case "月":
		//		    case "金":
		//		        garbage = "燃えるゴミ";
		//		        break;
		//		    case "水":
		//		        garbage = "燃えないゴミ";
		//		        break;
		//		    default:
		//		        garbage = "回収なし";
		//		        break;
		//		}
		//		System.out.println(garbage);

		Calendar cal = Calendar.getInstance();
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);

		//演習
		//問題1,2
		int age = 18;
		boolean isBlackList = false;
		boolean hasBankAccounts = false;
		String message = "";

		if (!isBlackList && age >= 18 && age < 65) {
			if (hasBankAccounts) {
				message = "クレジットカード作成可能です";
			} else {
				message = "審査が必要です";
			}
		} else {
			message = "クレジットカードを作成できません";
		}
		System.out.println(message);

		//問題3
		String garbage = "";
		switch (dayOfWeek) {
		case Calendar.MONDAY:
		case Calendar.FRIDAY:
			garbage = "燃えるゴミ";
			break;
		case Calendar.WEDNESDAY:
			garbage = "燃えないゴミ";
			break;
		default:
			garbage = "回収なし";
			break;
		}
		System.out.println(dayOfWeek);
		System.out.println(garbage);
	}

}

