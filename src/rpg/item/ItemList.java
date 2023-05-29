package rpg.item;

import java.util.HashMap;
import java.util.Map;

public class ItemList {
	
	public Map<String, Item> map;
	
	public ItemList() {
		this.load();
	}

	public void load() {
		map = new HashMap<>();
		map.put("bronz_knife", new Item(ItemType.WEAPON, "ブロンズナイフ", 4, 0, 300));
		map.put("bronz_dagger", new Item(ItemType.WEAPON, "ブロンズダガー", 6, 0, 500));
		map.put("bronz_armor", new Item(ItemType.ARMOR, "ブロンズアーマー", 0, 4, 400));
		map.put("bronz_shield", new Item(ItemType.SHIELD, "ブロンズシールド", 0, 4, 600));
		map.put("normal_drink", new Item(ItemType.HEAL, "ノーマルドリンク", 0, 4, 50));
	}
	
}
