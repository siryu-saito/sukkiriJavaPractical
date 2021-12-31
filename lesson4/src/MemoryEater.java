import java.util.Locale;

public class MemoryEater {
	public static void main(String[] args) {
		if (Locale.getDefault().getLanguage().equals("ja")) {
			System.out.println("メモリをしょうひしています・・・");
		} else {
			System.out.println("eating memory・・・");
		}
		
		long[] larray = new long[1280000];
		for (int i = 0; i < larray.length; i++) {
			larray[i] = i;
		}
	}
}
