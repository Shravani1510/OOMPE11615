package exercise_4;

import gnu.jel.CompilationException;
import inf.math.UserFunction;
import inf.v3d.view.Viewer;

public class FunctionPlotterTestProgram {

	public static void main(String[] args) throws CompilationException  {
		
		UserFunction f =new UserFunction ("2*pow(sin((12.5)*x),2)+1.5*pow(cos((18.7)*x+0.314),2)","x");
		FunctionPlotter1D fp = new FunctionPlotter1D(0, 20, f);
		Viewer v = new Viewer();
		fp.plot(v);
		v.setVisible(true);
	}
}
