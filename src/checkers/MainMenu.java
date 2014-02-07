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

    private String player1Name;
    private String player2Name;
    private String instructions = "Please Enter One of the Follwing Commands\n";
    private String playerInput;
   
    public void getName() {
        Scanner input = new Scanner(System.in);
        System.out.println("Player 1 Enter your name: ");
        this.player1Name = input.next();
        System.out.println("Player 2 Enter your name: ");
        this.player2Name = input.next();
        System.out.println("\nWelcome to Checkers " + this.player1Name + " and "+ this.player2Name + "\n");
        System.out.println(this.instructions);   
        
    }

 
    

 
    public void menu(){
        Scanner input = new Scanner(System.in);
      
         System.out.println( "Main Menu \n"
              +  "n For New Game \n"
              + "s for Scores\n"
              + "h for Help Me!\n");
         this.playerInput = input.next();
         
         if("n".equals(playerInput)){
              System.out.println("This Function is not completed");
          Board dBoard;
            dBoard = new Board();
        dBoard.displayBoard();
         }
         else if("h".equals(playerInput)){
          System.out.println("This Function is not completed"); 
         }
         else if("h".equals(playerInput)) {
             HelpMenuControl menu = new HelpMenuControl();
             menu.menu();
             
         }
       
    System.out.println("Error Wrong Input Command"); 
    
        
    }
    
}
    