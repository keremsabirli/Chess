/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess;

/**
 *
 * @author Kerem
 */
public class Game {
    private Piece[][] board;
    
    public Game()
    {
        board = new Piece[8][8];
        InitializePieces();
    }
    
    private void InitializePieces()
    {
        board[0][7] = new Piece('B',"R1");
        board[1][7] = new Piece('B',"N1");
        board[2][7] = new Piece('B',"B1");
        board[3][7] = new Piece('B',"Q");
        board[4][7] = new Piece('B',"K");
        board[5][7] = new Piece('B',"B2");
        board[6][7] = new Piece('B',"N2");
        board[7][7] = new Piece('B',"R2");
        for(int i = 0;i<8;i++)
        {
            board[i][6] = new Piece('B',"P" + i);
        }
        board[0][0] = new Piece('W',"R1");
        board[1][0] = new Piece('W',"N1");
        board[2][0] = new Piece('W',"B1");
        board[3][0] = new Piece('W',"Q");
        board[4][0] = new Piece('W',"K");
        board[5][0] = new Piece('W',"B2");
        board[6][0] = new Piece('W',"N2");
        board[7][0] = new Piece('W',"R2");
        for(int i = 0;i<8;i++)
        {
            board[i][1] = new Piece('W',"P" + i);
        }
    }

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
        //checking if the rook can get to there
        if(pPiece.getName().equals("R1") || pPiece.getName().equals("R2"))
        {
            if(finalX > positionX)
            {
                for(int i = positionX;i<finalX;i++)
                {
                    if(pBoard[i][positionY].getName() != null)
                    {
                        return false;
                    }
                }
            }
            if(finalX < positionX)
            {
                for(int i = finalX;i<positionX;i++)
                {
                    if(pBoard[i][positionY].getName() != null)
                    {
                        return false;
                    }
                }
            }
            if(finalY > positionY)
            {
                for(int i = positionY;i<finalY;i++)
                {
                    if(pBoard[positionX][i].getName() != null)
                    {
                        return false;
                    }
                }
            }
            if(finalY < positionY)
            {
                for(int i = finalY;i<positionY;i++)
                {
                    if(pBoard[positionX][i].getName() != null)
                    {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
