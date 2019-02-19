package exercise_7a;

public class Actuator extends Device{
	double mValue;
	double controlValue;
	Actuator(String name){
		super(name);
	}
	public void updateSetPoint(double newSetPoint)
	{
		this.controlValue = newSetPoint;
	}
	public void printControlValue()
	{
		System.out.println(this.name + " controlValue "+ this.controlValue);
	}
}
