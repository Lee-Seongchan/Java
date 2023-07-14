package com.shop;

import java.util.List;
import java.util.Scanner;

import com.shop.dao.CustomerDAO;
import com.shop.dao.OrderDAO;
import com.shop.dao.ProductDAO;
import com.shop.vo.CustomerVO;
import com.shop.vo.OrderVO;
import com.shop.vo.ProductVO;

/*
 * 날짜 : 2023/07/13
 * 이름 : 이성찬
 * 내용 : Shop CRUD 실습하기
 * 
 */

public class ShopMain {
	public static void main(String[] args) {
		
		System.out.println("---------------------------");
		System.out.println("쇼핑몰에 오신것을 환영합니다.");
		System.out.println("---------------------------");
		
		
		Scanner sc = new Scanner(System.in);
		
		CustomerDAO customerDAO = CustomerDAO.getInstance();
		OrderDAO orderDAO = OrderDAO.getInstance();
		ProductDAO productDAO = ProductDAO.getInstance();
		
		CustomerVO loginedCustomer = null;
		
		while(true) {
			
			if(loginedCustomer == null) {
				System.out.println("종료:0, 로그인:1, 회원가입:2, 상품목록:3, 구매하기:4");
			}else {
				System.out.println("종료:0, 로그아웃:1, 주문현황:2, 상품목록:3, 구매하기:4");
			}
			
			
			System.out.print("선택 : ");
			
			int answer = sc.nextInt();
			
			if(answer == 0) {
				// 종료
				break;
			}else if(answer == 1) {
				// 로그인
				if(loginedCustomer == null) {
					
					System.out.print("아이디 입력 : ");
					String custId = sc.next();
					
					//로그인 사용자 객체
					loginedCustomer = customerDAO.selectCustmoer(custId);
					
					if(loginedCustomer != null) {
						System.out.println(loginedCustomer.getName() + "님 어서오세요.");
						
					}else {
						System.out.println("일치하는 회원이 없습니다.");
					}
				
				}else {
					//로그아웃 처리
					System.out.println(loginedCustomer.getName() + "님 안녕히 가세요.");
					loginedCustomer = null;
				}
				
			}else if(answer == 2) {
				if(loginedCustomer == null) {
					
					//회원가입
					CustomerVO vo = new CustomerVO();
					
					System.out.print("아이디 입력");
					vo.setCustId(sc.next());
					
					System.out.print("이름 입력 : ");
					vo.setName(sc.next());
					
					System.out.print("휴대폰 입력 : ");
					vo.setHp(sc.next());
					
					System.out.println("주소 입력 : ");
					vo.setAddr(sc.next());
					
					int result = customerDAO.insertCustmoer(vo);
					
					if(result > 0) {
						System.out.println("회원가입을 축하합니다..");
					}else {
						System.out.println("회원가입에 실패 했습니다. 다시 회원가입 하십시오");
					}
					
				}else {
					//주문형황
					String orderId = loginedCustomer.getCustId();
					List<OrderVO> myOrders = orderDAO.selectOrders(orderId);
					
					for(OrderVO myOrder : myOrders) {
						System.out.println(myOrder);
					}
					
				}
			
			}else if(answer == 3) {
				//상품목록
				List<ProductVO> products = productDAO.selectProductrs();
				
				for(ProductVO product : products) {
					System.out.println(product);
				}
				System.out.println("-------------------------");
			
			}else if(answer == 4) {
				//주문하기
				if(loginedCustomer == null) {
					System.out.println("로그인을 먼저 하십시오.");
					continue;
				}
				
				System.out.println("주문 상품번호 입력");
				int prodNo = sc.nextInt();
				
				
				System.out.print("주문 수량 입력");
				int prodCount = sc.nextInt();
				
				
				//주문객체 생성
				OrderVO orderVO = new OrderVO();
				orderVO.setOrderProduct(prodNo);
				orderVO.setOrderCount(prodCount);
				// 주문자 아이디
				orderVO.setOrderId(loginedCustomer.getCustId());

				
				//주문 처리
				int result = orderDAO.insertOrder(orderVO);
				productDAO.updateProductStock(prodNo, prodCount);
				
				if(result > 0) {
					System.out.println("상품주문이 완료 되었습니다.");
				}else {
					System.out.println("상품 주문이 실패 했습니다.");
				}
				
			}
			
		}
		
		
		
		sc.close();
		System.out.println("안녕히 가세요~");
	}
	
}
