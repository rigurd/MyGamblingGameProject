package games;

import java.util.Random;

import javax.swing.JOptionPane;

import gameHandler.GameHandler;

public class HighLow {

	public static void highLow(){
		String low = "Low";
		String high = "High";
		String playAgain = "Would you like to play another game?";
		Random random = new Random();
		int randomNumber;
		
		System.out.println("\nWelcome to High/Low");
		String rules = "These are the rules of High/Low: "
				+ "When the prompt comes up, you write either High or Low.\n"
				+ "Low represents number 1-5, High represents number 6-10\n"
				+ "Simple as that. Good luck!";
		JOptionPane.showMessageDialog(null, rules);
		
		while (true){
			String answer = JOptionPane.showInputDialog("High or Low? Press Cancel to stop.");
			if(answer == null){
				System.out.println("You cancelled the game!");
				break;
			}else if(answer.equals(high)){
				System.out.println("You chose: "+answer);
				randomNumber = random.nextInt(10)+1;
				if(randomNumber == 6 || randomNumber == 7 || randomNumber == 8 || randomNumber == 9 ||randomNumber == 10){
					System.out.println(randomNumber+ " is a High number, you won!");
				}else{
					System.out.println(randomNumber+ " is not a High number, you lost!");
				}
			}else if (answer.equals(low)){
				System.out.println("You chose: "+answer);
				randomNumber = random.nextInt(10)+1;
				if(randomNumber == 1 || randomNumber == 2 || randomNumber == 3 || randomNumber == 4 ||randomNumber == 5){
					System.out.println(randomNumber+ " is a Low number, you won!");
				}else{
					System.out.println(randomNumber+ " is not a Low number, you lost!");
				}
			}else{
				System.out.println("Invalid Input, try again!");
			}
		}
		
		int playAgainOption = JOptionPane.showConfirmDialog(null, playAgain, "Select an Option...",JOptionPane.YES_NO_OPTION);
		if (playAgainOption == 0){
			GameHandler.runGame();
		}else if (playAgainOption == 1){
			System.out.println("Good Bye!");
		}
	}
}
