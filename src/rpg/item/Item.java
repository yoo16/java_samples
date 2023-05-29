package rpg.item;

public class Item {

	private String name;
	private ItemType type;
	private int attackPower;
	private int defencePower;
	private int price;

	public Item() {
		super();
	}

	public Item(ItemType type, String name, int attackPower, int defencePower, int price) {
		super();
		this.name = name;
		this.type = type;
		this.price = price;
		this.attackPower = attackPower;
		this.defencePower = defencePower;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ItemType getType() {
		return type;
	}

	public void setType(ItemType type) {
		this.type = type;
	}

	public int getAttackPower() {
		return attackPower;
	}

	public void setAttackPower(int attackPower) {
		this.attackPower = attackPower;
	}

	public int getDefencePower() {
		return defencePower;
	}

	public void setDefencePower(int defencePower) {
		this.defencePower = defencePower;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	

}
