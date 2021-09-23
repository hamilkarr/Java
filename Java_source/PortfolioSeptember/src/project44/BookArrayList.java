package project44;

import java.util.ArrayList;
import java.util.Iterator;

import project33.Book;

public class BookArrayList {
	private ArrayList<Book> bookList;
	private boolean checkOut;

	public BookArrayList() {
		bookList = new ArrayList<Book>();
	}

	// 도서 추가
	public void addBook(Book book) {
		bookList.add(book);
	}

	// 도서 삭제
	public boolean removeBook(int booknumber) {
		Iterator<Book> iterator = bookList.iterator();
		while (iterator.hasNext()) {
			Book book = iterator.next();
			int getNum = book.getBookNumber();
			if (booknumber == getNum) {
				bookList.remove(book);
				return true;
			}
		}
		System.out.println(booknumber + " (이)가 존재하지 않습니다.");
		return false;
	}

	// 대출상태
	// String a = (checkOut ==true) ? "대출가능" : "대출불가";

	public void showAllBook() {
		System.out.println(" 등록번호   |    서명   |    저자   |    출판사   |");
		for (Book book : bookList) {
			System.out.println(book);
		}
	}

	public Book get(int i) {
		return bookList.get(i);
	}

	public int size() {
		return bookList.size();
	}

	public Book set(int i, Book book) {
		return bookList.set(i, book);
	}
}
