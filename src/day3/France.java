package day3;

import javax.swing.JOptionPane;

public class France {
	public static void main(String[] args) {
		String hi = JOptionPane.showInputDialog("What color is your hair");
		String hello = JOptionPane.showInputDialog("Do you know that I know where you live");
		String Hola = JOptionPane.showInputDialog("Can you be my friend");
		JOptionPane.showMessageDialog(null, "I know your hair is "+ hi+ "and you live in"+ hello + ""  );
	}

}
