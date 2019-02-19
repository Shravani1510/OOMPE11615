package exercise_4;

import inf.math.UserFunction;
import inf.v3d.obj.Polyline;
import inf.v3d.obj.Sphere;
import inf.v3d.view.Viewer;

public class NewtonRootFinder {
private static final double EPS =  1e-10;
private static final double DELTA = 1e-7;
/*private static final int  MAX_ITER= 15;*/
private static final int N_PIECES =20;
//other attributes
private double a;
private  double fRoot;
private  double b;
private double root;
private UserFunction f;
private Sphere sphere = new Sphere() ;
private  Polyline polyline = new Polyline();
//constructor
public NewtonRootFinder(double a, double b, UserFunction f) {
	this.a =a; this.b=b; this.f = f;
	this.polyline.setColor("blue");
	this.sphere.setColor("green");
	this.sphere.setRadius((this.b-this.a)/100);
}

public double findRoot() {
	double x= findIntialGuess();
	double fx= f.valueAt(x);
	this.polyline.addVertex(x, 0, 0);
	this.polyline.addVertex(x, fx, 0);
//	int step =0;
//	while(Math.abs(fx)>= EPS && step < MAX_ITER && a <= x && b >= x)
	while(Math.abs(fx)>= EPS )
	{
	double	fp = (f.valueAt(x+DELTA) -fx)/DELTA;
	x = x -fx/fp;
	fx = f.valueAt(x);
	this.polyline.addVertex(x, 0, 0);
	this.polyline.addVertex(x, fx, 0);
//	step++;  //step = step +1;	
	}
	this.sphere.setCenter(x, 0, 0);
	return x;
}
//	if(Math.abs(fx) < EPS) {
//		this.root = x;
//		this.fRoot = fx;
//		return this.root;
//	}else {
//		 this.root = Double.NaN;
//		 this.fRoot = Double.POSITIVE_INFINITY;
//		 return this.root;
//	}
//}
public double getRoot() {
	return  this.root;
}
public double getfRoot() {
	return  this.fRoot;
}
public void plot(Viewer v) {
	FunctionPlotter1D fp = new FunctionPlotter1D(this.a,this.b,this.f);
	fp.plot(v);
	v.addObject3D(this.sphere);
	v.addObject3D(this.polyline);
}
private double findIntialGuess() {
	double bestX =0;
	double bestfx =Double.POSITIVE_INFINITY;
	double dx = (b-a)/N_PIECES;
	for(int i= 0; i<= N_PIECES; i++) {
		double x = a+ i*dx;
		double fx = f.valueAt(x);
		
	if(Math.abs(fx) < Math.abs(bestfx)) {
		bestX  =x;
		bestfx = fx;
	}else {
	
	}
	
	}
	return bestX;
}}

