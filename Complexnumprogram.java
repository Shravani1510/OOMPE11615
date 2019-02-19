package exercise_3;

public class Complexnumprogram {
	public static void main(String[] args) {
	Complexnum c1 = new Complexnum(1.1 ,2.2);
	Complexnum c2 = new Complexnum(2.3, 6.5);
	Complexnum c3 = c1.multiply(3);
	c3.print("c3=");
	Complexnum c4 = c1.add(c2);
	c4.print("c4=");
	Complexnum c5 = c1.sub(c2);
	c5.print("c5=");
	double n = c2.norm2();
	System.out.println(n);
	
	}
}
