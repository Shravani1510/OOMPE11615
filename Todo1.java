package ass_2;

public class Todo1 extends  Cellular_automata{
	
	 public void Pattern() {
		 for(int i = 0; i <Cell.length; i++) {
				for(int j = 0 ; j < Cell[i].length; j++) {
						Cell[i][j] = 0;
				}
			}
		 	Cell[19][19]= 1;
			Cell[20][20]= 1;
			Cell[19][20]= 1;
			Cell[20][19]= 1;
		
	 }

}
