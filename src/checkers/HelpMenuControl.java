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
public class HelpMenuControl {

    private String playerInput;
    void menu() {
        
          HelpMenuView menu = new HelpMenuView();
            playerInput= menu.menu();
         if("c".equals(playerInput)){
              System.out.println("This Function is not completed");
          Board dBoard;
            dBoard = new Board();
        dBoard.displayBoard();
         }
         else if("r".equals(playerInput)){
          System.out.println("Input rules here"); 
         }
        
       

        
    }
    
}
