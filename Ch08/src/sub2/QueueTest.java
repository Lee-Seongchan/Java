package sub2;

import java.util.LinkedList;
import java.util.Queue;

/*
 * 날짜 : 2023/06/28
 * 이름 : 이성찬
 * 내용 : Java 자료구조 스택 실습하기
 * 
 * 큐(Queue)
 * - 큐는 데이터가 차례대로 쌓이는 자료구조 (FIFO : 선입선출)
 * - 이벤트, 애니메이션 실행에 사용
 */

public class QueueTest {

	public static void main(String[] args) {
		
		Queue<Integer> queue = new LinkedList<>();
		
		queue.offer(1);
		queue.offer(2);
		queue.offer(3);
		queue.offer(4);
		queue.offer(5);
		
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
		
		LinkedList<Integer> num = new LinkedList<>();
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		num.add(6);
		System.out.println("----------------");
		System.out.println(num.get(3));
	}

}
