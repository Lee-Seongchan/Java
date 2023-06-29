package sub4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/*
 * 날짜 : 2023/06/29
 * 이름 : 이성찬
 * 내용 : Java Properties 실습하기
 * 
 * 프로퍼티(Properties)
 * - 문자열 데이터만 취급하는 key-values 자료구조 클래스
 * - 프로그램의 환경설정 값을 저장할 때 많이 사용
 * - 입출력 스트림으로 데이터 입출력하는 자료구조 클래스
 * 
 */

public class PropertisTest {

	public static void main(String[] args) {
		
		//프로퍼티 생성
		//key value 자료구조인데 key value가 문자열로 이루어진 자료구조
		Properties prop = new Properties();
		prop.setProperty("A", "Apple");
		prop.setProperty("B", "Banana");
		prop.setProperty("C", "Cherry");
		
		//System.out.println(prop);
		
		//프로퍼티 파일 저장
		String path = "C:\\Users\\Java\\Desktop\\Fruit.properties";
		
		try {
			FileOutputStream fos = new FileOutputStream(path);
			//FileOutputStream을 첫번째 인자, 두번째는 코멘트
			prop.store(fos, null);
			fos.close();
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//프로퍼티 파일 읽기
		String target = "C:\\Users\\Java\\Desktop\\Cities.properties";
	
		Properties propCities = new Properties();
		
		try {
			FileInputStream fis = new FileInputStream(target);
			propCities.load(fis);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(propCities);
		System.out.println("한국 : " + propCities.getProperty("kor"));
		System.out.println("미국 : " + propCities.getProperty("usa"));
		System.out.println("일본 : " + propCities.getProperty("jp"));
		
		
		System.out.println("프로그램 종료");
	}

}
