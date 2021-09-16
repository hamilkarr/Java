package bookManageProgram;

//?„?„œ ê´?ë¦¬ì ?´?˜?Š¤
import java.util.HashMap;
import java.util.Scanner;

public class BookManager {
	Scanner scan = new Scanner(System.in);
	HashMap<String, Book> bookList = new HashMap<String, Book>();

	public void Load() {
		bookList.put("1001", new Book("1001", "1?˜?´ì§? ?•œêµ??‚¬ 365", "?‹¬?š©?™˜", "?”½?”¼?‹œ"));
		bookList.put("1002", new Book("1002", "?ˆ ?„¤ëª…ì„œ", "?¼?Šˆë¯? ?‹œ?°ë¥´ìŠˆ?Œ?“œ", "?†”ë¹›ê¸¸"));
		bookList.put("1003", new Book("1003", "?™„? „?•œ ?–‰ë³?", "? •?œ ? •", "???–‰?‚˜ë¬?"));
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
					System.out.println("?˜ëª? ?„ ?ƒ?–ˆ?Šµ?‹ˆ?‹¤.");
					break;
			}
		}
		System.out.println("ì¢…ë£Œ?•©?‹ˆ?‹¤...");
	}

	int selectMenu() {
		System.out.println("===================?„?„œ ê´?ë¦? ?”„ë¡œê·¸?¨ ?…?‹ˆ?‹¤==============");
		System.out.println("============?›?•˜?Š” ëª…ë ¹?˜ ë²ˆí˜¸ë¥? ?…? ¥?•´ ì£¼ì„¸?š”============");
		System.out.println("1:?„?„œ ëª©ë¡  2:?„?„œ ê²??ƒ‰  3:?„?„œ ì¶”ê?  4:?„?„œ ?‚­? œ  0:ì¢…ë£Œ");
		//System.out.println("-->");
		int key = scan.nextInt();
		scan.nextLine();
		return key;
	}

	void listBook() {
		System.out.println("?„?„œ ëª©ë¡");

		int count = bookList.size();
		System.out.println("?„?„œ ?ˆ˜: " + count);
		for (Book book : bookList.values()) {
			System.out.println(book.toString());
		}
	}

	void addBook() {
		String bookNumber;
		System.out.print("?„?„œ ë²ˆí˜¸:");
		bookNumber = scan.nextLine();
		if (bookList.containsKey(bookNumber)) {
			System.out.println("?´ë¯? ì¡´ì¬?•˜?Š” ?„?„œ ë²ˆí˜¸ ?…?‹ˆ?‹¤.");
			return;
		}
		String bookName;
		String author;
		String publisher;

		System.out.print("?„?„œ ? œëª?:");
		bookName = scan.nextLine();
		System.out.print("???:");
		author = scan.nextLine();
		System.out.println("ì¶œíŒ?‚¬:");
		publisher = scan.nextLine();
		Book book = new Book(bookNumber, bookName, author, publisher);
		bookList.put(bookNumber, book);
		System.out.println(book.toString() + " ?“±ë¡? ?•˜???Šµ?‹ˆ?‹¤.");
	}

	void removeBook() {
		String bookNumber;
		System.out.print("?‚­? œ?•  ?„?„œ ë²ˆí˜¸");
		bookNumber = scan.nextLine();
		if (bookList.containsKey(bookNumber)) {
			bookList.remove(bookNumber);
			System.out.println("?‚­? œ?•˜???Šµ?‹ˆ?‹¤.");
		} else {
			System.out.println("ì¡´ì¬?•˜ì§? ?•Š?Šµ?‹ˆ?‹¤.");
		}
	}

	void searchBook() {
		String bookNumber;
		System.out.print("ê²??ƒ‰?•  ?„?„œ ISBN:");
		bookNumber = scan.nextLine();
		if (bookList.containsKey(bookNumber)) {
			Book book = bookList.get(bookNumber);
			System.out.println("ê²??ƒ‰ ê²°ê³¼>>" + book.toString());
		} else {
			System.out.println("ì¡´ì¬?•˜ì§? ?•Š?Šµ?‹ˆ?‹¤.");
		}
	}

}
