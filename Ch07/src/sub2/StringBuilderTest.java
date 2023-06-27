package sub2;

public class StringBuilderTest {
	public static void main(String[] args) {
		
		// String immutable 특성 때문에 빈번한 문자 변환은 메모리 낭비가 심함
		String str = "Java";
		System.out.println("str 객체주소 : " + System.identityHashCode(str));
		
		// 새로운 문자열 인스턴스가 만들어짐 
		str += "Programming";
		System.out.println("str 객체주소 : " + System.identityHashCode(str));
		
		System.out.println("str : " + str);
		
		// String의 immutable 특성을 개선한 StringBuilder
		StringBuilder sb = new StringBuilder("Java");
		System.out.println("sb 객체주소 : " + System.identityHashCode(sb));
		
		sb.append("Programming");
		System.out.println("sb 객체주소 : " + System.identityHashCode(sb));
		
		System.out.println("sb : " + sb);
	}
}
