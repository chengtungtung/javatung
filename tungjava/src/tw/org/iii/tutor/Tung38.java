package tw.org.iii.tutor;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class Tung38 extends JFrame implements MouseListener{
	// 滑鼠
	
	// 屬性
	private JTextField mesg ,mesg2;
	
	// 建構式(設定初期狀態)
	public Tung38() {
		
		setLayout(new BorderLayout());
		mesg = new JTextField();
		add(mesg, BorderLayout.NORTH);
		
		mesg2 = new JTextField();
		add(mesg2, BorderLayout.SOUTH);
		
		
		
		// 創建滑鼠接收器
		addMouseListener(new MyMouseListener(this));
		addMouseListener(this);
		addMouseListener(new MyMouseListenerV3());
		addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
			}
			
		});
		
		setSize(800,600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void setMesgText(String mesgText) {
		mesg.setText(mesgText);
	}
	
	public static void main(String[] args) {
		//
		new Tung38();
	}

	// 巢狀類別(內部類別)
	class MyMouseListenerV3 extends MouseAdapter{
		@Override
		public void mousePressed(MouseEvent e) {
			mesg.setText(e.getX() + ", " + e.getY());
		}
		
	}
	
	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("Pressed2");
		//setMesgText(e.getX() + ", " + e.getY());
		mesg2.setText(e.getX() + ", " + e.getY());
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
	}

}

//----------------------------------------------------------------------------
// 方法一：設計一個類別去實作MouseListene介面的所有方法
class MyMouseListener implements MouseListener{
	private Tung38 Tung38;
	
	public MyMouseListener(Tung38 t38) {
		Tung38 = t38;
	}
	

	@Override // mouseClicked 要在原地放開才會觸發
	public void mouseClicked(MouseEvent e) {  // 只要有大括號就是有實作
		//System.out.println("Clicked");
	}

	@Override // mousePressed 點擊
	public void mousePressed(MouseEvent e) {
		System.out.println("Pressed1");
		//System.out.println("Pressed " + e.getX() + ", " + e.getY());
		Tung38.setMesgText(e.getX() + ", " + e.getY());
	}

	@Override // mouseReleased 放開
	public void mouseReleased(MouseEvent e) {
		//System.out.println("Released");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
	}
	
}
/*
方法一缺點在於mouseEntered和mouseExited兩方法沒有使用到，但因為介面要全部實作方法，所以還是要打出來實作
 */
//-------------------------------------------------------------------------------
class MyListener2 extends MouseAdapter{

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		super.mousePressed(e);
	}
	
}

