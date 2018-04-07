
package ChessA;

//window builder
public class Game {
    Piece[][] board;
    
    public Game()
    {
        board = new Piece[8][8];
        InitializePieces();
    }
    
    private void InitializePieces()
    {
        board[0][7] = new Rook('B',"R1");
        board[1][7] = new Knight('B',"N1");
        board[2][7] = new Bishop('B',"B1");
        board[3][7] = new Queen('B',"K");
        board[4][7] = new King('B',"Q");
        board[5][7] = new Bishop('B',"B2");
        board[6][7] = new Knight('B',"N2");
        board[7][7] = new Rook('B',"R2");
        for(int i = 0;i<8;i++)
        {
            board[i][6] = new Pawn('B',"P" + i);
        }
        board[0][0] = new Rook('W',"R1");
        board[1][0] = new Knight('W',"N1");
        board[2][0] = new Bishop('W',"B1");
        board[3][0] = new Queen('W',"Q");
        board[4][0] = new King('W',"K");
        board[5][0] = new Bishop('W',"B2");
        board[6][0] = new Knight('W',"N2");
        board[7][0] = new Rook('W',"R2");
        for(int i = 0;i<8;i++)
        {
            board[i][1] = new Pawn('W',"P" + i);
        }
    }

    
    // A method for all pieces
    public boolean canItMoveThere(int positionX,int positionY,int finalX,int finalY)
    {
       
        //moving vertically
        if(positionX == finalX && positionY != finalY) 
        {
        	if(positionY > finalY) 
        	{
        		for(int i=positionY-1;i>finalY;i--) 
        		{
        			if(board[positionX][i] != null)
                    {
                        return false;
                    }
        		}
        	}
        	else if(finalY > positionY) 
        	{
        		for(int i=positionY+1;i<finalY;i++) 
        		{
        			if(board[positionX][i] != null)
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
                     if(board[i][positionY] != null)
                     {
                         return false;
                     }
                 }
            }
        	else if(finalX > positionX)
            {
        		 for(int i = positionX+1;i<finalX;i++)
                 {
                     if(board[i][positionY] != null)
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
        			if(board[i][i] != null)
        			{
        				return false;
        			}
        		}
        	}
        	else if(positionX > finalX && finalY > positionY)
        	{
        		for(int i=positionY+1;i<finalY;i++)
        		{
        			if(board[positionX-i][i] != null)
        			{
        				return false;
        			}
        		}
        	}
        	else if(positionX > finalX && positionY > finalY)
        	{
        		for(int i=positionX-1;i>finalX;i--)
        		{
        			if(board[i][i] != null)
        			{
        				return false;
        			}
        		}
        	}
        	else if(finalX > positionX && positionY > finalY)
        	{
        		for(int i=positionX+1;i<finalX;i++)
        		{
        			if(board[i][positionY-i] != null)
        			{
        				return false;
        			}
        		}
        	}
        }
        // checks the color of piece where the piece would have moved
        if(board[finalX][finalY] != null)
        {
        	if(board[finalX][finalY].getColor() == board[positionX][positionY].getColor()) 
        	{
        		return false;
        	}
        }
        // checks the movements which specific to piece
        if(board[positionX][positionY].getName().equals("R1") || board[positionX][positionY].getName().equals("R2"))
        {
        	return ((Rook)board[positionX][positionY]).movementController(positionX, positionY, finalX, finalY);
        }
        else if(board[positionX][positionY].getName().equals("N1") || board[positionX][positionY].getName().equals("N2"))
        {
        	return ((Knight)board[positionX][positionY]).movementController(positionX, positionY, finalX, finalY);
        }
        else if(board[positionX][positionY].getName().equals("B1") || board[positionX][positionY].getName().equals("B2"))
        {
        	return ((Bishop)board[positionX][positionY]).movementController(positionX, positionY, finalX, finalY);
        }
        else if(board[positionX][positionY].getName().equals("Q"))
        {
        	return ((Queen)board[positionX][positionY]).movementController(positionX, positionY, finalX, finalY);
        }
        else if(board[positionX][positionY].getName().equals("K"))
        {
        	return ((King)board[positionX][positionY]).movementController(positionX, positionY, finalX, finalY);
        }
        for(int i = 0;i<8;i++)
        {
        	if(board[positionX][positionY].getName().equals("P" + i))
        	{
        		return ((Pawn)board[positionX][positionY]).movementController(positionX, positionY, finalX, finalY ,board);
        	}
        }
        return true;
    }
    int bK = 0;
	int bR1 = 0;
	int bR2 = 0;
	int wK = 0;
	int wR1 = 0;
	int wR2 = 0;
    public void eatPiece(int positionX,int positionY,int finalX,int finalY)
    {
    	// check castle pieces moved or not
    	if(board[positionX][positionY].getName().equals("K") && board[positionX][positionY].getColor() == 'B')
    	{
    		bK = 1;
    	}
    	if(board[positionX][positionY].getName().equals("R1") && board[positionX][positionY].getColor() == 'B')
    	{
    		bR1 = 1;
    	}
    	if(board[positionX][positionY].getName().equals("R2") && board[positionX][positionY].getColor() == 'B')
    	{
    		bR2 = 1;
    	}
    	if(board[positionX][positionY].getName().equals("K") && board[positionX][positionY].getColor() == 'W')
    	{
    		wK = 1;
    	}
    	if(board[positionX][positionY].getName().equals("R1") && board[positionX][positionY].getColor() == 'W')
    	{
    		wR1 = 1;
    	}
    	if(board[positionX][positionY].getName().equals("R2") && board[positionX][positionY].getColor() == 'W')
    	{
    		wR2 = 1;
    	}
    	 board[finalX][finalY] = board[positionX][positionY];
         board[positionX][positionY] = null;
    }
    public boolean isKingStillChecked(char kColor,char pColor)
    {
    	//find the king
    	int kPosX=0;
    	int kPosY=0;
    	for(int i=0;i<8;i++)
    	{
    		for(int j=0;j<8;j++)
    		{
    			if(board[i][j].getName().equals("K") && board[i][j].getColor() == kColor)
    			{
    				kPosX=i;
    				kPosY=j;
    			}
    		}
    	}
    	// find the enemy pieces and check if they can reach the king
    	for(int i=0;i<8;i++)
    	{
    		for(int j=0;j<8;j++)
    		{
    			if(board[i][j].getColor() == pColor)
    			{
    				if(canItMoveThere(i,j,kPosX,kPosY))
    				{
    					return true;
    				}
    			}
    		}
    	}	
    	return false;
    }
 // check if they can castle or not
    public boolean canBlackShortCastle()
    {
    	if(bK == 1 || bR1 == 1)
    	{
    		return false;
    	}
    	if(board[1][7] != null || board[2][7] != null)
    	{
    		return false;
    	}
    	for(int i=0;i<8;i++)
    	{
    		for(int j=0;j<8;j++)
    		{
    			if(board[i][j].getColor() == 'W')
    			{
    				if(canItMoveThere(i,j,1,7) || canItMoveThere(i,j,2,7))
    				{
    					return false;
    				}
    			}
    		}
    	}
    	return true;
    }
    public boolean canBlackLongCastle()
    {
    	if(bK == 1 || bR2 == 1)
    	{
    		return false;
    	}
    	if(board[4][7] != null || board[5][7] != null || board[6][7] != null)
    	{
    		return false;
    	}
    	for(int i=0;i<8;i++)
    	{
    		for(int j=0;j<8;j++)
    		{
    			if(board[i][j].getColor() == 'W')
    			{
    				if(canItMoveThere(i,j,4,7) || canItMoveThere(i,j,5,7) || canItMoveThere(i,j,6,7))
    				{
    					return false;
    				}
    			}
    		}
    	}	
    	return true;
    }
    public boolean canWhiteShortCastle()
    {
    	if(wK == 1 || wR2 == 1)
    	{
    		return false;
    	}
    	if(board[5][0] != null || board[6][0] != null)
    	{
    		return false;
    	}
    	for(int i=0;i<8;i++)
    	{
    		for(int j=0;j<8;j++)
    		{
    			if(board[i][j].getColor() == 'B')
    			{
    				if(canItMoveThere(i,j,5,0) || canItMoveThere(i,j,6,0))
    				{
    					return false;
    				}
    			}
    		}
    	}	
    	return true;
    }
    public boolean canWhiteLongCastle()
    {
    	if(wK == 1 || wR1 == 1)
    	{
    		return false;
    	}
    	if(board[1][0] != null || board[2][0] != null || board[3][0] != null)
    	{
    		return false;
    	}
    	for(int i=0;i<8;i++)
    	{
    		for(int j=0;j<8;j++)
    		{
    			if(board[i][j].getColor() == 'W')
    			{
    				if(canItMoveThere(i,j,1,0) || canItMoveThere(i,j,2,0) || canItMoveThere(i,j,3,0))
    				{
    					return false;
    				}
    			}
    		}
    	}
    	return true;
    }
    // castle
    public void blackShortCastle()
    {
    	board[1][7] = board[3][7];
    	board[3][7] = null;
    	board[2][7] = board[0][7]; 
    	board[0][7] = null;
    }
    public void blackLongCastle()
    {
    	board[5][7] = board[3][7];
    	board[3][7] = null;
    	board[4][7] = board[7][7]; 
    	board[7][7] = null;
    }
    public void whiteShortCastle()
    {
    	board[6][0] = board[4][0];
    	board[4][0] = null;
    	board[5][0] = board[7][0]; 
    	board[7][0] = null;
    }
    public void whiteLongCastle()
    {
    	board[2][0] = board[4][0];
    	board[4][0] = null;
    	board[3][0] = board[0][0]; 
    	board[0][0] = null;
    }
    
}
