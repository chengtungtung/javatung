package tw.org.iii.classes;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Save extends JFrame{
	private JTextArea name ;
	
	
	public Save() {
		super("存檔");
		
		name = new JTextArea();
		
		setLayout(new BorderLayout());
		JPanel top = new JPanel(new BorderLayout());
		top.add(name , BorderLayout.NORTH);
		
		name.setBackground(Color.BLUE);
		setSize(440,280);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		

	}

}
