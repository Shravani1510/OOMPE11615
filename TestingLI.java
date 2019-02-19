package assignment_1;

import gnu.jel.CompilationException;
import inf.math.UserFunction;
import inf.v3d.view.Viewer;

public class TestingLI {
	public static void main(String[] args)throws CompilationException {
		Viewer v = new Viewer();
		UserFunction f = new UserFunction("2*pow(sin((12.5)*x),2)+1.5*pow(cos((18.7)*x+0.314),2)","x");
		LinearInterpolation L = new LinearInterpolation(0, 20,200,f);
	    double d = L.Area();
	    L.plot(v);
	    double Er3 = L.RelativeErros();
		double Ea3 = L.AbsoluteErros();
		System.out.println("Area of Linear interpolation :" + d);
		System.out.println("AbsoluteError.L = " + Ea3);
		System.out.println("RelativeError.L = " + Er3);
		v.setVisible(true);
		
			
	}
	}
