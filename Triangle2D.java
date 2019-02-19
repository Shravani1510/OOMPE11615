package exercise_3c;

import inf.v3d.obj.UnstructuredMesh;
import inf.v3d.view.Viewer; 

public class Triangle2D{

	
	Point2D a,b,c;
//default constructor
	Triangle2D(){
		a = new Point2D();
		b = new Point2D();
		c = new Point2D();
	}
	Triangle2D(double xa, double ya, double xb, double yb,
			double xc, double yc){
		a=new Point2D(xa,ya);
		b=new Point2D(xb,yb);
		c=new Point2D(xc,yc);
	}
	public void draw(Viewer v, String s) {
		UnstructuredMesh um = new UnstructuredMesh();
		um.addPoint(a.x,a.y,0.0);
		um.addPoint(b.x, b.y, 0.0);
		um.addPoint(c.x, c.y, 0.0);
		um.addCell(0, 1, 2);
		 
		um.setColor(s);
		um.setOutlinesVisible(true);
		v.addObject3D(um);
	
	}
	 public double getArea() {
		 return (double)Math.abs((a.x*(b.y-c.y)+
		 b.x*(c.y-a.y)+c.x*(a.y-b.y))/2);
	 }
	 public boolean isinside(double x1, double y1,
			 double x2,double y2, double x3, double y3) {
		 return true;
	 }
	
	 public void drawCircumcircle(Viewer v) {

	 }
	 public double getlengths() {
		 double sidep = Math.sqrt(Math.pow(a.x-b.x, 2.0)+Math.pow(a.y-b.y,2.0));
		 double sideq = Math.sqrt(Math.pow(b.x-c.x, 2.0)+Math.pow(b.y-c.y,2.0));
		 double sider = Math.sqrt(Math.pow(a.x-c.x, 2.0)+Math.pow(a.y-c.y,2.0));
		 if(sidep > sideq && sidep > sider) {
		 	return sidep;
		 }else if(sideq > sider) {
			 return sideq;
		 }else {
			 return sider;
		 }
	 }
		 
	}

