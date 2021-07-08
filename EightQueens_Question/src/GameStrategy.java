public class GameStrategy {
	private boolean placedQueens[][] = new boolean[8][8];
	private int numQueens = 0;

	private int getColumn(int cellId) {
		// WRITE YOUR LOGIC HERE...................................
		

		return cellId%8;
	}
	
	private int getRow(int cellId) {
		// WRITE YOUR LOGIC HERE....................................
		
		return cellId/8;
	}

	public boolean isValidPosition(int cellId) {
		boolean isValid = true;

		if(numQueens == 8) throw new GameOverException();	// just return out of the method

		// the game is still on, so let us continue...
		
		int col = getColumn(cellId);
		
		int row = getRow(cellId);
		
		/*
			WRITE YOUR LOGIC HERE...............................

		*/
		if(placedQueens[row][col]==true)
			isValid=false;
		else {
			boolean flag=false;
			//check rows and columns
			
			for(int i=0;i<8;i++) {
				
				flag=flag || placedQueens[i][col];
				flag=flag || placedQueens[row][i];
				
			}
			//System.out.println("row col flag"+flag);
			//upper left diagonal
			for(int i=row,j=col;i>=0 && j>=0;i--,j--)
				flag=flag || placedQueens[i][j];
			
			//lower right diagonal
			for(int i=row,j=col;j<8 && i<8;i++,j++)
				flag=flag || placedQueens[i][j];
			//System.out.println("LR" +flag);
			//lower left diagonal
			for(int i=row,j=col;j>=0 && i<8;i++,j--) {
				flag=flag || placedQueens[i][j];
			}
			//System.out.println("LL" +flag);
			//upper right diagonal
			for(int i=row,j=col;i>=0 && j<8;i--,j++) {
				flag=flag || placedQueens[i][j];
			}
			//System.out.println("UR" +flag);
			if(flag==true) {
				isValid=false;
			}
			else {
				placedQueens[row][col]=true;
				numQueens++;
			}
			
			
				
		}
		return isValid;
	}
}














