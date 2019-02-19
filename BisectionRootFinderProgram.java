package date30112018;

import exercise_4.FunctionPlotter1D;
import gnu.jel.CompilationException;
import inf.math.UserFunction;
import inf.v3d.view.Viewer;

public class BisectionRootFinderProgram {
	public static void main(String[] args) throws CompilationException {
		Viewer v= new Viewer();
		UserFunction f = new UserFunction("2*pow(sin((12.5)*x),2)+1.5*pow(cos((18.7)*x+0.314),2)","x");
		FunctionPlotter1D fp = new FunctionPlotter1D(0, 10, f);
//		BisectorRootFinder brf = new BisectorRootFinder+*(0,1,f);
//	double r = brf.findRoot(v);
	fp.plot(v);
	v.setVisible(true);
//	System.out.println(r);
	}
}
