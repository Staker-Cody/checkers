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
public class Checkers {

    /**
     * @param args the command line arguments
     */
 
    
    public static void main(String[] args) {
        Checkers myGame = new Checkers();
      
        MainMenu menu = new MainMenu();
        menu.getName();
        menu.menu();
       
        Pieces Pieces = new Pieces();
        Pieces.displayPieces();
        GetWinRatio newRatio = new GetWinRatio();
        newRatio.getWinRatio();
    }
    


}
