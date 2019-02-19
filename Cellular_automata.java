package ass_2;
import inf.v3d.view.Viewer;

public class Cellular_automata {
	int [][] Cell = new int[40][40];
	int[][] newCell = new int[40][40];
	Rectangle2D[][] R = new Rectangle2D[40][40];
	
	 public void Pattern() {
		 for(int i = 0; i <Cell.length; i++) {
				for(int j = 0 ; j < Cell[i].length; j++) {
						Cell[i][j] = 0;
				}
			}
		 	Cell[18][16]= 1;
			Cell[18][17]= 1;
			Cell[19][16]= 1;
			Cell[19][17]= 1;
			Cell[19][21]= 1;
			Cell[20][21]= 1;
			Cell[19][22]= 1;
			Cell[21][21]= 1;
			Cell[20][23]= 1;
			
	 }
	public void evolution(int n, Viewer v) {
		for(int x = 0; x<Cell.length; x++) {
			for(int y = 0; y< Cell[x].length; y++) {
//				living automat
				if( Cell[x][y] == 1) {
						int neighbors= 0;
						int generation =0;
						if(generation <=n) {
							try { if(Cell[x-1][y-1]== 1) { neighbors++;}}catch(Exception e) {}
							try { if(Cell[x-1][y]== 1) {neighbors++;}}catch(Exception e) {}
							try { if(Cell[x-1][y+1]== 1) { neighbors++;}}catch(Exception e) {}
							try { if(Cell[x][y-1]== 1) { neighbors++;}}catch(Exception e) {}
							try { if(Cell[x][y+1]== 1) { neighbors++;}}catch(Exception e) {}
							try { if(Cell[x+1][y]== 1) { neighbors++;}}catch(Exception e) {}
							try { if(Cell[x+1][y-1]== 1) { neighbors++;}}catch(Exception e) {}
							try {if( Cell[x+1][y+1]==1) {neighbors++;}}catch(Exception e) {}
							if(Cell[x][y] == 0 &&neighbors == 3) {newCell[x][y]= 1;}
							else if( Cell[x][y] == 0 && neighbors < 2 ||neighbors > 3) {newCell[x][y]= 0;}
							else {newCell[x][y] = Cell[x][y];}
						generation++;
						}
					
				
				}
				else if ( Cell[x][y] == 0) {
							int neighbors= 0;
							int generation =0;
							if(generation <=n) {
								try { if(Cell[x-1][y-1]== 1) { neighbors++;}}catch(Exception e) {}
								try { if(Cell[x-1][y]== 1) {neighbors++;}}catch(Exception e) {}
								try { if(Cell[x-1][y+1]== 1) { neighbors++;}}catch(Exception e) {}
								try { if(Cell[x][y-1]== 1) { neighbors++;}}catch(Exception e) {}
								try { if(Cell[x][y+1]== 1) { neighbors++;}}catch(Exception e) {}
								try { if(Cell[x+1][y]== 1) { neighbors++;}}catch(Exception e) {}
								try { if(Cell[x+1][y-1]== 1) { neighbors++;}}catch(Exception e) {}
								try {if( Cell[x+1][y+1]==1) {neighbors++;}}catch(Exception e) {}
								if(Cell[x][y] == 0 &&neighbors == 3) {newCell[x][y]= 1;}
								else if( Cell[x][y] == 0 && neighbors < 2 ||neighbors > 3) {newCell[x][y]= 0;}
								else {newCell[x][y] = Cell[x][y];}
							generation++;
							}
					
					}
				
				
					
			  }//end of for loop y
			}//end for loop x
		
//		generations
		for(int x=0;x<40; x++ ) {
			for(int y=0; y<40; y++) {
				if(Cell[x][y]== 1) {
					R[x][y] = new Rectangle2D(x, y,1,1);
					R[x][y].draw("red", v);
				}
				else {
					R[x][y] = new Rectangle2D(x, y,1,1);
					R[x][y].draw(v);
				}
			}
		}
	}//end of Moore
}