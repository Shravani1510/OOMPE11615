package exercise_7a;

public class Device {
	 String name;
	double mValue;

	Device(String name)
	{
		this.name = name;
	}
	public double getMeasurement(){
		return mValue;
	}
	public void measure()
	{
	this.mValue = Math.random();	
	}
	public void printMeasurement()
	{
		this.measure();
		System.out.println(this.name+ " : " +this.getMeasurement());

	}
}
