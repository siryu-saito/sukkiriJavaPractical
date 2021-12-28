
public class StrongBox<E> {
	private E item;
	private KeyType KeyType;
	private long count;
	
	public StrongBox(KeyType k) {
		this.KeyType = k;
	}
	public void put(E i) { this.item = i; }
	public E get() {
		this.count++;
		switch (this.KeyType) {
			case PADLOCK:
				if (count < 10) return null;
				break;
			case BUTTON:
				if (count < 10000) return null;
				break;
			case DIAL:
				if (count < 30000) return null;
				break;
			case FINGER:
				if (count < 100000) return null;
				break;
		}
		this.count = 0;
		return this.item;
	}
}
