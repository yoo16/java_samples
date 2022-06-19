package sample;

import java.util.Arrays;

public class Weekday {

	public static void main(String[] args) {
		String[] weekdays = new String[7];
		weekdays[0] = "日";
		weekdays[1] = "月";
		weekdays[2] = "火";
		weekdays[3] = "水";
		weekdays[4] = "木";
		weekdays[5] = "金";
		weekdays[6] = "土";
		
		System.out.println(weekdays.length);
		System.out.println(Arrays.toString(weekdays));
	}

}
