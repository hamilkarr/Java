package bookManagerProgram2;

public class Book {
	protected String bookNumber;
	protected String bookName;
	protected String author;
	protected String publisher;

	public Book(String bookNumber, String bookName, String author, String publisher) {
		this.bookNumber = bookNumber;
		this.bookName = bookName;
		this.author = author;
		this.publisher = publisher;
	}

	public String getBookNumber() {
		return bookNumber;
	}

	public void setBookNumber(String bookNumber) {
		this.bookNumber = bookNumber;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String toString() {
		return "도서 번호: " + bookNumber + " | 도서 제목: " + bookName + " | 작가: " + author + " | 출판사: " + publisher;
	}
}
