/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package checkers;

import java.util.Scanner;

/**
 *
 * @author Austin
 */
public class GetWinRatio {
    String wins;
    String totalGames;
  
    
    public void getWinRatio() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter total wins: ");
        this.wins = input.next();
        double wins1 = Double.parseDouble(wins);
        
        if(wins1<0){
            System.out.println("Invalid number of wins");
            return;
        }
        
        input = new Scanner(System.in);
        System.out.println("Enter total games: ");
        this.totalGames = input.next();
        double totalGames1 = Double.parseDouble(totalGames);
        
        if(totalGames1 < 1){
            System.out.println("Invalid number of total games");
            return;
        }
        if(wins1 > totalGames1){
            System.out.println("Error");
            return;
        }
        
         double winRatio = (wins1 / totalGames1) * 100;
        System.out.println(winRatio);
        
    }}
