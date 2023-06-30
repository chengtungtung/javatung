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
	// 物件屬性 (設定物件屬性是為了之後會一直用到)
	private JButton guess;
	private JTextField input;
	private JTextArea log;
	private String answer; // 謎底
	private int counter;
	
	// 建構式
	public GuessNumber() {
		super("猜數字 1A2B");
		
		// 物件完成初始化，初始化完後是擁有此物件，但還沒版面配置，所以執行後視窗也不會跑出來這些物件
		guess = new JButton("猜");  // JButton按鈕
		input = new JTextField();  // JTextField只能填入單列文字
		log = new JTextArea();     // JTextArea能填入多列文字
		// JButton、JTextField、JTextArea的父類別都是Component(元件)，所以他們都is_a_Component(元件)
		
		// 處理版面 
		setLayout(new BorderLayout()); // LayoutManager 是介面(介面裡面沒有一般方法，所以都要實作)  // 呼叫Jframe的setLayout(設定布局)方法，用意在視窗拉大拉小的時候，會跟著調整
		JPanel top = new JPanel(new BorderLayout()); // top是區域變數，但在建構式中，所以一旦產生GuessNumber物件後，top就會不見  // JPanel是要做一個隔間
		add(top , BorderLayout.NORTH);  // JFrame裡有個從Container繼承的add方法，add(Component comp)，參數只要丟Component(元件)，就可以加進去Jframe視窗
		top.add(guess, BorderLayout.EAST);
		top.add(input, BorderLayout.CENTER);
		
		//add(log , BorderLayout.CENTER);  // 在第一層的BorderLayout的中間(但因為log區域正常來講，不能讓使用者編輯，所以要再調整)
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
