package character;

import item.Item;
import monster.Monster;

public interface ICharacter {

	public void attack(Monster monster);
	
	public boolean isAlive();

	public void magic(Monster monster, MagicType magicType);
	
	public void equip(Item item);

}
