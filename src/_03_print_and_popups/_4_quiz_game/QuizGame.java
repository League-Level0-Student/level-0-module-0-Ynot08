package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
int score = 0;		
		// Create a variable to hold the user's score. Set it equal to zero. 
String question = JOptionPane.showInputDialog("what is 2+8");
		// ASK A QUESTION AND CHECK THE ANSWER

				// 2.  Ask the user a question 
				if( question.equals("10")) {
					score= score+1;
				}
				else {
						score = score -1;
				}
				// 3.  Use an if statement to check if their answer is correct
				String question2 = JOptionPane.showInputDialog("what are two main indredients for "
						+"mac n cheese");
	if(question2.equals ("mac and cheese")) {
		score ++;
	}
	else {
			score=score-1;
	}
				// 4.  if the user's answer was correct, add one to their score 
				String question3 = JOptionPane.showInputDialog("what is the movie cars about");
		if(question3.equals("cars")) {
			score++;
			
		}
		else {
				score=score-100000;
		}
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		
		
		// After all the questions have been asked, tell the user their final score 
				JOptionPane.showMessageDialog(null,"your score is " + score);
	}
}
