package project;

import java.util.ArrayList;
import java.util.Iterator;

public class BookArrayList {
		private ArrayList <Book> bookList;
		private boolean checkOut;
		
		public BookArrayList() {
			bookList = new ArrayList<Book>();
		}
		
		// ���� �߰�
			public void addBook(Book book) {
				bookList.add(book);
			}
			
			// ���� ����
			public boolean removeBook(int booknumber) {
				Iterator<Book> iterator = bookList.iterator();
				while(iterator.hasNext()) {
					Book book = iterator.next();
					int getNum = book.getBookNumber();
					if(booknumber == getNum) {
						bookList.remove(book);
						return true;
					}
				}
				System.out.println(booknumber + "�� �������� �ʽ��ϴ�.");
				return false;
			}
				 
			//�������
			//String a = (checkOut ==true) ? "���Ⱑ��" : "����Ұ�";
		
			public void showAllBook() {
				System.out.println(" ��Ϲ�ȣ   |    ����   |    ����   |    ���ǻ�   |");
				for(Book book : bookList) {
					System.out.println(book);
				}
			}
}
