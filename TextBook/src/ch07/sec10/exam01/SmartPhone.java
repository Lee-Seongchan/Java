package ch07.sec10.exam01;

public class SmartPhone extends Phone{
	
	//생성자 선언
	SmartPhone(String owner) {
		//Phone 생성자 호출
		super(owner);
		
	}
	
	void internetSearch() {
		System.out.println("인터넷 검색을 합시다.");
	}
	
	
}
