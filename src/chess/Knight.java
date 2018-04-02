package ChessA;

public class Knight extends Piece{

	public Knight(char pColor, String pName) {
		super(pColor, pName);
	}
	
	
	public boolean movementController(int positionX, int positionY, int finalX, int finalY) 
	{
		int subX = finalX-positionX;
		int subY = finalY-positionY;
		
		if(subX<0) 
		{
			subX=-subX;
		}
		if(subY<0) 
		{
			subY=-subY;
		}
 		
		if(subX == 3 && subY == 1) 
		{
			return true;
		}
		else if(subX == 1 && subY == 3) 
		{
			return true;
		}
		
		return false;
		
	}

}
