package ChessA;

public class Queen extends Piece{

	public Queen(char pColor, String pName) 
	{
		super(pColor, pName);
	}
	
	public boolean movementController(int positionX, int positionY, int finalX, int finalY) 
	{
		int subX = finalX-positionX;
		int subY = finalY-positionY;
		if(subX == 0 || subY == 0)
		{
			return true;
		}
		if(subX<0) 
		{
			subX=-subX;
		}
		if(subY<0) 
		{
			subY=-subY;
		}
		
		if(subX == subY)
		{
			return true;
		}
		
		return false;
	}

}
