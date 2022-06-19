package zoo;

public class Cat extends Animal {

	public Cat(String name) {
		super(name);
		this.crying = "にゃー！";
	}

    @Override
	public void walk() {
		System.out.println(this.name + "が警戒して歩いてます。");
	}

	public void cry() {
		super.cry();
	}
	
	public void actionSolo() {
		System.out.println("単独行動");
	}
}
