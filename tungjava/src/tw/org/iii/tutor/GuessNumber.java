package tw.org.iii.tutor;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.StyledEditorKit.FontSizeAction;

public class GuessNumber extends JFrame{   // 繼承Jframe
	private JButton guess;
	private JTextField input;
	private JTextArea log;
	private String answer;
	private int counter;
	
	public GuessNumber() {
		super("猜數字 1A2B");
		
		// 完成初始化
		guess = new JButton("猜");
		input = new JTextField();
		log = new JTextArea();
		
		setLayout(new BorderLayout()); // LayoutManager 是介面
		JPanel top = new JPanel(new BorderLayout()); // 區域變數  
		add(top , BorderLayout.NORTH);
		top.add(guess, BorderLayout.EAST);
		top.add(input, BorderLayout.CENTER);
		
		JScrollPane jsp = new JScrollPane(log);
		add(jsp,BorderLayout.CENTER);
		
		
		setSize(640,480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		input.setFont(new Font(null, Font.BOLD , 40));
		log.setFont(new Font(null, Font.BOLD , 40));
		
		guess.addActionListener(new ActionListener() {
			// 實作
			public void actionPerformed(ActionEvent e) {
				//System.out.println("ok");
				//System.out.println(createAnswer(5));
				guess();
			}
		});
		
		initGame();
	}
	
	// 新的一局
	private void initGame() {
		answer = createAnswer(3);
		counter = 0;
		//System.out.println(answer);
	}
	
	// 猜
	private void guess() {
		counter++;
		String g = input.getText();
		String result = checkAB(g);
		log.append(String.format("%d. %s => %s\n", counter, g , result));
		input.setText("");
		
		if(g.equals(answer)) {
			JOptionPane.showMessageDialog(null, "恭喜");
		}else if(counter == 10) {
			JOptionPane.showMessageDialog(null, "Loser: answer:" + answer);
		}
	}
	
	// 檢查幾A幾B
	private String checkAB(String g) {
		int A, B; A = B = 0;
		for(int i=0 ; i<answer.length(); i++) {
			char c = g.charAt(i);
			if (c == answer.charAt(i)) {
				A++;
			}else if(answer.indexOf(c)>=0){
				B++;
			}
		}
		return String.format("%dA%dB", A , B);
	}
	
	// 亂數得到答案
	private static String createAnswer(int d) {
		// 洗牌10碼
		int num = 10;
		int[] poker = new int[num];
		for(int i = 0 ; i<poker.length ; i++) poker[i]=i;
		
		for(int i = num - 1 ; i > 0 ; i--) { // 原本num=6，所以跑 54321
			int rand = (int)(Math.random()*(i+1)); // 跑亂數
			// poker[rand] <=> poker[i]
			int temp = poker[rand];
			poker[rand] = poker[i];
			poker[i] = temp;	
		}
		// 選三碼放進去
//		StringBuffer sb = new StringBuffer();
//		sb.append(poker[0]).append(poker[1]).append(poker[2]);
//		return sb.toString();
		
		// 放隨意碼數進去
		StringBuffer sb = new StringBuffer();
		for(int i=0 ; i<d ; i++ ) {
			sb.append(poker[i]);
		}
		return sb.toString();
		
	}
	
	public static void main(String[] args) {
		// 
		new GuessNumber();

	}

}
