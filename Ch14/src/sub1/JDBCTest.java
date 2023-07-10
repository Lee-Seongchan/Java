package sub1;

import java.sql.Connection;
import java.sql.DriverManager;

/*
 * 날짜 : 2023/07/10
 * 이름 : 이성찬
 * 내용 : JDBC 프로그래밍 실습하기
 * 
 * JDBC(Java Database Connectivity)
 * - 자바에서 데이터베이스 연결을 위한 기술 표준
 * - Java는 기본적으로 java.sql 패기지를 포함하고 별도로 DBMS에 맞는 드라이버 설정
 * - Java에서 SQL 드라이버는 데이터베이스와의 연결과 상호 작용을 담당하는 소프트웨어 컴포넌트입니다. 
 * - SQL 드라이버는 JDBC(Java Database Connectivity)라고도 불리는 Java의 표준 데이터베이스 API를 구현한 라이브러리입니다. 
 * - 이 드라이버를 사용하면 Java 프로그램에서 데이터베이스에 액세스하여 데이터를 검색, 삽입, 갱신, 삭제 등의 작업을 수행할 수 있습니다.
 * 
 */
public class JDBCTest {

	public static void main(String[] args) {
		
		//DB정보 						ip/포트번호/db
		String host = "jdbc:mysql://127.0.0.1:3306/userdb";
		String user = "root";
		String pass = "1234";
		
		try {
			//JDBC 드라이버 로드
			//스태틱 메서드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 데이터베이스 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			
			if(conn != null) {
				System.out.println("데이터베이스 접속 성공");
			}else {
				System.out.println("데이터베이스 접속 실패");
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
		
	}

}
