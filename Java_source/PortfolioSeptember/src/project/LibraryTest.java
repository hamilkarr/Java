package project;

public class LibraryTest {
	public static void main(String[]args) {
	BookArrayList bookarraylist = new BookArrayList();
	UserArrayList userarraylist = new UserArrayList();
	
	//Book �ν��Ͻ� ����
	Book book1 = new Book(1001, "1������ �ѱ��� 365", "�ɿ�ȯ", "���ǽ�");
	Book book2 = new Book(1002, "�� ����", "�󽴹� �õ������ǵ�", "�ֺ���");
	Book book3 = new Book(1003, "������ �ູ", "������", "���೪��");
	
	//Book �߰�
	bookarraylist.addBook(book1);
	bookarraylist.addBook(book2);
	bookarraylist.addBook(book3);
	bookarraylist.showAllBook();
	
	System.out.println("--------------------------------------------------------------------------------");
	
	// Book ����
	bookarraylist.removeBook(book1.bookNumber);
	bookarraylist.showAllBook();
	
	System.out.println("--------------------------------------------------------------------------------");


	// Book ����

	/*
	//User ����
	User user1 = new User(12001, "������", "010-0000-0000");
	User user2 = new User(12002, "�ڼ���", "010-1111-1111");
	User user3 = new User(12003, "������", "010-2222-2222");
	User user4 = new User(12004, "�չα�", "010-3333-3333");
	
	//User �߰�
	userarraylist.addUser(user1);
	userarraylist.addUser(user2);
	userarraylist.addUser(user3);
	userarraylist.addUser(user4);
	userarraylist.showAllUser();
	
	System.out.println("--------------------------------------------------------------------------------");
	
	//User ����
	userarraylist.removeUser(user1.getUserId());
	userarraylist.showAllUser();
	
	//����Ǽ�
	
	
	//����ݳ���¥
	
	*/
	}
}
