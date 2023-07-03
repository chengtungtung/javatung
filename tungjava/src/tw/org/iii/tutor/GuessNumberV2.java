package tw.org.iii.tutor;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GuessNumberV2 extends JFrame {
	private JButton guess;
	private JTextField input;
	private JTextArea log;
	private String answer;
	private int counter;
	
	public GuessNumberV2() {
		super("猜數字");
		
		guess = new JButton("猜"); 
		input = new JTextField();  
		log = new JTextArea();
		
		setLayout(new BorderLayout());
		JPanel top = new JPanel(new BorderLayout());
		add(top,BorderLayout.NORTH);
		top.add(input,BorderLayout.CENTER);
		top.add(guess,BorderLayout.EAST);
		
		add(log,BorderLayout.CENTER);
		
		setSize(640,480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		guess.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//System.out.println("ok");
				//System.out.println(createAnswer(4));
				counter++;
				//String gString = input.getText();
				String result = checkAB();
				
				log.append(counter + "." + input.getText() + ":" + result + "\n" );
				
				if(result.equals("4A0B")) {
					JOptionPane.showMessageDialog(null, "恭喜答對");
					initGame();
				}else if (counter == 10) {
					JOptionPane.showMessageDialog(null, "答錯了" + answer);
					initGame();
				}
				
				input.setText("");
			}
		});
		
		initGame(); // 在初始化時會先開新局，創造謎底
		
	}
	
	private void initGame() {
		answer = createAnswer(4);
		counter = 0;
		log.setText("");
		System.out.println(answer);
	}
	
	private String createAnswer(int a) {
		int num = 10;
		int[] newNum = new int[num];
		for (int i = 0; i < newNum.length; i++)
			newNum[i] = i;

		for (int i = num - 1; i > 0; i--) {
			int rand = (int) (Math.random() * (i + 1));
			int temp = newNum[rand];
			newNum[rand] = newNum[i];
			newNum[i] = temp;
		}

		StringBuffer ans = new StringBuffer();
		for (int i = 0; i < a; i++) {
			ans.append(newNum[i]);
		}
		return ans.toString();
	}
	
	private String checkAB() {
		int a, b;
		a = b = 0;
		String gString = input.getText();
		for(int i =0;i<answer.length();i++) {
			char ansChar = answer.charAt(i);
			char gChar = gString.charAt(i);
			if(ansChar == gChar) {
				a++;
			}else if(gString.indexOf(ansChar)>=0){
				b++;
			}
		}
		return  String.format("%dA%dB", a, b) ;
	}

	
	public static void main(String[] args) {
		new GuessNumberV2();

	}

}
