package exercise_5;

public class Testingclass {
	public static void main(String[] args) {
	double [] data = new double[]{1,0,0,0,};
TimeSeries T = new TimeSeries(0, 0.1, data);
System.out.println(T.getDuration() );
System.out.println(T.getTime(2));
System.out.println(T.count(1, 4));
double v = T.valueAt(1);
System.out.println(v);
System.out.println("is monotonous" +T.isMonotonous());
}
}