package _09_whack_a_mole;
import java.util.Iterator;

import javax.swing.*;
public class WackAMole {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton[] arr = new JButton[12];
		frame.setTitle("mole a wack");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new JButton();
			panel.add(arr[i]);
		}
		frame.add(panel);
		
		frame.pack();
		frame.setSize(250, 1000);
		frame.setVisible(true);

	}

}
