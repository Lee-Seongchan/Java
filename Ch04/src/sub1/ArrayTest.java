package sub1;
/**
 * 
 * 날짜 : 2023/06/14
 * 이름 : 이성찬
 * 내용 : JAVA 배열 실습하기 
 * 
 * 배열은 같은 타입의 데이터로 이루어진 가장 기본적인 자료구조 
 * 배열을 구성하는 데이터를 원소(element)라고 하며, 각 원소의 번호를 인덱스라고 하며 0부터 시작한다.
 * 배열은 for each문으로 반복 처리
 * for each문(향상된 for문)
 * for( 타입 변수 : 배열 ){
 *   실행문
 * }
 * 
 * 
 */
public class ArrayTest {

	public static void main(String[] args) {
		// 배열 
		int[] arr1 = {1, 2, 3, 4, 5};
		char[] arr2 = {'A','B','C'};
		String[] arr3 = {"서울", "대전", "대구", "부산", "광주"};
		
		// 원소 출력
		System.out.println("arr1[0] : " + arr1[0]);
		System.out.println("arr1[2] : " + arr1[2]);
		System.out.println("arr1[3] : " + arr1[3]);
		
		System.out.println("arr2[2] : " + arr2[2]);
		System.out.println("arr3[3] : " + arr3[3]);
		// 배열 길이
		System.out.println("arr1길이 : " + arr1.length);
		System.out.println("arr2길이 : " + arr2.length);
		System.out.println("arr3길이 : " + arr3.length);
		// 배열 반복문
		for(int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		
		System.out.println(); //개행 
		
		//for each문
		for(char c : arr2) {
			System.out.print(c + " ");
		}
		
		System.out.println(); //개행
		
		for(String city : arr3) {
			System.out.print(city + " ");
		}
		// 1차원 배열
		int[] scores = {80, 60, 78, 62 ,92}; //배열의 이름은 복수형 형태로 써야한다.		
		int total = 0;
		
		for(int score : scores) {
			total += score;
		}
		System.out.println("scores 합 : " + total);
		
		// 2차원 배열 
		int [][] arr2d = {{1, 2, 3, 4},
						  {5, 6, 7, 8},
						  {9, 10, 11, 12}};
		
		for(int a =0; a < 3; a++) {
			
			for(int b = 0; b < 4; b++) {
				System.out.println("arr2d[" + a + "][" + b + "] : " + arr2d[a][b] );
			}
		}
		
		// 3차원 배열
		int [][][] arr3d = {{{1, 2, 3}, //숫자 3은 0 0 1 
							{4, 5, 6}, 
							{7, 8, 9}},
						   {{10, 11, 12},
							{13, 14, 15}, //숫자 15는 1 1 2
							{16, 17, 18}},
						   {{19, 20, 21},
							{22, 23 ,24},
							{25, 26, 27}}}; // 숫자 25 2 2 0		
		
		for(int a = 0; a < 3; a++) {
			for(int b =0; b < 3; b++) {
				for(int c =0; c < 3; c++) {
					System.out.printf("arr3d[%d][%d][%d] : %d\n", a, b, c, arr3d[a][b][c]);
					//System.out.println("arr2d[" + a + "][" + b + "]["+ c + "] : " + arr3d[a][b][c] );
					
				}
			}
		}
		
		/* 
		 * printf() : 괄호 안의 내용을 지정된 형식(format)으로 출력한다.
		 * 
		 * 형식 System.out.printf("출력할 형식", 출력할 데이터, 출력할 데이터, ...);
		 * 
		 * 예시 System.out.printf("%d %s", 12345, "HelloWorld");
		 * 
		 * 결과 12345 HelloWorld
		 */
		
		
	}

}
