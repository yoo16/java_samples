package character;

import item.Item;
import monster.Monster;

public abstract class CharacterAbstract {

	public abstract void attack(Monster monster);
	
	public abstract boolean isAlive();

	public abstract void magic(Monster monster, String key);
	
	public abstract void equip(Item item);

}
