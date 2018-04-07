package ChessA;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {
	static JFrame frame;
	static JLabel chessBoard ;
	 static JLabel blackR1;
	static JLabel blackKn1 ;
	static JLabel blackB1 ;
	static JLabel blackQ ;
	static JLabel blackK ;
	static JLabel blackB2 ;
	static JLabel blackKn2 ;
	static JLabel blackR2 ;
	static JLabel blackP1 ;
	static JLabel blackP2 ;
	static JLabel blackP3 ;
	static JLabel blackP4 ;
	static JLabel blackP5 ;
	static JLabel blackP6 ;
	static JLabel blackP7 ;
	static JLabel blackP8 ;
	static JLabel whiteR1 ;
	static JLabel whiteKn1 ;
	static JLabel whiteB1 ;
	static JLabel whiteQ ;
	static JLabel whiteK ;
	static JLabel whiteB2 ;
	static JLabel whiteKn2 ;
	static JLabel whiteR2 ;
	static JLabel whiteP1;
	static JLabel whiteP2;
	static JLabel whiteP3;
	static JLabel whiteP4;
	static JLabel whiteP5;
	static JLabel whiteP6;
	static JLabel whiteP7;
	static JLabel whiteP8;
	public static void main(String[] args){
		Game chess = new Game();
		
		
		initializeImages();
		frame = new JFrame();
		frame.setSize(800,800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
	
		frame.setVisible(true);
		
		chess.eatPiece(4, 1, 4, 3);
		chess.eatPiece(3, 1, 3, 3);
		chess.eatPiece(3, 6, 3, 4);
		if(chess.canItMoveThere(4, 3, 3, 4))
		{
			chess.eatPiece(4, 3, 3, 4);
		}
		
		drawBoard(chess);
	}
	
	public static void initializeImages()
	{
		// init labels
		chessBoard = new JLabel("");
		
		blackR1 = new JLabel("");
		 blackKn1 = new JLabel("");
		 blackB1 = new JLabel("");
		 blackQ = new JLabel("");
		 blackK = new JLabel("");
		 blackB2 = new JLabel("");
		 blackKn2 = new JLabel("");
		 blackR2 = new JLabel("");
		
		 blackP1 = new JLabel("");
		 blackP2 = new JLabel("");
		 blackP3 = new JLabel("");
		 blackP4 = new JLabel("");
		 blackP5 = new JLabel("");
		 blackP6 = new JLabel("");
		 blackP7 = new JLabel("");
		 blackP8 = new JLabel("");
		
		 whiteR1 = new JLabel("");
		 whiteKn1 = new JLabel("");
		 whiteB1 = new JLabel("");
		 whiteQ = new JLabel("");
		 whiteK = new JLabel("");
		 whiteB2 = new JLabel("");
		 whiteKn2 = new JLabel("");
		 whiteR2 = new JLabel("");
		
		 whiteP1 = new JLabel("");
		 whiteP2 = new JLabel("");
		 whiteP3 = new JLabel("");
		 whiteP4 = new JLabel("");
		 whiteP5 = new JLabel("");
		 whiteP6 = new JLabel("");
		 whiteP7 = new JLabel("");
		 whiteP8 = new JLabel("");
		// init images
		Image cBoard = new ImageIcon("ChessPieces/chessBoard.png").getImage();
		
		Image blackR = new ImageIcon("ChessPieces/blackR.png").getImage();
		Image blackKn = new ImageIcon("ChessPieces/blackKn.png").getImage();
		Image blackB = new ImageIcon("ChessPieces/blackB.png").getImage();
		Image blackK1 = new ImageIcon("ChessPieces/blackK.png").getImage();
		Image blackQ1 = new ImageIcon("ChessPieces/blackQ.png").getImage();
		Image blackP = new ImageIcon("ChessPieces/blackP.png").getImage();
		Image whiteR = new ImageIcon("ChessPieces/whiteR.png").getImage();
		Image whiteKn = new ImageIcon("ChessPieces/whiteKn.png").getImage();
		Image whiteB = new ImageIcon("ChessPieces/whiteB.png").getImage();
		Image whiteQ1 = new ImageIcon("ChessPieces/whiteQ.png").getImage();
		Image whiteK1 = new ImageIcon("ChessPieces/whiteK.png").getImage();
		Image whiteP = new ImageIcon("ChessPieces/whiteP.png").getImage();
		//set scale
		chessBoard.setIcon(new ImageIcon(cBoard.getScaledInstance(800, 800, 0)));
		
		blackR1.setIcon(new ImageIcon(blackR.getScaledInstance(90, 90, 0)));
		blackKn1.setIcon(new ImageIcon(blackKn.getScaledInstance(90, 90, 0)));
		blackB1.setIcon(new ImageIcon(blackB.getScaledInstance(90, 90, 0)));
		blackQ.setIcon(new ImageIcon(blackQ1.getScaledInstance(90, 90, 0)));
		blackK.setIcon(new ImageIcon(blackK1.getScaledInstance(90, 90, 0)));
		blackB2.setIcon(new ImageIcon(blackB.getScaledInstance(90, 90, 0)));
		blackKn2.setIcon(new ImageIcon(blackKn.getScaledInstance(90, 90, 0)));
		blackR2.setIcon(new ImageIcon(blackR.getScaledInstance(90, 90, 0)));
		
		blackP1.setIcon(new ImageIcon(blackP.getScaledInstance(90, 90, 0)));
		blackP2.setIcon(new ImageIcon(blackP.getScaledInstance(90, 90, 0)));
		blackP3.setIcon(new ImageIcon(blackP.getScaledInstance(90, 90, 0)));
		blackP4.setIcon(new ImageIcon(blackP.getScaledInstance(90, 90, 0)));
		blackP5.setIcon(new ImageIcon(blackP.getScaledInstance(90, 90, 0)));
		blackP6.setIcon(new ImageIcon(blackP.getScaledInstance(90, 90, 0)));
		blackP7.setIcon(new ImageIcon(blackP.getScaledInstance(90, 90, 0)));
		blackP8.setIcon(new ImageIcon(blackP.getScaledInstance(90, 90, 0)));
		
		whiteR1.setIcon(new ImageIcon(whiteR.getScaledInstance(90, 90, 0)));
		whiteKn1.setIcon(new ImageIcon(whiteKn.getScaledInstance(90, 90, 0)));
		whiteB1.setIcon(new ImageIcon(whiteB.getScaledInstance(90, 90, 0)));
		whiteQ.setIcon(new ImageIcon(whiteQ1.getScaledInstance(90, 90, 0)));
		whiteK.setIcon(new ImageIcon(whiteK1.getScaledInstance(90, 90, 0)));
		whiteB2.setIcon(new ImageIcon(whiteB.getScaledInstance(90, 90, 0)));
		whiteKn2.setIcon(new ImageIcon(whiteKn.getScaledInstance(90, 90, 0)));
		whiteR2.setIcon(new ImageIcon(whiteR.getScaledInstance(90, 90, 0)));
		
		whiteP1.setIcon(new ImageIcon(whiteP.getScaledInstance(90, 90, 0)));
		whiteP2.setIcon(new ImageIcon(whiteP.getScaledInstance(90, 90, 0)));
		whiteP3.setIcon(new ImageIcon(whiteP.getScaledInstance(90, 90, 0)));
		whiteP4.setIcon(new ImageIcon(whiteP.getScaledInstance(90, 90, 0)));
		whiteP5.setIcon(new ImageIcon(whiteP.getScaledInstance(90, 90, 0)));
		whiteP6.setIcon(new ImageIcon(whiteP.getScaledInstance(90, 90, 0)));
		whiteP7.setIcon(new ImageIcon(whiteP.getScaledInstance(90, 90, 0)));
		whiteP8.setIcon(new ImageIcon(whiteP.getScaledInstance(90, 90, 0)));
	
	}
	public static void drawBoard(Game chess)
	{
		
		for(int i=0;i<8;i++)
		{
			for(int j=0;j<8;j++)
			{
				if(chess.board[i][j] != null)
				{

					if(chess.board[i][j].getName().equals("R1") && chess.board[i][j].getColor() == 'B')
					{
						blackR1.setBounds(i*100, j*100-10, 90, 90);
						frame.getContentPane().add(blackR1);
					}
					else if(chess.board[i][j].getName().equals("B1") && chess.board[i][j].getColor() == 'B')
					{
						blackB1.setBounds(i*100, j*100-10, 90, 90);
						frame.getContentPane().add(blackB1);
					}
					else if(chess.board[i][j].getName().equals("N1") && chess.board[i][j].getColor() == 'B')
					{
						blackKn1.setBounds(i*100, j*100-10, 90, 90);
						frame.getContentPane().add(blackKn1);
					}
					else if(chess.board[i][j].getName().equals("Q") && chess.board[i][j].getColor() == 'B')
					{
						blackQ.setBounds(i*100, j*100-10, 90, 90);
						frame.getContentPane().add(blackQ);
					}
					else if(chess.board[i][j].getName().equals("K") && chess.board[i][j].getColor() == 'B')
					{
						blackK.setBounds(i*100, j*100-10, 90, 90);
						frame.getContentPane().add(blackK);
					}
					else if(chess.board[i][j].getName().equals("B2") && chess.board[i][j].getColor() == 'B')
					{
						blackB2.setBounds(i*100, j*100-10, 90, 90);
						frame.getContentPane().add(blackB2);
					}
					else if(chess.board[i][j].getName().equals("N2") && chess.board[i][j].getColor() == 'B')
					{
						blackKn2.setBounds(i*100, j*100-10, 90, 90);
						frame.getContentPane().add(blackKn2);
					}
					else if(chess.board[i][j].getName().equals("R2") && chess.board[i][j].getColor() == 'B')
					{
						blackR2.setBounds(i*100, j*100-10, 90, 90);
						frame.getContentPane().add(blackR2);
					}
					else if(chess.board[i][j].getName().equals("P0") && chess.board[i][j].getColor() == 'B')
					{
						blackP1.setBounds(i*100, j*100-10, 90, 90);
						frame.getContentPane().add(blackP1);
					}
					else if(chess.board[i][j].getName().equals("P1") && chess.board[i][j].getColor() == 'B')
					{
						blackP2.setBounds(i*100, j*100-10, 90, 90);
						frame.getContentPane().add(blackP2);
					}
					else if(chess.board[i][j].getName().equals("P2") && chess.board[i][j].getColor() == 'B')
					{
						blackP3.setBounds(i*100, j*100-10, 90, 90);
						frame.getContentPane().add(blackP3);
					}
					else if(chess.board[i][j].getName().equals("P3") && chess.board[i][j].getColor() == 'B')
					{
						blackP4.setBounds(i*100, j*100-10, 90, 90);
						frame.getContentPane().add(blackP4);
					}
					else if(chess.board[i][j].getName().equals("P4") && chess.board[i][j].getColor() == 'B')
					{
						blackP5.setBounds(i*100, j*100-10, 90, 90);
						frame.getContentPane().add(blackP5);
					}
					else if(chess.board[i][j].getName().equals("P5") && chess.board[i][j].getColor() == 'B')
					{
						blackP6.setBounds(i*100, j*100-10, 90, 90);
						frame.getContentPane().add(blackP6);
					}
					else if(chess.board[i][j].getName().equals("P6") && chess.board[i][j].getColor() == 'B')
					{
						blackP7.setBounds(i*100, j*100-10, 90, 90);
						frame.getContentPane().add(blackP7);
					}
					else if(chess.board[i][j].getName().equals("P7") && chess.board[i][j].getColor() == 'B')
					{
						blackP8.setBounds(i*100, j*100-10, 90, 90);
						frame.getContentPane().add(blackP8);
					}
					else if(chess.board[i][j].getName().equals("P0") && chess.board[i][j].getColor() == 'W')
					{
						whiteP1.setBounds(i*100, j*100-10, 90, 90);
						frame.getContentPane().add(whiteP1);
					}
					else if(chess.board[i][j].getName().equals("P1") && chess.board[i][j].getColor() == 'W')
					{
						whiteP2.setBounds(i*100, j*100-10, 90, 90);
						frame.getContentPane().add(whiteP2);
					}
					else if(chess.board[i][j].getName().equals("P2") && chess.board[i][j].getColor() == 'W')
					{
						whiteP3.setBounds(i*100, j*100-10, 90, 90);
						frame.getContentPane().add(whiteP3);
					}
					else if(chess.board[i][j].getName().equals("P3") && chess.board[i][j].getColor() == 'W')
					{
						whiteP4.setBounds(i*100, j*100-10, 90, 90);
						frame.getContentPane().add(whiteP4);
					}
					else if(chess.board[i][j].getName().equals("P4") && chess.board[i][j].getColor() == 'W')
					{
						whiteP5.setBounds(i*100, j*100-10, 90, 90);
						frame.getContentPane().add(whiteP5);
					}
					else if(chess.board[i][j].getName().equals("P5") && chess.board[i][j].getColor() == 'W')
					{
						whiteP6.setBounds(i*100, j*100-10, 90, 90);
						frame.getContentPane().add(whiteP6);
					}
					else if(chess.board[i][j].getName().equals("P6") && chess.board[i][j].getColor() == 'W')
					{
						whiteP7.setBounds(i*100, j*100-10, 90, 90);
						frame.getContentPane().add(whiteP7);
					}
					else if(chess.board[i][j].getName().equals("P7") && chess.board[i][j].getColor() == 'W')
					{
						whiteP8.setBounds(i*100, j*100-10, 90, 90);
						frame.getContentPane().add(whiteP8);
					}
					if(chess.board[i][j].getName().equals("R1") && chess.board[i][j].getColor() == 'W')
					{
						whiteR1.setBounds(i*100, j*100-10, 90, 90);
						frame.getContentPane().add(whiteR1);
					}
					else if(chess.board[i][j].getName().equals("B1") && chess.board[i][j].getColor() == 'W')
					{
						whiteB1.setBounds(i*100, j*100-10, 90, 90);
						frame.getContentPane().add(whiteB1);
					}
					else if(chess.board[i][j].getName().equals("N1") && chess.board[i][j].getColor() == 'W')
					{
						whiteKn1.setBounds(i*100, j*100-10, 90, 90);
						frame.getContentPane().add(whiteKn1);
					}
					else if(chess.board[i][j].getName().equals("Q") && chess.board[i][j].getColor() == 'W')
					{
						whiteQ.setBounds(i*100, j*100-10, 90, 90);
						frame.getContentPane().add(whiteQ);
					}
					else if(chess.board[i][j].getName().equals("K") && chess.board[i][j].getColor() == 'W')
					{
						whiteK.setBounds(i*100, j*100-10, 90, 90);
						frame.getContentPane().add(whiteK);
					}
					else if(chess.board[i][j].getName().equals("B2") && chess.board[i][j].getColor() == 'W')
					{
						whiteB2.setBounds(i*100, j*100-10, 90, 90);
						frame.getContentPane().add(whiteB2);
					}
					else if(chess.board[i][j].getName().equals("N2") && chess.board[i][j].getColor() == 'W')
					{
						whiteKn2.setBounds(i*100, j*100-10, 90, 90);
						frame.getContentPane().add(whiteKn2);
					}
					else if(chess.board[i][j].getName().equals("R2") && chess.board[i][j].getColor() == 'W')
					{
						whiteR2.setBounds(i*100, j*100-10, 90, 90);
						frame.getContentPane().add(whiteR2);
					}
				}
			}
		}
		frame.getContentPane().add(chessBoard);
	}
}
