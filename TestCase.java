package ass_2;

import inf.v3d.view.Viewer;

public class TestCase {
	public static void main(String[] args) {
		 Viewer v = new Viewer();
		 Cellular_automata ca = new  Cellular_automata();
//		Todo1 p = new Todo1();
		 ca.evolution(1, v);
		 v.setVisible(true);
		 
	}
}
