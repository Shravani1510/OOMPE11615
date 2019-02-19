package date30112018;

import inf.math.UserFunction;
import inf.v3d.view.Viewer;

public class BisectorRootFinder {
private UserFunction f;
private  double a;
private double b;
private final double ESP = 1E-10;
public double mid;

public BisectorRootFinder(double a,double b, UserFunction f) {
	this.a=a; this.b=b; this.f=f;
}
public double findRoot(Viewer v) {
	double fa = f.valueAt(a);
	double fb =f.valueAt(b);
	if((fa <= 0 && fb >= 0)|| (fa >= 0 && fb<=0)) {
		double mid = a+b/2;
		while(f.valueAt(mid)< ESP) {
			double fmid = f.valueAt(mid);
			if((fmid <=0 && fa>=0)||(fmid>=0 && fa<=0)) {
				return b = mid;
			}else {
				return a= mid;
			}	
		}
	}else {
		return Double.NEGATIVE_INFINITY;
	}
	return  mid;
}
}
