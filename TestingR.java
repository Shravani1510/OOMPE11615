package assignment_1;

import gnu.jel.CompilationException;
import inf.math.UserFunction;
import inf.v3d.view.Viewer;

public class TestingR {
	public static void main(String[] args)throws CompilationException {
		Viewer v = new Viewer();
		UserFunction f = new UserFunction("2*pow(sin((12.5)*x),2)+1.5*pow(cos((18.7)*x+0.314),2)","x");
		RectangleMethod R =new RectangleMethod(0, 20, 200, f );
		double B = R.Area();
		R.plot(v);
		double Er1 = R.RelativeErros();
		double Ea1= R.AbsoluteErros();
		System.out.println("Area of Rectanglemethod :"+ B);
		System.out.println("AbsoluteError.R = " + Ea1);
		System.out.println("RelativeError.R = " + Er1);
		v.setVisible(true);
	}
}
