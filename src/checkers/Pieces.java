/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package checkers;

/**
 *
 * @author Cody
 */
public class Pieces {
    public int blackPieces = 12;
    public int whitePieces = 12;
    public int totalPieces;
    
    public void displayPieces(){
        this.totalPieces = (blackPieces + whitePieces);
     System.out.println("There is a total of "+ totalPieces + " pieces.");
}
}
