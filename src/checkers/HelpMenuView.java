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
public class HelpMenuView {
   private String playerInput;
    
    public String menu(){
     Scanner input = new Scanner(System.in);
      
         System.out.println("Main Menu \n"
              + "c How to Make a Move\n"
              + "r For Rules \n");
              
         this.playerInput = input.next();
   return playerInput;
   }; 
}

   
