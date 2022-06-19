package zoo;

public class Dog extends Animal {

	public Dog(String name) {
		super(name);
		this.crying = "わん！";
	}

    @Override
	public void walk() {
		System.out.println(this.name + "が楽しそうに歩いてます。");
	}
	
	public void actionCollective() {
		System.out.println("集団行動");
	}

}
