package ChessA;

public class King extends Piece{

	public King(char pColor, String pName) {
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
		if(subX == 1 || subY == 1)
		{
			return true;
		}
		
		return false;
	}
	

}
