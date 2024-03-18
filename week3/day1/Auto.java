package week3.day1;

public class Auto extends Vehicle{

	public void applyMeter() {
		System.out.println("Meter applied -> From Auto");

	}
	
	public static void main(String[] args) {
		Auto au = new Auto();
		au.applyBrake();
		au.soundHorn();
		au.applyMeter();
	}

}
