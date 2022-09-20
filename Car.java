package week1.day1;

public class Car {
	private void driveCar() {
		System.out.println("Going out in car");
	}
public void applyBrake() {
	System.out.println("Car stops when Brake is applied");
}
public void soundHorn() {
	System.out.println("SoundHorn should be low");

}
public void isPuncture() {
	System.out.println("car is not puncture");

}
	public static void main(String[] args) {
		Car obj= new Car();
		obj.applyBrake();
		obj.driveCar();
		obj.soundHorn();
		obj.isPuncture();

	}

}
