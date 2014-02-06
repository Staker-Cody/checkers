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
public class Checkers {

    /**
     * @param args the command line arguments
     */
    String player1Name;
    String player2Name;
    String instructions = "instructions";
    
    public static void main(String[] args) {
        Checkers myGame = new Checkers();
        myGame.getName();
        myGame.displayHelp();
        MainMenu menu = new MainMenu();
       
        Board dBoard = new Board();
        dBoard.displayBoard();
        Pieces Pieces = new Pieces();
        Pieces.displayPieces();
        GetWinRatio newRatio = new GetWinRatio();
        newRatio.getWinRatio();
    }
    
    public void getName() {
        Scanner input = new Scanner(System.in);
        System.out.println("Player 1 Enter your name: ");
        this.player1Name = input.next();
        System.out.println("Player 2 Enter your name: ");
        this.player2Name = input.next();
    }
    
    public void displayHelp() {
        System.out.println("\nWelcome " + this.player1Name + " and "+ this.player2Name + "\n");
        System.out.println(this.instructions);       
    }


}
