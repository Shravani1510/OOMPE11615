package assignment_1;

import exercise_4.FunctionPlotter1D;
import inf.math.UserFunction;
import inf.v3d.obj.Polyline;
import inf.v3d.view.Viewer;

public class RectangleMethod {
		private double a;
		private double b;
		private int n;
		private double  Area=0;
		private double AbsoluteError;
		private double RelativeError;
		private double calArea = 34.766;
		private double w;
		  UserFunction f;
		  private  Polyline p = new Polyline();
		  private  Polyline p1 = new Polyline();
		
	public RectangleMethod() {
		this.a = 0;
		this.b = 0;
		this.n =0;
	}
	public RectangleMethod(double a, double b,int n, UserFunction f) {
		this.a =a; this.b= b;this.f=f; this.n=n;
		this.p.setColor("blue");
		this.p.setLinewidth(4);
		this.p1.setColor("white");
		this.p1.setLinewidth(6);
	}
	public void plot(Viewer v) {
		FunctionPlotter1D fp = new FunctionPlotter1D(a, b,f);
		fp.plot(v);
		v.addObject3D(this.p);
		v.addObject3D(this.p1);
	}
	public double Area(){
				w =(b-a)/n;
			double []x = new double[n];
			double[]fx = new double[n];
	
		for(int k= 0; k < n-1 ;k++) {
		
			x[k]= a+(k*w);
			fx[k] = f.valueAt(x[k]);// height =fx=y0;
			Area +=(w)*fx[k];
//			System.out.println("x="+ x[k]+" "+"fx="+fx[k]);
			this.p.addVertex(x[k], 0, 0);
			this.p.addVertex(x[k], fx[k], 0);
			this.p.addVertex(x[k]+w, fx[k], 0);
			this.p.addVertex(x[k]+w, 0, 0);
			this.p1.addVertex(x[k], fx[k], 0);
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

