package character;

import item.Item;
import item.ItemList;

public class AppEquip {

	public static void main(String[] args) {
		ItemList itemList = new ItemList();
		itemList.load();

		Item weapon = itemList.map.get("bronz_knife");
		Item armor = itemList.map.get("bronz_armor");
		Item shield = itemList.map.get("bronz_shield");
		
		Wizard wizard = new Wizard("チャーリー");
		System.out.println("--- 装備前 ---");
		System.out.println(wizard.attackPower);
		System.out.println(wizard.defencePower);

		wizard.equip(weapon);
		wizard.equip(armor);
		wizard.equip(shield);
		System.out.println("--- 装備 ---");
		System.out.println(wizard.weapon.name);
		System.out.println(wizard.armor.name);
		System.out.println(wizard.shield.name);
		System.out.println("--- 装備後 ---");
		System.out.println(wizard.attackPower);
		System.out.println(wizard.defencePower);

	}
}
