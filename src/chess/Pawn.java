package ChessA;

public class Pawn extends Piece{

	public Pawn(char pColor, String pName) {
		super(pColor, pName);
	}
	
	public boolean movementController(int positionX, int positionY, int finalX, int finalY , Piece[][] pBoard) 
	{
		int subX = finalX-positionX;
		int subY = finalY-positionY;
		
		if(subY<0)
		{
			subY = -subY;
		}
		
		if(subY == 1)
		{
			if(subX == 0)
			{
				if(pBoard[finalX][finalY] == null)
				{
					return true;
				}
			}
			else if(subX == 1 || subX == -1)
			{
				if(pBoard[finalX][finalY] != null)
				{
					if(pBoard[finalX][finalY].getColor() != getColor())
					{
						return true;
					}
				}
			}
			
		}
		if(subY == 2)
		{
			if(subX == 0)
			{
				if(positionY == 1 || positionY == 6)
				{
					return true;
				}
			}
		}
		
		
		return false;
	}
	

}
