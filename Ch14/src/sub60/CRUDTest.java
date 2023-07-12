package sub60;

import java.util.Scanner;

public class CRUDTest {

	public static void main(String[] args) {

		System.out.println("------------------------------");
		System.out.println("회원관리 매니저 v1.0");
		System.out.println("------------------------------");
		
		Scanner sc = new Scanner(System.in);
		String sql = "??";
		
		
		while(true) {
			System.out.println("종료:0, 입력:1, 조회:2, 검색:3, 수정:4, 삭제:5");
			System.out.print("선택 : ");
			
			int answer = sc.nextInt();
			
			if(answer ==0){
				break;
				
			}else if(answer == 1) {
				
			}
		}
	}

}
