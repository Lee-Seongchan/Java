package sub2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 
 * 날짜 : 2023/06.29
 * 이름 : 이성찬
 * 내용 : Java 버퍼 입출력 스트림 실습하기
 * 
 * 보조 스트림(버퍼)
 *  - 기본 입출력 스트림에 Buffer를 장작해서 빠른 입출력을 지원하는 보조 스트림
 *  
 */
public class BufferIOTest {


	public static void main(String[] args) {
		
		String path = "C:\\Users\\Java\\Desktop\\workspace.zip";
		String target = "C:\\Users\\Java\\Desktop\\workspace2.zip";
		
		
		try {
			// 스트림 생성(연결)
			// 입력 스트림
			FileInputStream fis = new FileInputStream(path);
			// 출력스트림
			FileOutputStream fos = new FileOutputStream(target);
			
			//보조 스트림
			// 버퍼는 메인 스트림이 있어야 사용 가능 -> 단독 사용 불가
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			
			while(true) {
				
				//파일 읽기(byte단위의 데이터 이기 때문에 int로 가능)
				int data = bis.read();
				
				if(data == -1) {
					break;
				}
				// int형과 char형은 서로 캐스팅 가능함
				// 숫자를 문자로 변환
				char ch = (char)data;
				System.out.print(ch);
				
				// 파일 쓰기
				bos.write(data);
				
			}
			// 스트림 해제
			bis.close(); // 입력 스트림 버퍼 해제 
		
			
			bos.flush(); // 출력 스트림 버퍼 비우기
			bos.close(); // 출력 스트림 버퍼 해제
			
			fis.close(); // 메인 입력 스트림 해제 
			fos.close(); // 메인 출력 스트림 해제
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		
		System.out.println("프로그램 종료...");
		
	} //main end

}
