package book2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class BookArrayList {
	public static void main(String[] args) {
		Book book1 = new Book("EM", 1001, "1������ �ѱ��� 365", "�ɿ�ȯ", "���ǽ�", true, " 909-��66��");
		Book book2 = new Book("EM", 1002, "�� ����", "�󽴹� �õ������ǵ�", "�ֺ���", true, "327.04-��754��");
		Book book3 = new Book("EM", 1003, "������ �ູ", "������", "���೪��", false, "813.7-��67��2");

		ArrayList<Book> bookList = new ArrayList<>();
		bookList.add(book1);
		bookList.add(book2);
		bookList.add(book3);

		// bookList.stream().map(c -> c.getBookName()).forEach(s -> System.out.println(s));

		System.out.println("================================");
		Scanner scanner = new Scanner(System.in);
		String bookSearchKey = scanner.nextLine();
		System.out.println("�˻��� �������� �Է��Ͻÿ�.");
		System.out.println("->");
		
	    for (Book s : bookList) {
	      if (s.indexOf(bookSearchKey) != -1) {
	        System.out.println(s);
	      } else {
	        System.out.println("ã�� ������ �����ϴ�.");
	      }
	      // System.out.println(s);
	    }

		// map(c -> c.getBookName()).anyMatch(d->d.getChars(srcBegin, srcEnd, dst,
		// dstBegin)).forEach(s -> System.out.println(s));

	}

}
