package Chapter3;

public class Operator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] students = new String[30];
		for (int i = 0; i < students.length; i++) {
			students[i] = "학생" + (i + 1);
		}
		for (int i = 1; i <= students.length; i++) {
			int room = i % 10;
			System.out.println(students[i-1] + "는 방번호" + room + "입니다."); 
		}
	}

}
