package assignment_2;

import inf.v3d.view.Viewer;

public class Pattern1 {
			int dimensionX = 20;
			int dimensionY = 20;
			int [][ ] Cell = new int[dimensionX][dimensionY];
			int [][] newCell =new int[ dimensionX][dimensionY];
			Rectangle2D[][] R = new Rectangle2D[dimensionX][dimensionY];
	
	// helper methods
	public int[][] createEmptyCells( int sizeX, int sizeY ) {
		return new int[sizeX][sizeY];
		}
			
	
	
	public  Pattern1() {
		
		for(int i = 0; i <Cell.length; i++) {
			for(int j = 0 ; j <Cell[i].length; j++) {
			Cell[i][j]=0;		
			}
		}
		Cell[9][9]=1;
		Cell[10][10]=1;
		Cell[9][10]=1;
		Cell[10][9]=1;
		
	}
	public void doEvolution( int n, Viewer v) {
		for(int i =0; i<n; i++) {
			for(int x = 0; x<Cell.length; x++) {
				for(int y = 0; y< Cell[x].length; y++) {
					if( Cell[x][y] == 1 || Cell[x][y] == 0) {
									int neighbors= 0;
								try { if(Cell[x-1][y-1]== 1) { neighbors++;}}catch(Exception e) {}
								try { if(Cell[x-1][y]== 1) {neighbors++;}}catch(Exception e) {}
								try { if(Cell[x-1][y+1]== 1) { neighbors++;}}catch(Exception e) {}
								try { if(Cell[x][y-1]== 1) { neighbors++;}}catch(Exception e) {}
								try { if(Cell[x][y+1]== 1) { neighbors++;}}catch(Exception e) {}
								try { if(Cell[x+1][y]== 1) { neighbors++;}}catch(Exception e) {}
								try { if(Cell[x+1][y-1]== 1) { neighbors++;}}catch(Exception e) {}
								try {if( Cell[x+1][y+1]==1) {neighbors++;}}catch(Exception e) {}
								if( neighbors < 2 ) {
									// cell dies
									newCell[x][y] = 0;
								} else if( neighbors < 4 ) {
									if( Cell[x][y] == 0 && neighbors == 3 ||
										Cell[x][y] == 1)
									{
										// reincarnation// staying alive
										newCell[x][y] = 1;
									}
								} else {
									// over population - cell dies
									newCell[x][y] = 0;
								}
						
							
					   }				
					}	//end of for loop y
				  }//end for loop x
					for(int i1 = 0; i1<Cell.length; i1++) {
						for(int j = 0; j< Cell[i1].length; j++) {
							Cell[i1][j]=newCell[i1][j];
						}
					}
				}
			        update(v);
	}//end of doEvolution
	
	public void  update(Viewer v) {
		  for(int x=0;x<Cell.length; x++ ) {
			for(int y=0; y<Cell[x].length; y++) {
				if(Cell[x][y]== 1) {
					R[x][y] = new Rectangle2D(x, y,1,1);
					R[x][y].draw("blue", v);
				}
				else {
					R[x][y] = new Rectangle2D(x, y,1,1);
					R[x][y].draw1("gray",v);
				}
			}
		}
		
	}

	
}