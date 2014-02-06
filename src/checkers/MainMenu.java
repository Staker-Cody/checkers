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
  
public class MainMenu {

    String player1Name;
    String player2Name;
    String instructions = "instructions";
   
    public void getName() {
        Scanner input = new Scanner(System.in);
        System.out.println("Player 1 Enter your name: ");
        this.player1Name = input.next();
        System.out.println("Player 2 Enter your name: ");
        this.player2Name = input.next();
        System.out.println("\nWelcome to Checkers" + this.player1Name + " and "+ this.player2Name + "\n");
        System.out.println(this.instructions);   
    }
    public void menu(){
        
        
    }
    
}
    