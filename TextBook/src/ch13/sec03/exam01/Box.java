package ch13.sec03.exam01;

public class Box<T> {
	
	private T t;
	
	public T get() {
		return t;
	}
	
	public T  set(T t) {
		return this.t = t;
	}
	
}
