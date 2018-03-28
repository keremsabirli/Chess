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
