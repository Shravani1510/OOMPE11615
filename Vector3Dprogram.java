package exercise_3;

public class Vector3Dprogram {
public static void main(String[] args) {
	Vector3D v1 = new Vector3D(1.0, 2.0,3.0);
	Vector3D v2 = new Vector3D(4.0,5.0,6.0);
	double d = v1.scalarproduct(v2);
	System.out.println(d);
	Vector3D v3= v1.multiply(2);
	v3.print("v3=");
	Vector3D v4 = v1.add(v2);
	v4.print("v4=");
	Vector3D v5 = v1.sub(v2);
	v5.print("v5=");
	double n = v1.norm2();
	System.out.println(n);
	
}
}
