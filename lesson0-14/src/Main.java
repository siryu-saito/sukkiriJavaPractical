
public class Main {
	public static void main(String[] args) {
		BankAccount a = new BankAccount("4649", 1592);
		BankAccount b = new BankAccount("0129", 5719);
		
		System.out.println(a);
		System.out.println(a.equals(b));
	}

}
