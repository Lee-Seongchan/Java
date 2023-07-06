package stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class St {

	public static void main(String[] args) {
		
		
		try {
			FileInputStream fis = new FileInputStream("input2.txt");
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
