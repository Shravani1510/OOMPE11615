package execrise_2;

import java.awt.Color;

import inf.v3d.obj.Cone;
import inf.v3d.view.Viewer;

public class ChristmasTree {
public static void main(String[] args) {
	Viewer v = new Viewer();
	Cone c1 =new Cone();
	c1.setCenter(0.5, 1, 0.5);
	c1.setColor(Color.green);
	v.addObject3D(c1);
	
	Cone c2 =new Cone();	
	c2.setCenter(0.5, 0.5, 0.5);
	c2.setColor(Color.green);
	v.addObject3D(c2);
	
	/*Box b =new Box();
	b.setSize(0.1, 0.25, 0.1);
	b.setColor(new Color(139,69,19));
	v.addObject3D(b);
	v.setVisible(true);*/
}
}
