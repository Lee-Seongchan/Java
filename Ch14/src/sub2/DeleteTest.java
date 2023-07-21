package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DeleteTest {

	public static void main(String[] args) {
		
		String host = "jdbc:mysql://127.0.0.1:3306/userdb";
		String user = "root";
		String pass = "1234";
		
		
		try {
			//1단계 - JDBC 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2단계 - 데이터베이스 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			//3단계 - SQL 실행 객체 생성
			Statement stmt =  conn.createStatement();
			//4단계 - SQL 실행
			String sql = "DELETE FROM `user1` WHERE `uid` = 'j101';";
			stmt.executeUpdate(sql);
	
			//5단계 - 결과 처리(Select 경우)
			//6단계 -
			stmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Delete 완료...");
	}

}
