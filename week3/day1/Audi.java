package week3.day1;

public class Audi extends Car{
	
	public void soundProof() {
		System.out.println("sounProof -> From Audi ");

	}
	
	public static void main(String[] args) {
		Audi au = new Audi();
		au.applyBrake();
		au.soundHorn();
		au.changeGear();
		au.soundProof();
	}

}
