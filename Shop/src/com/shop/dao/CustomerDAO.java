package com.shop.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.List;

import com.shop.db.DBHelper;
import com.shop.db.SQL;
import com.shop.vo.CustomerVO;

public class CustomerDAO extends DBHelper{
	
	//싱글톤
	private static CustomerDAO instance = new CustomerDAO();
	
	public static CustomerDAO getInstance() {
	
		return instance;
	}
	
	private CustomerDAO() {
		
	}
	
	
	
	
	//기본 CRUD 메서드
	public int insertCustmoer(CustomerVO vo) {
		
		int result = 0;
		
		try {
			conn = getConnetion();
			psmt = conn.prepareStatement(SQL.INSERT_USER);
			
			
			psmt.setString(1, vo.getCustId());
			psmt.setString(2, vo.getName());
			psmt.setString(3, vo.getHp());
			psmt.setString(4, vo.getAddr());
			
			// 0:실패, 1:성공
			result = psmt.executeUpdate();
			close();
		
		}catch (SQLIntegrityConstraintViolationException e) {
			System.out.println("이미 사용중인 아이디 입니다.");
		} catch (ClassNotFoundException e) {
			System.out.println("이미 사용중인 아이디 입니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	public CustomerVO selectCustmoer(String custId) {
		
		CustomerVO vo = null;//리턴을 위해 생성자를 밖에서 선언
		
		try {
			conn = getConnetion();
			psmt = conn.prepareStatement(SQL.SELECT_CUSTOMER);
			psmt.setString(1, custId);
			
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				
				vo = new CustomerVO();
				
				vo.setCustId(rs.getString(1));
				vo.setName(rs.getString(2));
				vo.setHp(rs.getString(3));
				vo.setAddr(rs.getString(4));
				vo.setRdate(rs.getString(5));
			}
			
			close();
					
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return vo;
	}
	
	public List<CustomerVO> selectCustmoers() {
		return null;
	}
	
	public int updateCustmoer(CustomerVO vo) {
		return 0;
	}
	
	public int deleteCustmoer(String custId) {
		return 0;
	}
	
	
	
}
