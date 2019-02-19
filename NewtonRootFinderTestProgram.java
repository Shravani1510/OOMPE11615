package exercise_4;

import gnu.jel.CompilationException;
import inf.math.UserFunction;
import inf.v3d.view.Viewer;

public class NewtonRootFinderTestProgram {
public static void main(String[] args) throws CompilationException {
// double EPS = NewtonRootFinder.EPS;
	Viewer v = new Viewer();
	UserFunction f = new UserFunction("pow(x-2,6)/55+0.01","x");
	NewtonRootFinder nrf = new NewtonRootFinder(0, 1, f);
	
	v.setVisible(true);
	nrf.plot(v);
	double x = nrf.findRoot();
	
	System.out.println("Found approximate root x=" + x + "with f(x)=" + f.valueAt(x));
//	if(foundRoot) {
//		System.out.println("root is :"+ nrf.getRoot() + ",fRoot= "+ nrf.getfRoot());
//	}else {
//		System.out.println("No root found");
//	}

}
}
