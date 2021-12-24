import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		Hero h1 = new Hero("齋藤");
		Hero h2 = new Hero("佐藤");
		Map<Hero, Integer> heros = new HashMap<>();
		heros.put(h1, 3);
		heros.put(h2, 7);
		
		for (Hero h : heros.keySet()) {
			int value = heros.get(h);
			System.out.println(h.getName() + "が倒した数=" + value);
		}
	}
}