package zoo;

public class AnimalApp {

	public static void main(String[] args) {
		Animal dog = new Dog("ポチ");
		Animal cat = new Cat("ミケ");
		
		dog.cry();
		cat.cry();
		dog.escape();
		cat.escape();
		
	}

}
