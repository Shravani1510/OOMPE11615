package exercise_3;

public class Complexnum {
private double real;
private double img;
Complexnum(){
//	this.real =real; this.img = img;
}
public Complexnum(double real, double img) {
	this.real = real; this.img = img;
}
public void print(String printprefix) {
	System.out.println(printprefix +"[" +  real +" +i"+ img + " ]");
}
public Complexnum multiply(double coefficient) {
	return new Complexnum(this.real*coefficient,this.img*coefficient);
}
public Complexnum add(Complexnum num) {
	return new Complexnum(this.real+num.real, this.img+num.img);
}
public Complexnum sub(Complexnum num) {
	return new Complexnum(this.real-num.real, this.img-num.img);
}
public double norm2( ) {
	return (double) Math.sqrt((this.real*this.real)+(this.img* this.img));
}

}
