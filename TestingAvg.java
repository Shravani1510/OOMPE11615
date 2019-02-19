package assignment_1;

import gnu.jel.CompilationException;
import inf.math.UserFunction;
import inf.v3d.view.Viewer;

public class TestingAvg {
	public static void main(String[] args)throws CompilationException {
		Viewer v = new Viewer();
		UserFunction f = new UserFunction("2*pow(sin((12.5)*x),2)+1.5*pow(cos((18.7)*x+0.314),2)","x");
		Methodavg A  = new Methodavg(0,20,200, f);
		double Avg = A.Area();
		A.plot(v);
		double Er2 = A.RelativeErros();
		double Ea2= A.AbsoluteErros();
		System.out.println("Area of Methodavg: " +Avg);
		System.out.println("AbsoluteError.A = " + Ea2);
		System.out.println("RelativeError.A = " + Er2);
		v.setVisible(true);
	}
}
