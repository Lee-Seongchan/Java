package outputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutPutStreamTest {

	public static void main(String[] args) {
		
		byte[] bs = new byte[26];
		byte data = 65;
		for(int i = 0; i < bs.length; i++) {
			bs[i] = data++;
		}
		
		try {
			FileOutputStream fos = new FileOutputStream("output3.txt");
			
			fos.write(bs,2,10);
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
				
	}

}
