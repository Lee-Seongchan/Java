package step2;

import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		int a = sc.nextInt();
		
		int hour = 0;
		int minute = 0;
		
		if( a + m > 60 ) {
		// 분이랑 더하기했을때 1시간 넘고 그 시간이 24시간을 초과하지 않을 때 
			hour = (h + (a + m)/60);
			minute = ((a + m) % 60);
			
		}else if((a + m) < 60){
			// a + m 이랑 더했을 때 60이 안됬을 때 
			hour = h;
			minute = a + m;
		}
		
		if( (hour) > 23){
			hour -=  24; // hour = hour - 24;
		}
		System.out.println(hour);
		System.out.println(minute);
	}
}
