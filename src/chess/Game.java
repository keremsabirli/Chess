
package ChessA;


public class Game {
    private Piece[][] board;
    
    public Game()
    {
        board = new Piece[8][8];
        InitializePieces();
    }
    
    private void InitializePieces()
    {
        board[0][7] = new Rook('B',"R1");
        board[1][7] = new Knight('B',"N1");
        board[2][7] = new Piece('B',"B1");
        board[3][7] = new Piece('B',"Q");
        board[4][7] = new Piece('B',"K");
        board[5][7] = new Piece('B',"B2");
        board[6][7] = new Knight('B',"N2");
        board[7][7] = new Rook('B',"R2");
        for(int i = 0;i<8;i++)
        {
            board[i][6] = new Piece('B',"P" + i);
        }
        board[0][0] = new Rook('W',"R1");
        board[1][0] = new Knight('W',"N1");
        board[2][0] = new Piece('W',"B1");
        board[3][0] = new Piece('W',"Q");
        board[4][0] = new Piece('W',"K");
        board[5][0] = new Piece('W',"B2");
        board[6][0] = new Knight('W',"N2");
        board[7][0] = new Rook('W',"R2");
        for(int i = 0;i<8;i++)
        {
            board[i][1] = new Piece('W',"P" + i);
        }
    }

    
    // A method for all pieces
    private boolean CanItMoveThere(int finalX,int finalY, Piece[][] pBoard,Piece pPiece)
    {
        int positionX = 0;
        int positionY = 0;
        //finding the peace ;)
        for(int i = 0;i<8;i++)
        {
            for(int j = 0;j<8;j++)
            {
                if(pBoard[i][j].getName().equals(pPiece.getName()) && pBoard[i][j].getColor() == pPiece.getColor())
                {
                    positionX = i;
                    positionY = j;
                }
            }
        }
        //moving vertically
        if(positionX == finalX && positionY != finalY) 
        {
        	if(positionY > finalY) 
        	{
        		for(int i=positionY-1;i>finalY;i--) 
        		{
        			if(pBoard[positionX][i].getName() != null)
                    {
                        return false;
                    }
        		}
        	}
        	else if(finalY > positionY) 
        	{
        		for(int i=positionY+1;i<finalY;i++) 
        		{
        			if(pBoard[positionX][i].getName() != null)
                    {
                        return false;
                    }
        		}
        	}
        }
        //moving horizontally
        else if(positionY == finalY && positionX != finalX) 
        {
        	if(positionX > finalX)
            {
        		 for(int i = positionX-1;i<finalX;i--)
                 {
                     if(pBoard[i][positionY].getName() != null)
                     {
                         return false;
                     }
                 }
            }
        	else if(finalX > positionX)
            {
        		 for(int i = positionX+1;i<finalX;i++)
                 {
                     if(pBoard[i][positionY].getName() != null)
                     {
                         return false;
                     }
                 }
            }
        }
        //moving diagonally
        else if (positionX != finalX && positionY != finalY) 
        {
        	if(finalX > positionX && finalY > positionY)
        	{
        		for(int i=positionX+1;i<finalX;i++)
        		{
        			if(pBoard[i][i].getName() != null)
        			{
        				return false;
        			}
        		}
        	}
        	else if(positionX > finalX && finalY > positionY)
        	{
        		for(int i=positionY+1;i<finalY;i++)
        		{
        			if(pBoard[positionX-i][i].getName() != null)
        			{
        				return false;
        			}
        		}
        	}
        	else if(positionX > finalX && positionY > finalY)
        	{
        		for(int i=positionX-1;i>finalX;i--)
        		{
        			if(pBoard[i][i].getName() != null)
        			{
        				return false;
        			}
        		}
        	}
        	else if(finalX > positionX && positionY > finalY)
        	{
        		for(int i=positionX+1;i<finalX;i++)
        		{
        			if(pBoard[i][positionY-i].getName() != null)
        			{
        				return false;
        			}
        		}
        	}
        }
        // checks the color of piece where pPiece would move 
        if(pBoard[finalX][finalY].getName() != null)
        {
        	if(pBoard[finalX][finalY].getColor() == pPiece.getColor()) 
        	{
        		return false;
        	}
        }
        
        if(pPiece.getName().equals("R1") || pPiece.getName().equals("R2"))
        {
        	return ((Rook)pPiece).movementController(positionX, positionY, finalX, finalY);
        }
        else if(pPiece.getName().equals("N1") || pPiece.getName().equals("N2"))
        {
        	return ((Knight)pPiece).movementController(positionX, positionY, finalX, finalY);
        }
        
        
        
        return true;
    }
}
