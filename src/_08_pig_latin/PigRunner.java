package _08_pig_latin;
import javax.swing.*;
public class PigRunner {
	
	
	
	public static void main(String[] args) {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JTextField text1 = new JTextField(50);
	JTextField text2 = new JTextField(50);
	frame.setTitle("Pig latin translater");
	button1.setText(">>");
	button2.setText("<<");
	button3.setText("speak");
	frame.add(panel);
	panel.add(text1);
	panel.add(button1);
	panel.add(button2);
	panel.add(text2);
	panel.add(button3);
	frame.pack();
	frame.setVisible(true);
	
	
	button1.addActionListener((event)->{
		String x = text1.getText();
		String y = PigLatinTranslator.translateEnglishToPigLatin(x);
		text2.setText(y);
	});
	
	button2.addActionListener((event)->{
		String y = text2.getText();
		String x = PigLatinTranslator.translatePigLatinToEnglish(y);
		text1.setText(x);
	});

	
	
	
	
	
	}

}
