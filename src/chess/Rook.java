package ChessA;

public class Rook extends Piece{

	public Rook(char pColor, String pName) 
	{
		super(pColor, pName);
	}

	public boolean movementController(int positionX, int positionY, int finalX, int finalY) 
	{
		if(positionX != finalX && positionY != finalY)
		{
			return false;
		}
		
		return true;
	}
	

	
	
	

}
