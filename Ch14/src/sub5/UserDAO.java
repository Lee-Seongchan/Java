package sub5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {
	
	// 싱글톤
	private static UserDAO instance = new UserDAO();
	
	public static UserDAO getInstance() {
		return instance;
	}
	
	private UserDAO() {
		
	}
	
	// 1단계 JDBC 드라이브 로드 
	private final String HOST = "jdbc:mysql://127.0.0.1:3306/userdb";
	private final String USER = "root";
	private final String PASS = "1234";
	
	//모듈화 (1~2단계)
	private Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection conn = DriverManager.getConnection(HOST, USER, PASS);
//		
//		return conn;
		return DriverManager.getConnection(HOST, USER, PASS);
	}
	
	private Connection conn = null;
	private Statement stmt;
	private PreparedStatement psmt;
	private ResultSet rs;
	
	public void insertUser(UserVO vo) {

		// 2단계 데이터베이스 접속
		try {
			conn = getConnection();
			//String sql = "";
			psmt = conn.prepareStatement(SQL.INSERT_USER);
			
			psmt.setString(1, vo.getUid());
			psmt.setString(2, vo.getName());
			psmt.setString(3, vo.getHp());
			psmt.setInt(4, vo.getAge());
			
		// 4단계 SQL 실행	
			psmt.executeUpdate();
			
			close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Insert 완료");
		
		// 4단계
		// 5단계
		// 6단계
		
	}
	public UserVO selectUser(String uid) {
		
		UserVO vo = new UserVO();; //if문 안에 있으면 if문이 끝나면 사라지는 지역변수가 되기 때문에 밖으로 빼준다.
		
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.SELECT_USER);
			psmt.setString(1, uid);
			rs = psmt.executeQuery();
			
			if(rs.next()) {

				vo.setUid(rs.getString(1));
				vo.setName(rs.getString(2));
				vo.setHp(rs.getString(3));
				vo.setAge(rs.getInt(4));
			}else {
				
			}
			
			close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vo;
		
	}
	public List<UserVO> selectUsers() {
		
		List<UserVO> users = new ArrayList<>();
		
		try {
			Connection conn = getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(SQL.SELECT_USERS);
			
			while(rs.next()) {
				UserVO vo = new UserVO();
				
				vo.setUid(rs.getString(1));
				vo.setName(rs.getString(2));
				vo.setHp(rs.getString(3));
				vo.setAge(rs.getInt(4));
				
//				String id = rs.getString(1);
//				String name = rs.getString(2);
//				String hp = rs.getString(3);
//				int age = rs.getInt(4);
//				
//				vo.setUid(id);
//				vo.setName(name);
//				vo.setHp(hp);
//				vo.setAge(age);
				
				users.add(vo);
				
				
			}
			
			close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return users;
	}
	
	
	public int updatetUser(UserVO vo) {
		
		int result = 0;
		
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.UPDATE_USER);
			psmt.setString(1, vo.getName());
			psmt.setString(2, vo.getHp());
			psmt.setInt(3, vo.getAge());
			psmt.setString(4, vo.getUid());
			
			result = psmt.executeUpdate();
			
			close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	public int deletetUser(String uid) {
		
		int result = 0;
		
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.DELETE_USER);
			psmt.setString(1, uid);
			
			result = psmt.executeUpdate(); //수정할 컬럼이 있으면 1을 반환
			
			close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public void close() throws SQLException {
		if(rs != null) {
			rs.close();
		}
		
		if(stmt != null) {
			stmt.close();
		}
		
		if(psmt != null) {
			psmt.close();
		}
		
		if(conn != null) {
			conn.close();
		}
	}
	

}
