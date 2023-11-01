package step3;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class Main {
 
	public static void main(String[] args) throws NumberFormatException, IOException {
 
		// BufferedReader 사용법
		// 입력은 readLine();이라는 메소드를 사용한다. String으로 리턴 값이 고정되어 있기 때문에, 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //선언
 
		// 다른 타입으로 입력을 받고자 한다면 반드시 형변환이 필요하다. 그리고, 예외처리를 반드시 필요
		int n = Integer.parseInt(br.readLine());
 
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
 
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
			sb.append('\n');
		}
 
		System.out.println(sb);
		System.out.println();
	}
}