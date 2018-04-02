package ChessA;


public class Piece {
    private char color;
    private String name;


    public Piece(char pColor,String pName)
    {
        name = pName;
        color = pColor;
    }
    public Piece()
    {
        name = "";
        color = '0';
    }
    public String getName()
    {
        return name;
    }
    public char getColor()
    {
        return color;
    }
    
}
