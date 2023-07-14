package sub60;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UserDAO {
	
	private static UserDAO instanace = new UserDAO();
	
	public static UserDAO getInstanace() {
		return instanace;
	}
	
	private UserDAO() {
		
	}
	
	public void insertUser(UserVO vo) {
		String host = "jdbc:mysql://127.0.0.1:3306/userdb";
		String user = "root";
		String pass = "1234";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn	= DriverManager.getConnection(host, user, pass);
		

		PreparedStatement psmt = conn.prepareStatement(SQL.INSERT_USER);
		
		psmt.setString(1, vo.getUid());
		psmt.setString(2, vo.getName());
		psmt.setString(3, vo.getHp());
		psmt.setInt(4, vo.getAge());
		
		psmt.executeUpdate();
		
		psmt.close();
		conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Insert 완료");
	}
	

	public void selectUser() {
		
	}
	
	public void selectUsers() {
		
	}
	
	public void updateUser() {
		
	}
	
	
	public void deleteUser() {
		
	}
}
