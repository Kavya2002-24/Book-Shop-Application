package BookWeb_Dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Book_Dto {
 
	@Id
	@GeneratedValue
	private int  BookId;
	private String BookName;
	private String BookEdition;
	private float  BookPrice;
	
	
	public int getBookId() {
		return BookId;
	}
	public void setBookId(int bookId) {
		BookId = bookId;
	}
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	public String getBookEdition() {
		return BookEdition;
	}
	public void setBookEdition(String bookEdition) {
		BookEdition = bookEdition;
	}
	public float getBookPrice() {
		return BookPrice;
	}
	public void setBookPrice(float bookPrice) {
		BookPrice = bookPrice;
	}
	
	
	
	
}
