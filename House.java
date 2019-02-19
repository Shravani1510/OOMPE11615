package execrise_2;

import java.awt.Color;

import inf.v3d.obj.Box;
import inf.v3d.obj.Cone;
import inf.v3d.view.Viewer;

public class House {
public static void main(String[] args) {
	Viewer v = new Viewer();
	Box houseCorps = new Box();
	houseCorps.setColor(Color.blue);
	v.addObject3D(houseCorps);
	
	Cone roof =new Cone();
	roof.setCenter(0.5, 1, 0.5);
	roof.setColor(Color.red);
	v.addObject3D(roof);
	
	v.setVisible(true);
	
}
}
