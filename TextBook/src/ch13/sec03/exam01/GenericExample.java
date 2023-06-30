package ch13.sec03.exam01;

public class GenericExample {

	public static <T> Box<T> Boxing(T t) {
		
		Box<T> box = new Box<>();
		box.set(t);
		return box;
	}

	public static void main(String[] args) {
		
		Box<Integer> box1 = Boxing(100);
		
		
		
		
	}
	
}
