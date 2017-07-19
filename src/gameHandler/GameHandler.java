package gameHandler;

import java.awt.event.ActionEvent;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class GameHandler {
	

	public static void runGame(){
		
		System.out.println("Hello and welcome to MyGambling \n"
				+ "Please choose the game of your choice by writing in the popup window\n"
				+ "These are your options:\n"
				+ "- Information\n"
				+ "- High/Low\n"
				+ "- Blackjack\n"
				+ "Please write correctly");
//		Scanner scan = new Scanner(System.in);
//		String choice = scan.next();
//		System.out.println(choice);
		String answer = JOptionPane.showInputDialog("Type your option");
		System.out.println(answer);
	}

}
