package character;

import java.util.Map;

public class MagicList {
	
	public Map<String, Magic> map;

	public void load() {
		map.put("fire", new Magic(MagicType.ATTACK, "ファイヤー", 4));
		map.put("ice", new Magic(MagicType.ATTACK, "アイス", 5));
		map.put("protec", new Magic(MagicType.DEFENCE, "プロテス", 5));
		map.put("heal", new Magic(MagicType.HEAL, "ヒール", 5));
	}
	
	public Magic get(MagicType magicType) {
		return map.get(magicType);
	}
}
