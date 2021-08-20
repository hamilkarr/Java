package chapter2;

public class CastEx2 {
	public static void main(String[] args) {
//		int num1 = 200;
//		byte num2 = (byte)num1;  // int >>>> byte
//		System.out.println(num2);
//	double num1 = 3.14; //
//	long num2 = (long)num1; // 손실 발생 감수
//	System.out.print(num2);
		
	double num1 = 1.2;
	float num2 = 0.9F;
	int num3 = (int)num1 + (int)num2;
	int num4 = (int)(num1 + num2);
	System.out.println(num3);
	System.out.println(num4);
	}
}
