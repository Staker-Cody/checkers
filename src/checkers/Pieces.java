/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package checkers;

import java.util.Scanner;

/**
 *
 * @author Cody
 */
public class Pieces {
    private final int blackPieces = 12;
    private final int whitePieces = 12;
    private int totalPieces;
    private int piecesLeft;
    private String piecesLost;
    
    public void displayPieces(){
        this.totalPieces = (blackPieces + whitePieces);
     System.out.println("There is a total of "+ totalPieces + " pieces.");
        int piecesLeft1 = piecesLeft();
    }
    public int piecesLeft(){
    Scanner input = new Scanner(System.in);
    System.out.println("How many pieces have you lost?");
    this.piecesLost = input.next();
    int piecesLost1 = Integer.parseInt(piecesLost);
    if(piecesLost1 > 12){
         System.out.println("You can only lose a Total of 12 Pieces");
         return 0;}
     if(piecesLost1  < 1){ 
         System.out.println("You cannot gain any Pieces");
        return 0;}
    this.piecesLeft = 12 - piecesLost1; 
    System.out.println(( "You have ") + piecesLeft +(" pieces left"));
    return 0;
        
     }
}

