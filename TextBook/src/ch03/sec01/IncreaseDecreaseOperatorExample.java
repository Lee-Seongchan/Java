package ch03.sec01;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		x++; //11
		++x; //12
		System.out.println("X= " + x);
		
		System.out.println("-----------------------------");
		y--; //9
		--y; //8
		System.out.println("y= " + y);
		
		System.out.println("-----------------------------");
		z = x++; //x값 12를 z에 할당한 뒤 x 값 증가
		System.out.println("z = " + z); // z = 12
		System.out.println("x = " + x); // x = 13
		
		System.out.println("-----------------------------");
		z = ++x; //14
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		
		System.out.println("-----------------------------");
		z = ++x + y++; //14 + 9
		System.out.println("z = " + z); // 23
		System.out.println("x = " + x); // 15
		System.out.println("y = " + y); // 9
	
	}

}
