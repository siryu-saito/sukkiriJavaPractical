package lesson3;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<String> names =
			List.of("豊臣秀吉", "島左近", "徳川家康");
		names.stream()
			.filter(n -> n.length() <= 4)
			.map(n -> n + "さん")
			.forEach(System.out::println);
	}
}
