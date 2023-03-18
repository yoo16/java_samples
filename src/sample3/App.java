package sample3;

public class App {

	public static void main(String[] args) {
		sample1.User user1 = new sample1.User();
		sample2.User user2 = new sample2.User();

		System.out.println(user1.getClass());
		System.out.println(user2.getClass());
	}
}
