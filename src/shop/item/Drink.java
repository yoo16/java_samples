package shop.item;

public class Drink {
	public String name;
	public int price;
	public int stock;
	public Size size;

	public Drink(String name, int price, int stock) {
		this.name = name;
		this.price = price;
		this.stock = stock;
	}

	public Drink(String name, int price, int stock, Size size) {
		this.name = name;
		this.price = price;
		this.stock = stock;
		this.size = size;
	}
	
}
