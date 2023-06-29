package tw.org.iii.tutor;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Tung24 extends JFrame{
	// 屬性
	private JButton b1,b2,b3;
	// 建構式(沒有繼承關係)
	public Tung24() {
		super("我的視窗");
		
		b1 = new JButton("b1");
		b2 = new JButton("b2");
		b3 = new JButton("b3");
		
		setLayout(new FlowLayout());
		add(b1);add(b2);add(b3);
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		
	}
	public static void main(String[] args) {
		// 視窗(javax.swing.jframe)
		new Tung24();
		
		// 同名異式 -> Overload(覆載)
	}

}
