/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
package checkers;
/**
 *
 * @author Austin
 */
public class GetWinRatio {
    String wins;
    String totalGames;
    double winRatio;
    
    public void getWinRatio() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter total wins: ");
        this.wins = input.next();
        int wins1 = Integer.parseInt(wins);
        
        if(wins1<0){
            System.out.println("Invalid number of wins");
            return;
        }
        
        input = new Scanner(System.in);
        System.out.println("Enter total games: ");
        this.totalGames = input.next();
        int totalGames1 = Integer.parseInt(totalGames);
        
        if(totalGames1 < 1){
            System.out.println("Invalid number of total games");
            return;
        }
        if(wins1 < totalGames1){
            System.out.println("Error");
            return;
        }
        
        winRatio = wins1/totalGames1;
        System.out.println(winRatio);
        
    }
