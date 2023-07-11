package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedDeleteTest {

	public static void main(String[] args) {
		String host = "jdbc:mysql://localhost:3306/userdb";
		String user = "root";
		String pass = "1234";
		
		try {
			//1단계 JDBC 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2단계 데이터 베이스 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			//3단계 SQL 실행 객체생성
			String sql = "DELETE FROM `User2` WHERE `uid` = ?";
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, "j101");
			
			//4단계 SQL 실행
			psmt.executeUpdate();
			
			//5단계 - 결과처리
			
			//6단계 연결해제
			psmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("DELETE 완료");
	}

}
