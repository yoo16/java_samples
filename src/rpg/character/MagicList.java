package rpg.character;

import java.util.HashMap;
import java.util.Map;

public class MagicList {
	
	public Map<String, Magic> map;
	
	public MagicList() {
		this.load();
	}

	public void load() {
		map = new HashMap<>();
		map.put("fire", new Magic(MagicType.ATTACK, "ファイヤー", 4));
		map.put("ice", new Magic(MagicType.ATTACK, "アイス", 5));
		map.put("protec", new Magic(MagicType.DEFENCE, "プロテス", 5));
		map.put("heal", new Magic(MagicType.HEAL, "ヒール", 5));
	}
	
	public Magic get(String key) {
		return map.get(key);
	}
}
