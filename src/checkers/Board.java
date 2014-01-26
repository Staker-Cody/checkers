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
public class Board {
  public int x;
  public int y;
  public boolean isBlack = false;
  public boolean isWhite = false;
 public void displayBoard(){
 
  System.out.println("is this Square black? "+this.isBlack);
 } 
}