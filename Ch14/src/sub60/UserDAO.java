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
	
	public void insertUser() {
		String host = "jdbc:mysql://127.0.0.1:3306/userdb";
		String user = "root";
		String pass = "1234";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn	= DriverManager.getConnection(host, user, pass);
		
		String sql = "?";
		PreparedStatement psmt = conn.prepareStatement(sql);
		psmt.setString(1, );
		psmt.setString(2, );
		psmt.setString(3, );
		psmt.setString(4, );
		
		psmt.executeUpdate();
		
		psmt.close();
		conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
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
