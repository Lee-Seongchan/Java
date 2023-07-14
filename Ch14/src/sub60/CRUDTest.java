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
				UserVO vo1 = new UserVO(); 
				
				//입력
				System.out.print("아이디 : ");
				vo1.setUid(sc.next());
				
				System.out.print("이름 : ");
				vo1.setName(sc.next());
				
				System.out.print("휴대폰 : ");
				vo1.setHp(sc.next());
				
				System.out.println("나이 : ");
				vo1.setAge(sc.nextInt());
				
				UserDAO dao = UserDAO.getInstanace();
				dao.insertUser(vo1);
				
				
				
			}else if(answer == 2) {
				//조회
				
			}
		}
	}

}
