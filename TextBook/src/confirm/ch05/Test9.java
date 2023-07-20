package confirm.ch05;

import java.util.Scanner;

public class Test9 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int stdNum = 0;
		int[] scores = null;
		
		while(true) {
			System.out.println("------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("------------------------------");
			
			System.out.print("선택> ");
			
			int answer = sc.nextInt();
			
			if(answer == 5) {
				break;
				
			}else if(answer == 1) {
				System.out.print("학생 수 > ");
				
				stdNum = sc.nextInt();
				scores = new int[stdNum];
			
			}else if(answer == 2) {		
				for(int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "]>");
					scores[i] = sc.nextInt();
				}
				
			}else if(answer == 3) {
				for(int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "]: " + scores[i] );
					}
				
			}else if(answer == 4) {
				int max = 0;
				int sum = 0;
				double avg = 0;
				
				for(int i = 0; i < scores.length; i++) {
					if(max < scores[i]) {
						max = scores[i];
					}
					
					sum += scores[i];
					
				}
				
				avg = (double) sum / stdNum;
				System.out.println("최고점수 : " + max);
				System.out.println("평균점수 : " + avg);
			}
				
		}
		System.out.println("프로그램 종료");
	}
}
