package sub6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 날짜 : 2023/06/28
 * 이름 : 이성찬
 * 내용 : Java 정규표현식 실습하기 
 * 
 */

public class RegularExpressionTest {

	public static void main(String[] args) {

		// 정규표현식 
		String strPatt = "a[a-z]*"; //a로 시작 그 다음 글자는 영어 소문자가 하나 이상 나오거나 나오지 않아도 된다.
		
		boolean r1 = Pattern.matches(strPatt, "apple");
		boolean r2 = Pattern.matches(strPatt, "banana");
		boolean r3 = Pattern.matches(strPatt, "a");
		
		System.out.println("r1 : " + r1);
		System.out.println("r2 : " + r2);
		
		// 정규표현식 패턴
		// 배열의 이름은 s를 붙이는게 관례 
		String[] patterns = {
								"[0-9]+" , // 숫자 1개 이상             + 는 한개 이상
				 				"1[0-9]*", // 1로 시작하는 숫자 0개 이상   * 는 0개이상 
								"^[0-9]",  // 숫자로 시작하는 문자
								"[^0-9]",   // 숫자가 아닌 문자
								".",		// 문자 1개	
								"[a-z]?",	// 영어 소문자 1개
								"[a-z]*",	// 영어 소문자 0개 이상
								"[a-z]+",	// 영어 소문자 1개 이상
								"[A-Z]*",	// 영어 대문자 0개 이상
								"[가-힣]+",	// 한글 1자 이상
								"^[0-9a-z]*", // 숫자 + 영어 조합 0개 이상
								"^[0-9가-힣]*", // 숫자 + 한글 조합 0개 이상
								"^[A-Z][a-z]*", // 영어 대문자로 시작하는 문자 0개 이상
								"[0-9a-z]+",// 숫자 + 영어 소문자 1자 이상 
								"\\s",		// 공백
								"\\S",		// 공백이 아닌 문자
								"\\d",		// 숫자
								"\\w",		// 숫자와 문자
								"\\W"		// 특수문자
							}; 
		
		String[] words = {"apple", "123한글", "123456", "011", "hello", "홍길동", "1", "Banana", "APPLE", "#"};
		
		for(String word : words) {
			
			System.out.println(word + " 문자와 일치하는 패턴 : ");
			
			for(String pattern : patterns) {
				
				Pattern.matches(pattern, word);
				
				boolean result = Pattern.matches(pattern, word);
				
				if(result) {
					System.out.print(pattern + ",");
				}
				
			}
			System.out.print("\n");
		
		}
		
		// 자주 사용하는 정규 표현식 
		String ptt1 = "^[a-zA-Z0-9]*$"; //^시작 $ 종결
		String ptt2 = "^[가-힣]*$";
		String ptt3 = "(01\\d{1})-(\\d{3,4})-(\\d{4})"; //휴대폰 검증 정규 표현식 : 01로 시작하면서 숫자 1개 반복, 숫자3 또는 4개  		
		String ptt4 = "(\\w+)@(\\w+).(\\w+)"; //이메일 검증 정규표현식 
		
		String str = "이름 : 홍길동, 휴대폰 : 010-1234-1001, 휴대폰 011-123-1001, 이메일 : hong@gmail.com";
		
		Pattern p1 = Pattern.compile(ptt3);
		Matcher m1 = p1.matcher(str);
		
		System.out.println("휴대폰 조회");
		while(m1.find()) {
			System.out.println(m1.group());
			
		Pattern p2 = Pattern.compile(ptt4);
		Matcher m2 = p2.matcher(str);
		
		System.out.println("이메일 조회");
		while(m2.find()) {
			System.out.println(m2.group());
			}
		}
		
		System.out.println("-------------------");
		String pat = "\\b01([016789])[-]?\\d{3,4}[-]?\\d{4}\\b";
		
		Pattern p4 = Pattern.compile(pat);
		Matcher m4 = p4.matcher(str);
		
		System.out.println("휴대폰 조회");
		while(m4.find()) {
			System.out.println(m4.group());	
		
		}
	}

}
