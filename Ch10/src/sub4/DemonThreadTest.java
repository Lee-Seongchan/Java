package sub4;

/*
 * 날짜 : 2023/07/03
 * 이름 : 이성찬
 * 내용 : Java DemonThread 활용 실습하기
 * 
 * 데몬스레드(Daemon Thread)
 * 메인스레드를 보조하는 보조스스레드
 * 매인 스레드 종료되면 데몬 스테리도 같이 종료
 * 
 */

public class DemonThreadTest {

	public static void main(String[] args) throws InterruptedException {
		SubThread st = new SubThread();
		st.setDaemon(true); // 데모스레드 설정
		
		st.start();
		
		for(int i =1; i <= 10; i++) {
			
			Thread.sleep(1000);
			System.out.println("Main thread 실행");
		}
		System.out.println("프로그램 종료");
	}
	
}
