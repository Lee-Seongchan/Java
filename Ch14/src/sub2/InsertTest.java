package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * 날짜 : 2023/07/10
 * 이름 : 이성찬
 * 내용 : Insert 실습하기
 * 
 * 
 */

public class InsertTest {

	public static void main(String[] args) {
		
		// DB정보 
		String host = "jdbc:mysql://127.0.0.1:3306/userdb";
		String user = "root";
		String pass = "1234";
		
		
		try {
			// 1 단계 - JDBC 드라이버로드
			Class.forName("com.mysql.cj.jdbc.Driver");		
			// 2 단계 - 데이터 베이스 접속
			Connection conn =  DriverManager.getConnection(host, user, pass);
			// 3 단계 - SQL 실행 객체 생성
			Statement stmt = conn.createStatement();
			
			// 4 단계 - SQL 실행
			String sql = "INSERT INTO `User1` VALUES ('j101', '김유신', '010-1234-1001', 23);";
			stmt.executeUpdate(sql);
			// 5 단계 - 결과 처리(SELECT 경우, Insert,delete,update인 경우 5단계 생략)
			// 6 단계 - 연결해제
			stmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Insert 완료...");
	}

}
