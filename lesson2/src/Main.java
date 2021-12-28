import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StrongBox<String> s = new StrongBox<>(KeyType.PADLOCK);
		s.put("お金");
		for (int i = 0; i < 10; i++) {
			System.out.println(s.get());
		}
	}
}
