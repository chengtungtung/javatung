package tw.org.iii.tutor;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GuessNumberV2 extends JFrame {
	private JButton guess;
	private JTextField input;
	private JTextArea log;
	private String answer;
	
	public GuessNumberV2() {
		super("猜數字");
		
		guess = new JButton("猜"); 
		input = new JTextField();  
		log = new JTextArea();
		
		setSize(640,480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		
	}
	
	private void initGame() {
		answer = createAnswer();
	}
	
	private String createAnswer() {
		int[] ans = new int[4];
		for(int i=0; i<4;i++ ) {
			ans[i] = (int)(Math.random()*10);
		}
		return "4321";
	}

	public static void main(String[] args) {
		new GuessNumberV2();

	}

}
