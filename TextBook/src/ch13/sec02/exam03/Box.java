package ch13.sec02.exam03;

//타입 파라미터는 기본적으로 Object타입으로 간주되므로 Object가 가지고 있는 메소드를 호출 할 수 있다. 
// box의 내용물을 확인하기 위해 타입 파라미터로 
// Object의 equal 메소드를 호출 

public class Box <T>{
	
	public T content;
	
	public T content() {
		return content;
	}
	
	
	
	public boolean compare(Box<T> other) {
		boolean result = content.equals(other.content);
		return result;
	}
	
}
