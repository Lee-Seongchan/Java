package co;


class SuperObject{
	public void paint() {
		draw();
	}
	
	public void draw() {
		draw();
		System.out.println("Super Object");
	}
}

class SubObejct extends SuperObject {
	public void paint() {
		super.draw();
	}
	
	public void draw() {
		System.out.println("Sub Object");
	}
}



public class GisaFirst {

	public static void main(String[] args) {
		SuperObject a = new SubObejct();
		a.paint();
	}

}
