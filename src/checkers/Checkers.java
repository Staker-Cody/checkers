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
    String name;
    String instructions = "instructions";
    
    public static void main(String[] args) {
        Checkers myGame = new Checkers();
        myGame.getName();
        myGame.displayHelp();
    }
    
    public void getName() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        this.name = input.next();
    }
    
    public void displayHelp() {
        System.out.println("\nWelcome " + this.name + "\n");
        System.out.println(this.instructions);       
    }
}
