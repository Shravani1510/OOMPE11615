package exercise_7a;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Device d = new Device(" MyDevice");
		Sensor s = new Sensor(" My Sensor ");
		Actuator a = new Actuator(" My Actuator ");
		
		d.printMeasurement();
		s.printMeasurement();
		a.printMeasurement();
		a.updateSetPoint(42);
		a.printControlValue();
		Device z = a;
		Device z1 =a;
		z1.printMeasurement();
		// here we are getting different value bcz 1st random value is printed and again it is calling to print the value.
		z.printMeasurement();
		// search for casting in java
				
	}

}
