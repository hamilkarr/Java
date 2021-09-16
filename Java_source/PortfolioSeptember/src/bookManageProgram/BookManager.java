package bookManageProgram;

//?��?�� �?리자 ?��?��?��
import java.util.HashMap;
import java.util.Scanner;

public class BookManager {
	Scanner scan = new Scanner(System.in);
	HashMap<String, Book> bookList = new HashMap<String, Book>();

	public void Load() {
		bookList.put("1001", new Book("1001", "1?��?���? ?���??�� 365", "?��?��?��", "?��?��?��"));
		bookList.put("1002", new Book("1002", "?�� ?��명서", "?��?���? ?��?��르슈?��?��", "?��빛길"));
		bookList.put("1003", new Book("1003", "?��?��?�� ?���?", "?��?��?��", "???��?���?"));
	}

	public void Run() {
		int key = 0;
		while ((key = selectMenu()) != 0) {
			switch (key) {
				case 1:
					listBook();
					break;
				case 2:
					searchBook();
					break;
				case 3:
					addBook();
					break;
				case 4:
					removeBook();
					break;

				default:
					System.out.println("?���? ?��?��?��?��?��?��.");
					break;
			}
		}
		System.out.println("종료?��?��?��...");
	}

	int selectMenu() {
		System.out.println("===================?��?�� �?�? ?��로그?�� ?��?��?��==============");
		System.out.println("============?��?��?�� 명령?�� 번호�? ?��?��?�� 주세?��============");
		System.out.println("1:?��?�� 목록  2:?��?�� �??��  3:?��?�� 추�?  4:?��?�� ?��?��  0:종료");
		//System.out.println("-->");
		int key = scan.nextInt();
		scan.nextLine();
		return key;
	}

	void listBook() {
		System.out.println("?��?�� 목록");

		int count = bookList.size();
		System.out.println("?��?�� ?��: " + count);
		for (Book book : bookList.values()) {
			System.out.println(book.toString());
		}
	}

	void addBook() {
		String bookNumber;
		System.out.print("?��?�� 번호:");
		bookNumber = scan.nextLine();
		if (bookList.containsKey(bookNumber)) {
			System.out.println("?���? 존재?��?�� ?��?�� 번호 ?��?��?��.");
			return;
		}
		String bookName;
		String author;
		String publisher;

		System.out.print("?��?�� ?���?:");
		bookName = scan.nextLine();
		System.out.print("???��:");
		author = scan.nextLine();
		System.out.println("출판?��:");
		publisher = scan.nextLine();
		Book book = new Book(bookNumber, bookName, author, publisher);
		bookList.put(bookNumber, book);
		System.out.println(book.toString() + " ?���? ?��???��?��?��.");
	}

	void removeBook() {
		String bookNumber;
		System.out.print("?��?��?�� ?��?�� 번호");
		bookNumber = scan.nextLine();
		if (bookList.containsKey(bookNumber)) {
			bookList.remove(bookNumber);
			System.out.println("?��?��?��???��?��?��.");
		} else {
			System.out.println("존재?���? ?��?��?��?��.");
		}
	}

	void searchBook() {
		String bookNumber;
		System.out.print("�??��?�� ?��?�� ISBN:");
		bookNumber = scan.nextLine();
		if (bookList.containsKey(bookNumber)) {
			Book book = bookList.get(bookNumber);
			System.out.println("�??�� 결과>>" + book.toString());
		} else {
			System.out.println("존재?���? ?��?��?��?��.");
		}
	}

}
