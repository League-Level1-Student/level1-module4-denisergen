package _05_fortune_teller;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */


import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
	public static void main(String[] args) {
	
	
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
	int rng = new Random().nextInt(4);
	// 3. Print out this variable
	System.out.println(rng + " =  rng");
	// 4. Get the user to enter a question for the 8 ball
	JOptionPane.showInputDialog(null, "enter a question");
	// 5. If the random number is 0
    if (rng == 0) {
    	JOptionPane.showMessageDialog(null, "yes");
    	
    } else if (rng == 1) {
    	
    	JOptionPane.showMessageDialog(null, "no");
    } else if (rng == 2)
    {
    	JOptionPane.showMessageDialog(null, "ask google cus i have no clue");
    }else if (rng == 3)
    {
    	JOptionPane.showMessageDialog(null, "ummm what?");
    }
	// -- tell the user "Yes"

	// 6. If the random number is 1

	// -- tell the user "No"

	// 7. If the random number is 2

	// -- tell the user "Maybe you should ask Google?"

	// 8. If the random number is 3

	// -- write your own answer
	}
}
