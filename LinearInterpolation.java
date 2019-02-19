package assignment_1;
	import exercise_4.FunctionPlotter1D;
	import inf.math.UserFunction;
	import inf.v3d.obj.Polyline;
	import inf.v3d.view.Viewer;

	public class LinearInterpolation {
		private double a;
		private double b;
		private int n;
		private double  Area;
		private double w;
		private double AbsoluteError;
		private double RelativeError;
		private double calArea = 34.766;
		  UserFunction f;
		  private  Polyline p = new Polyline();
		  private  Polyline p1 = new Polyline();
		
		public LinearInterpolation() {
			this.a = 0;
			this.b = 0;
			this.n =0;
		}
	public LinearInterpolation(double a, double b,int n, UserFunction f) {
		this.a =a; this.b= b;this.f=f; this.n=n;
		this.p.setColor("green");
		this.p.setLinewidth(3);
		this.p1.setColor("white");
		this.p1.setLinewidth(8);
		
		
	}
	public void plot(Viewer v) {
		FunctionPlotter1D fp = new FunctionPlotter1D(a, b,f);
		fp.plot(v);
		v.addObject3D(this.p);
		v.addObject3D(this.p1);

	}
	public double Area() {
		w =(b-a)/n;
	double []x = new double[n];
	double[]fx = new double[n];	
	
	
	for(int k= 0; k<n ;k++) {
		
		x[k]=0.05+ k*w;
		fx[k] = f.valueAt(x[k]);// height =fx=y0;
		
			Area += fx[k]*w;
		    this.p1.addVertex(x[k], fx[k], 0);
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



