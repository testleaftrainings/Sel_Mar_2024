package week3.day1;

public class Car extends Vehicle {
	
	
	public void turnAccelerator() {
		System.out.println("accelerator is turned ON -> From Car");

	}
	
	public void changeGear() {
		System.out.println("Gear changed -> From Car ");

	}
	
	public static void main(String[] args) {
		Car car = new Car();
		car.applyBrake();
		car.soundHorn();
		car.changeGear();
		car.turnAccelerator();
		
		
	}

}
