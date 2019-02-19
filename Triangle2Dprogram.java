package exercise_3c;

import inf.v3d.view.Viewer;

public class Triangle2Dprogram {
public static void main(String[] args) {
	Triangle2D t1 = new Triangle2D(0, 0, 0,1 ,1,0);
	Viewer v = new Viewer();
//	draw t1 with viewer v and with color "green"
     t1.draw(v, "green");
//     Set viewer visible
     v.setVisible(true);  
     double A = t1.getArea();
     System.out.println(A);
     boolean  b1 = t1.isinside(0, 0, 0, 1, 1, 0);
     System.out.println("t1 contains point :"+ b1);
     //     double Alpha = t1.getAlpha();
//     System.out.println(Alpha);
}
}
