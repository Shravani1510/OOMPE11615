package assignment_1;

import exercise_4.FunctionPlotter1D;
import inf.math.UserFunction;
import inf.v3d.obj.Polyline;
import inf.v3d.view.Viewer;

public class Methodavg {
	private double a;
	private double b;
	private int n;
	private double  Area=0;
	private double w;
	private double AbsoluteError;
	private double RelativeError;
	private double calArea = 34.766;

	  UserFunction f;
	  private  Polyline p = new Polyline();
	
	
	public Methodavg() {
		this.a = 0;
		this.b = 0;
		this.n =0;
	}
public Methodavg(double a, double b,int n, UserFunction f) {
	this.a =a; this.b= b;this.f=f; this.n=n;
	this.p.setColor("yellow");
	this.p.setLinewidth(3);

}
public void plot(Viewer v) {
	FunctionPlotter1D fp = new FunctionPlotter1D(a, b,f);
	fp.plot(v);
	v.addObject3D(this.p);

}
public double Area() {
	w =(b-a)/n;
	double []x = new double[n];
	double[]fx = new double[n];
	

	for(int k= 0; k < n;k++) {
		 
      int k1 =1;
		x[k]= a+(k*w);
		
		fx[k] = f.valueAt(x[k]);// height =fx=y0;
		Area +=(w)*((fx[k1]+fx[k])/2);
	    k1++;
//		System.out.println("x="+ x[k]+" "+"fx="+fx[k]);
		this.p.addVertex(x[k], 0, 0);
		this.p.addVertex(x[k], fx[k], 0);
		this.p.addVertex(x[k]+w, fx[k], 0);
		this.p.addVertex(x[k]+w, 0, 0);
		
	}
return Area;
	
}
public double AbsoluteErros() {
	return AbsoluteError = Area - calArea;
}
public double RelativeErros() {
	 return RelativeError = ( Area - calArea) /Area;
}

}
