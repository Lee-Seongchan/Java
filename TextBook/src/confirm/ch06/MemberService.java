package confirm.ch06;

public class MemberService {
	
	String name;
	String id;
	String password;
	int age;
	
	public MemberService() {
		
	}

	
	public boolean login(String id, String password) {
	
		boolean result = false;
		
		if(id.equals("hong") && password.equals("12345")) {
			result = true;
		}
	
		return result;
		 
	}
	
	public void logout(String id) {
		this.id = id;
		System.out.println(id + "님이 로그아웃 하셨습니다.");
	}

	
	
}
