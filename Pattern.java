package ass_2;

import inf.v3d.view.Viewer;

public class Pattern {
	boolean [][] Cell = new boolean[40][40];
	boolean[][] newCell = new boolean[40][40];
	Rectangle2D[][] R = new Rectangle2D[40][40];
	public Pattern() {
		for(int i = 0; i <Cell.length; i++) {
			for(int j = 0 ; j < Cell[i].length; j++) {
					Cell[i][j] = false;
			}
		}
		Cell[19][19]= true;
		Cell[20][20]= true;
		Cell[19][20]= true;
		Cell[20][19]= true;
		
	}
	public void evolution(int n, Viewer v) {
		for(int x = 0; x< 40; x++) {
			for(int y = 0; y< 40; y++) {
				int generation =0;
				if(generation <=n) {

				if( Cell[x][y] == true) {
				float  Moore_coefficient =0;
//				int generation =0;
//				if(generation <= n) {
						try { if(Cell[x+1][y+1]== true) { Moore_coefficient++;}}catch(Exception e) {}
						try { if(Cell[x-1][y]== true) { Moore_coefficient++;}}catch(Exception e) {}
						try { if(Cell[x-1][y+1]== true) { Moore_coefficient++;}}catch(Exception e) {}
						try { if(Cell[x][y-1]== true) { Moore_coefficient++;}}catch(Exception e) {}
						try { if(Cell[x][y+1]== true) { Moore_coefficient++;}}catch(Exception e) {}
						try { if(Cell[x+1][y]== true) { Moore_coefficient++;}}catch(Exception e) {}
						try { if(Cell[x+1][y-1]== true) { Moore_coefficient++;}}catch(Exception e) {}
						try { if(Cell[x+1][y+1]== true) { Moore_coefficient++;}}catch(Exception e) {}
						if(Moore_coefficient == 3) {newCell[x][y]= true;}
						else if( Moore_coefficient < 2) {newCell[x][y]= false;}
						else if( Moore_coefficient > 3) {newCell[x][y]=false;}
						else {newCell[x][y] = Cell[x][y];}
						generation++;
				}
				
				
//			}
				if( Cell[x][y] == false) {
					float Moore_coefficient =0;
//					int generation =0;
//					if(generation <= n) {
					try { if(Cell[x-1][y-1]== true) { Moore_coefficient++;}}catch(Exception e) {}
					try { if(Cell[x-1][y]== true) { Moore_coefficient++;}}catch(Exception e) {}
					try { if(Cell[x-1][y+1]== true) { Moore_coefficient++;}}catch(Exception e) {}
					try { if(Cell[x][y-1]== true) { Moore_coefficient++;}}catch(Exception e) {}
					try { if(Cell[x][y+1]== true) { Moore_coefficient++;}}catch(Exception e) {}
					try { if(Cell[x+1][y]== true) { Moore_coefficient++;}}catch(Exception e) {}
					try { if(Cell[x+1][y-1]== true) { Moore_coefficient++;}}catch(Exception e) {}
					try { if(Cell[x+1][y+1]== true) { Moore_coefficient++;}}catch(Exception e) {}
					
				
				if(Moore_coefficient == 3) {newCell[x][y]= true;}
				else if( Moore_coefficient < 2) {newCell[x][y]= false;}
				else if( Moore_coefficient > 3) {newCell[x][y]=false;}
				else {newCell[x][y] = Cell[x][y];}
				generation++;
				}	
			  }
			}
		}
		for(int x=0;x<40; x++ ) {
			for(int y=0; y<40; y++) {
				if(newCell[x][y]== true) {
					R[x][y] = new Rectangle2D(x, y,1,1);
					R[x][y].draw("green", v);
				}
				else {
					R[x][y] = new Rectangle2D(x, y,1,1);
					R[x][y].draw(v);
				}
			}
		}	
	}

}
