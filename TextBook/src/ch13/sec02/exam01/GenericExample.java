package ch13.sec02.exam01;

public class GenericExample {

	public static void main(String[] args) {
		
		//K는 tv로 대체, M은 String으로 대체 
		Product<Tv, String> product1 = new Product<>();
		
		//Setter 매개값은 반드시 Tv와 String을 제공
		product1.setKind(new Tv());
		product1.setModel("스마트Tv");
		
		//Getter 리턴값은 Tv와 String이 됨
		Tv tv = product1.getKind();
		String tvmodel = product1.getModel();
		
		Product<Car, String> product2 = new Product<>();
		
		product2.setKind(new Car());
		product2.setModel("SUV 자동차");
		
		Car car = product2.getKind();
		String carModel = product2.getModel();
		
		product1.show();
		product2.show();
		
	}

}
