package collection;

import java.util.ArrayList;

public class MemberArrayListTest {

	public static void main(String[] args) {
		ArrayList<Member> arrayList = new ArrayList<>();
		
		MemberArrayList memberArrayList = new MemberArrayList(arrayList);
		
		Member memberLee = new Member(1001, "이지원");
		Member memberSon = new Member(1002, "손민국");
		Member memberPark = new Member(1003, "박서훤");
		Member memberHong = new Member(1004, "홍길동");
	
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberHong);
		
		memberArrayList.showAllMember();
		
		memberArrayList.remove(memberHong.getMemberId());
		memberArrayList.showAllMember();
		
	}

}
