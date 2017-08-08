package gameHandler;

import java.awt.event.ActionEvent;
import java.util.Scanner;

import javax.swing.JOptionPane;

import games.Blackjack;
import games.HighLow;
import games.Information;

public class GameHandler {
	
	public static void runGame(){
		
		boolean gameLoop;
		String blackJack = "Blackjack";
		String highLow = "High/Low";
		String information = "Information";
		
		System.out.println("Hello and welcome to MyGambling \n"
				+ "Please choose the game of your choice by writing in the popup window\n"
				+ "These are your options:\n"
				+ "- Information\n"
				+ "- High/Low\n"
				+ "- Blackjack\n"
				+ "Please write correctly");
		while(gameLoop = true){
			String answer = JOptionPane.showInputDialog("Type your option");
			if(answer.equals(blackJack)){
				Blackjack.blackjack();
				break;
			}else if (answer.equals(highLow)){
				HighLow.highLow();
				break;
			}else if (answer.equals(information)){
				Information.information();
			}else{		
				System.out.println("Invalid input, try again");
			}
		}
	}

}
