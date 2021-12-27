package lesson1;

import java.util.Date;
import java.util.Objects;

public class Book implements Comparable<Book>, Cloneable {
	private String title;
	private Date publishDate;
	private String comment;
	
	public int hashCode() {
		 return Objects.hash(this.title, this.publishDate, this.comment);
	}
	
	public boolean equals(Object obj) {
		if (obj == this) return true;
		if (obj == null) return false;
		if (!(obj instanceof Book)) return false;
		Book b = (Book)obj;
		if (!this.title.equals(b.title) || !this.publishDate.equals(b.publishDate)) {
			return false;
		}
		return true;
	}
	
	public int compareTo(Book o) {
		return this.publishDate.compareTo(o.publishDate);
	}
	
	public Book clone() {
		Book result = new Book();
		result.title = this.title;
		result.comment = this.comment;
		result.publishDate = (Date)this.publishDate.clone();
		return result;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public Date getPublisDate() {
		return this.publishDate;
	}
	
	public void setPublisDate(Date publishDate) {
		this.publishDate = publishDate;
	}
	
	public String getComment() {
		return this.comment;
	}
	
	public void setComment(String comment) {
		this.comment = comment;
	}
}
