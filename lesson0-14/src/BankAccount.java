
public class BankAccount {
	String accountNumber;
	int balance;
	
	public BankAccount(String a, int b) {
		this.accountNumber = a;
		this.balance = b;
	}
	
	public String toString() {
		return "口座番号" + this.accountNumber + "/残高" + this.balance;
	}
	
	public boolean equals(Object o) {
		if (this == o) { return true; }
		
		if (o instanceof BankAccount) {
			BankAccount a = (BankAccount)o;
			if (this.accountNumber.equals(a.accountNumber)) {
				return true;
			}
		}
		return false;
	}
}
