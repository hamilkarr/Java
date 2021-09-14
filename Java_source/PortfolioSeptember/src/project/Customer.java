package project;

import java.io.FileReader;
import java.io.IOException;

public class Customer {
	public static void main(String[] args) {
	try(FileReader fr = new FileReader("a.txt")){
		int i;
		while((i = fr.read()) != -1) {
			System.out.print((char)i);
		}
		
	} catch(IOException e) {
		e.printStackTrace();
	}
}                    
}
