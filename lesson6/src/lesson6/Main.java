package lesson6;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		baos.write(65);
		baos.write(66);
		byte[] data = baos.toByteArray();
		for (byte b : data) {
			System.out.println(b);
		}
		
//		System.in.read();
		
//		try (FileWriter fw = new FileWriter("rpgsave.dat", true);) {
//			fw.write('A');
//			fw.flush();
//		} catch (IOException e) {
//			System.out.println("ファイル書き込みエラーです");
//		}
		
//		FileWriter fw = null;
//		try {
//			fw = new FileWriter("rpgsave.dat", true);
//			fw.write('A');
//			fw.flush();
//		} catch (IOException e) {
//			System.out.println("ファイル書き込みエラーです");
//		} finally {
//			if (fw != null) {
//				try {
//					fw.close();
//				} catch (IOException e2) {}
//			}
//		}
		
//		FileOutputStream fos =
//				new FileOutputStream("rpgsave.dat", true);
//		fos.write(65);
//		fos.flush();
//		fos.close();
		
//		FileReader fw = new FileReader("rpgsave.dat");
//		System.out.println("すべてのデータを読んで表示します");
//		int i = fw.read();
//		while (i != -1) {
//			char c = (char)i;
//			System.out.println(c);
//			i = fw.read();
//		}
//		System.out.println("ファイルの末尾に到達しました");
//		fw.close();
		
//		FileWriter fw = new FileWriter("c:¥¥rpgsave.dat", true);
//		fw.write('A');
//		fw.flush();
//		fw.close();
	}
}
