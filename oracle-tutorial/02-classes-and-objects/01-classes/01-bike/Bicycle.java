public class Bicyle {
	// Bicycle class has 3 fields
	private int cadence;
	private int gear;
	private int speed;

	// Bicycle class has one constructor
	public Bicycle(int startCadence, int startSpeed, int startGear) {
		gear = startGear;
		cadence = startCadence;
		speed = startSpeed;
	}

	// Bicycle class has 4 methods
	public int getCadence() {
		return cadence;
	}

	public void setCadence(int newValue) {
		cadence = newValue;
	}
	
	public int getGear() {
		return gear;
	}

	public void setGear(int newValue) {
		gear = newValue;
	}

	public int getSpeed() {
		return speed;
	}

	public void applyBrake(int decrement) {
		speed -= decrement;
	}

	public void speedUp(int increment) {
		speed += increment;
	}
}
