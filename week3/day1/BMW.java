package week3.day1;

public class BMW extends Car{
	
	public void changeGear() {
		System.out.println("Automatic gear -> From BMW ");

	}
	
	public void turnAirbag() {
		System.out.println("Airbag turned ON -> From BMW");

	}
	
	public static void main(String[] args) {
		BMW bm = new BMW();
		bm.applyBrake();
		bm.soundHorn();
		bm.turnAccelerator();
		bm.changeGear();
		bm.turnAirbag();
		
		Car cr = new Car();
		cr.changeGear();
		
	
	}
}
