package intro_to_file_io;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Assignment1 {
	public static void main(String[] args) {
		String message = JOptionPane.showInputDialog("Enter a message.");
		String encrypt = "";
		for (int i = 0; i < message.length(); i++) {
			encrypt += (char) (message.charAt(i) + 5);
		}
		try {
			FileWriter fw = new FileWriter("src/intro_to_file_io/Assignment1File.txt", false);
			
			/*
			NOTE: To append to a file that already exists, add true as a second parameter when calling the
			      FileWriter constructor.
			      (e.g. FileWriter fw = new FileWriter("src/intro_to_file_io/test2.txt", true);)
			*/
			
			fw.write(encrypt);
				
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
//Copyright © 2017
//Copyright © 2017