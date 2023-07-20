package test7;

interface IRuunable{
	public abstract void run();
}

interface IFlyable{
	public abstract void fly();
}

class FlyingCar implements IFlyable, IRuunable{

	@Override
	public void fly() {
		System.out.println("Car fly!");
	}

	@Override
	public void run() {
		System.out.println("Car run!");
		
	}

}


public class Test08{
	public static void main(String[] args) {
		
		FlyingCar car = new FlyingCar();
		car.run();
		car.fly();
		
	}
}
