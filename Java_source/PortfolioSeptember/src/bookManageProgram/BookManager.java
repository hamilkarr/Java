package bookManageProgram;

//?? κ΄?λ¦¬μ ?΄??€
import java.util.HashMap;
import java.util.Scanner;

public class BookManager {
	Scanner scan = new Scanner(System.in);
	HashMap<String, Book> bookList = new HashMap<String, Book>();

	public void Load() {
		bookList.put("1001", new Book("1001", "1??΄μ§? ?κ΅??¬ 365", "?¬?©?", "?½?Ό?"));
		bookList.put("1002", new Book("1002", "? ?€λͺμ", "?Ό?λ―? ??°λ₯΄μ??", "?λΉκΈΈ"));
		bookList.put("1003", new Book("1003", "?? ? ?λ³?", "? ? ? ", "????λ¬?"));
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
					System.out.println("?λͺ? ? ???΅??€.");
					break;
			}
		}
		System.out.println("μ’λ£?©??€...");
	}

	int selectMenu() {
		System.out.println("===================?? κ΄?λ¦? ?λ‘κ·Έ?¨ ???€==============");
		System.out.println("============??? λͺλ Ή? λ²νΈλ₯? ?? ₯?΄ μ£ΌμΈ?============");
		System.out.println("1:?? λͺ©λ‘  2:?? κ²??  3:?? μΆκ?  4:?? ?­?   0:μ’λ£");
		//System.out.println("-->");
		int key = scan.nextInt();
		scan.nextLine();
		return key;
	}

	void listBook() {
		System.out.println("?? λͺ©λ‘");

		int count = bookList.size();
		System.out.println("?? ?: " + count);
		for (Book book : bookList.values()) {
			System.out.println(book.toString());
		}
	}

	void addBook() {
		String bookNumber;
		System.out.print("?? λ²νΈ:");
		bookNumber = scan.nextLine();
		if (bookList.containsKey(bookNumber)) {
			System.out.println("?΄λ―? μ‘΄μ¬?? ?? λ²νΈ ???€.");
			return;
		}
		String bookName;
		String author;
		String publisher;

		System.out.print("?? ? λͺ?:");
		bookName = scan.nextLine();
		System.out.print("???:");
		author = scan.nextLine();
		System.out.println("μΆν?¬:");
		publisher = scan.nextLine();
		Book book = new Book(bookNumber, bookName, author, publisher);
		bookList.put(bookNumber, book);
		System.out.println(book.toString() + " ?±λ‘? ????΅??€.");
	}

	void removeBook() {
		String bookNumber;
		System.out.print("?­? ?  ?? λ²νΈ");
		bookNumber = scan.nextLine();
		if (bookList.containsKey(bookNumber)) {
			bookList.remove(bookNumber);
			System.out.println("?­? ????΅??€.");
		} else {
			System.out.println("μ‘΄μ¬?μ§? ??΅??€.");
		}
	}

	void searchBook() {
		String bookNumber;
		System.out.print("κ²???  ?? ISBN:");
		bookNumber = scan.nextLine();
		if (bookList.containsKey(bookNumber)) {
			Book book = bookList.get(bookNumber);
			System.out.println("κ²?? κ²°κ³Ό>>" + book.toString());
		} else {
			System.out.println("μ‘΄μ¬?μ§? ??΅??€.");
		}
	}

}
