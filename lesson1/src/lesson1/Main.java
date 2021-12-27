package lesson1;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) throws Exception {
		SimpleDateFormat f = new SimpleDateFormat("yyyy/mm/dd");
		List<Book> books = new ArrayList<>();
		
		Book b1 = new Book();
		b1.setTitle("Java入門");
		b1.setPublisDate(f.parse("2011/10/07"));
		b1.setComment("スッキリわかる");
		books.add(b1);
		Book b2 = new Book();
		b2.setTitle("Python入門");
		b2.setPublisDate(f.parse("2019/06/11"));
		b2.setComment("カレーが食べたくなる");
		books.add(b2);
		Book b3 = new Book();
		b3.setTitle("C言語入門");
		b3.setPublisDate(f.parse("2018/06/21"));
		b3.setComment("ポインタも自由自在");
		books.add(b3);
		
		Collections.sort(books, new TitleComparator());
		
		for (Book b : books) {
			System.out.println(b.getTitle()
					+ b.getPublisDate() + b.getComment());
		}
	}
}
