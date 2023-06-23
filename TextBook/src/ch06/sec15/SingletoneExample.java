package ch06.sec15;

public class SingletoneExample {

	public static void main(String[] args) {
		//Singleton ob1 = new Singleton(); 컴파일 에러
		//Singleton ob2 = new Singleton(); 컴파일 에러
		
		
		
		//정적 메소드를 호출해서 싱글톤 객체를 얻음
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 싱글톤 객체입니다.");
		}else {
			System.out.println("다른 싱글톤 객체입니다.");
		}
	}

}
