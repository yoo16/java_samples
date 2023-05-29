package rpg;

import rpg.item.Item;
import rpg.item.ItemList;
import rpg.character.*;
import rpg.character.Character;

public class AppEquip {

	public static void main(String[] args) {
		ItemList itemList = new ItemList();
		itemList.load();

		Item weapon = itemList.map.get("bronz_knife");
		Item armor = itemList.map.get("bronz_armor");
		Item shield = itemList.map.get("bronz_shield");
		
		Wizard wizard = new Wizard("チャーリー");
		System.out.println("--- 装備前 ---");
		System.out.println(wizard.getAttackPower());
		System.out.println(wizard.getDefencePower());

		wizard.equip(weapon);
		wizard.equip(armor);
		wizard.equip(shield);
		System.out.println("--- 装備 ---");
		System.out.println(wizard.getWeapon().getName());
		System.out.println(wizard.getArmor().getName());
		System.out.println(wizard.getShield().getName());
		System.out.println("--- 装備後 ---");
		System.out.println(wizard.getAttackPower());
		System.out.println(wizard.getDefencePower());

	}
}
