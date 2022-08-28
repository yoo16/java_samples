package cafe;

public class Drink {

	public String name;
	public Integer price;
	public Size size;

	public Drink(String name, Integer price) {
		super();
		this.name = name;
		this.price = price;
	}

	public Drink(String name, Integer price, Size size) {
		super();
		this.name = name;
		this.price = price;
		this.size = size;
	}


}
