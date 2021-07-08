public class ChessBoardRenderer {
	public boolean isBlackSquare(int square) {

		// WRITE YOUR LOGIC HERE...
		
		boolean flag=false;
		//System.out.println(square%8+" "+square/8+" "+square);
		if((square/8)%2==0 && (square%8)%2!=0 || (square/8)%2!=0 && (square%8)%2==0 )
			flag=true;
		
		return flag;
	}
}
