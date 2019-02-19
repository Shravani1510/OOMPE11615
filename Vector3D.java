package exercise_3;

public class Vector3D {
	private double x1; double x2; double x3;
 public Vector3D(){
//	this.x1 =x1;this.x2=x2; this.x3=x3;
}
public Vector3D(double x1,double x2, double x3){
	this.x1=x1; this.x2 =x2;this.x3=x3;
}
public void print(String printprefix) {
	System.out.println( printprefix+"[" +  x1 +" "+ x2 + " "+x3+" ]");
}
public double scalarproduct(Vector3D vector2) {
	double result;
result= this.x1*vector2.x1+this.x2*vector2.x2+ this.x3*vector2.x3;
return result;
}
public Vector3D multiply(double coefficient) {
	return new Vector3D(this.x1*coefficient,this.x2*coefficient,this.x3*coefficient);
}
public Vector3D add(Vector3D vector2) {
	return new Vector3D(this.x1+vector2.x1, this.x2+vector2.x2, this.x3+vector2.x3);
}
public Vector3D sub(Vector3D vector2) {
	return new Vector3D(this.x1-vector2.x1, this.x2-vector2.x2,this.x3-vector2.x3);
}
public double norm2( ) {
	return (double) Math.sqrt((this.x1*this.x1)+(this.x2* this.x2)+(this.x3*this.x3));
}
	
}
