package ch07.sec10.exam02;

public class AbstractMethodExample {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		dog.sound();
		
		Cat cat = new Cat();
		cat.sound();		
		
		animalSound(new Dog()); //자동 타입 변환
		animalSound(new Cat()); //자동 타입 변환 
	}
	
	public static void animalSound(Animal animal) {
		animal.sound();
	}

}
