package ch05.sec12;

import java.util.Calendar;

public class WeekExample {
	public static void main(String[] args) {
		
		Week today = null;
		
		//캘런더는 싱글톤 객체
		Calendar cal = Calendar.getInstance();
		
		int week = cal.get(Calendar.DAY_OF_WEEK); 
		
		switch (week) {
		case 1:
			today = Week.SUNDAY;
			break;
			
		case 2:
			today = Week.MONDAY;
			break;	
			
		case 3:
			today = Week.TUESDAY;
			break;	
		
		case 4:
			today = Week.WEDENSDAY;
			break;	
		
		case 5:
			today = Week.THURSDAY;
			break;
			
		case 6:
			today = Week.FRIDAY;
			break;
		
		case 7:
			today = Week.SATURDAY;
			break;	
		default:
			break;
		}
		
		if(today == Week.SUNDAY) {
			System.out.println("일요일에는 축구를 합니다.");
		}else {
			System.out.println("열심히 자바 공부를 합니다.");
		}
		
	}
}
