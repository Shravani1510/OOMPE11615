package assignment_2;

//import java.util.Scanner;

import inf.v3d.view.Viewer;

public class TestCase1 {
	
 public static void main(String[] args)  { 
	 Viewer v1 = new Viewer();
	 Viewer v2 = new Viewer();
	 Viewer v3 = new Viewer();
	 
	
	 Pattern3 p3 =new Pattern3();
	 Pattern2 p2 = new Pattern2();
	 Pattern1 p1 = new Pattern1();
	 p1.doEvolution(5, v1);
	 p2.doEvolution(5, v2);
	 p3.doEvolution(5, v3);
		 v1.setVisible(true);
		 v2.setVisible(true);
	 	 v3.setVisible(true);
	 	 
	 
	  }
}
