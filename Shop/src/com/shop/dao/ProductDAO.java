package com.shop.dao;

import java.util.ArrayList;
import java.util.List;

import com.shop.db.DBHelper;
import com.shop.db.SQL;
import com.shop.vo.ProductVO;

public class ProductDAO extends DBHelper{
	
	private static ProductDAO instance = new ProductDAO();
	
	public static ProductDAO getInstance() {
		return instance;
	}
	
	private ProductDAO() {
		
	}
	
	//기본 CRUD 메서드
	public int insertProduct(ProductVO vo) {
		return 0;
	}
	
	public ProductVO selectProduct(int prodNo) {
		
		ProductVO vo = null;
		
		try {
			conn = getConnetion();
			psmt = conn.prepareStatement(SQL.SELECT_PRODUCT);
			psmt.setInt(1, prodNo);
			psmt.executeQuery();
			
			while(rs.next()) {
				
				if(rs.next()) {
					vo = new ProductVO();
					vo.setProdNo(rs.getInt("prodNo"));
					vo.setProdName(rs.getString("prodName"));
					vo.setStock(rs.getInt("stock"));
					vo.setPrice(rs.getInt("price"));
					vo.setCompany(rs.getString("company"));
				}
				close();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public List<ProductVO> selectProductrs() {
		
		List<ProductVO> products = new ArrayList<>();
		
		try {
			conn = getConnetion();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(SQL.SELECT_PRODUCTS);
			
			while(rs.next()) {
				// 컬럼인덱스가 아닌 컬럼명으로 초기화
				ProductVO vo = new ProductVO();
				vo.setProdNo(rs.getInt("prodNo"));
				vo.setProdName(rs.getString("prodName"));
				vo.setStock(rs.getInt("stock"));
				vo.setPrice(rs.getInt("price"));
				vo.setCompany(rs.getString("company"));
				
				products.add(vo);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return products;
	}
	
	public int updateProduct(ProductVO vo) {
		return 0;
	}
	
	
	public void updateProductStock(int prodNo, int prodCount) {
		
		try {
			conn = getConnetion();
			psmt = conn.prepareStatement(SQL.UPDATE_PRODUCT_STOCK);
			psmt.setInt(1, prodCount);
			psmt.setInt(2, prodNo);
			
			psmt.executeUpdate();
			close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	public int deleteProduct(int proNo) {
		return 0;
	}
		
	
	
}
