package tw.org.iii.tutor;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
// 滑鼠練習
public class Tung38training extends JFrame implements MouseListener{ // 方法二直接實作MouseListener，底下有五個方法要實作
	// 屬性
	private JTextField mesg, mesg2 , mesg3 , mesg4 , mesg5 ; // mesg是方法一的，mesg2是方法二...
	
	
	// 建構式
	public Tung38training() {
		super("滑鼠偵測位置");
		
		
		setLayout(new BorderLayout());
		JPanel top = new JPanel(new BorderLayout());
		JPanel bottom = new JPanel(new FlowLayout());
		mesg3 = new JTextField();
		mesg4 = new JTextField();
		mesg5 = new JTextField();

		
		bottom.add(mesg3);
		bottom.add(mesg4);
		bottom.add(mesg5);
		add(bottom, BorderLayout.SOUTH);
		add(top, BorderLayout.NORTH);
		setSize(480, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		System.out.println(getWidth());
		
		mesg3.setPreferredSize(new Dimension(getWidth()/3, 25));
		mesg4.setPreferredSize(new Dimension(getWidth()/3, 25));
		mesg5.setPreferredSize(new Dimension(getWidth()/3, 25));
		mesg = new JTextField();
		top.add(mesg, BorderLayout.NORTH);
		mesg2 = new JTextField(); // 填入單列文字
		top.add(mesg2, BorderLayout.SOUTH);

//		add(bottom,BorderLayout.SOUTH);
//		mesg3=new JTextField();
//		bottom.add(mesg3,BorderLayout.WEST);
//		mesg4=new JTextField();
//		bottom.add(mesg4,BorderLayout.CENTER);
//		mesg5=new JTextField();
//		bottom.add(mesg5,BorderLayout.EAST);
//		
//		// 方法一的文字列
//		mesg=new JTextField();  // 填入單列文字
//		add(mesg, BorderLayout.NORTH); // 將 mesg單列文字行，放到視窗上方(北方)
//		
//		// 方法二的文字列
//		mesg2=new JTextField();  // 填入單列文字
//		add(mesg2, BorderLayout.SOUTH);
		
		
		
		// 創建滑鼠接收器
		// 方法一：設計一個類別去實作MouseListene介面的所有方法，但要處理兩類別溝通問題
		addMouseListener(new MyMouseListener1(this)); // 要填入參數Tung38training，也就是此類別自己
		// 方法二：直接由Tung38training實作MouseListener介面，所以Tung38training已有MouseListener的證照
		addMouseListener(this); // 所以用this(本寶寶)
		// 方法四：巢狀類別，由Tung38training類別中再設計一個類別MyMouseListenerV4去繼承MouseAdapter
		addMouseListener(new MyMouseListenerV4());
		// 方法五：直接建立物件，直接實作，MouseAdapter()類似內部類別，只是是匿名的，沒有名字
		addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				mesg5.setText("點擊位置5:" +e.getX() + ", " + e.getY());
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				
			}
		});
		
		
		
		

	}
	
	// 從<方法一>聽進來後，創造一個對外公開的方法要顯示在視窗
	public void setMesgText(String mesgText) {
		mesg.setText(mesgText);
	}
 
	
	// 創建出視窗，
	public static void main(String[] args) {
		new Tung38training();
	}
	
	//-------------------<方法四>---------------------------------
	// 方法四：巢狀類別(類中的類別)，就像一條龍的的概念，假設一台車的類別需要輪子的類別，直接由車的類別製造出輪子，好處是不用跟其他類別溝通
	class MyMouseListenerV4 extends MouseAdapter{
		@Override
		public void mousePressed(MouseEvent e) {
			mesg4.setText("點擊位置4:" +e.getX() + ", " + e.getY());
		}
	}
	//----------------------------------------------------------
	
	
	//-------------------<方法二>---------------------------------
	// 方法二：直接由Tung38training實作MouseListener介面，所以底下有五個方法要實作
	@Override
	public void mouseClicked(MouseEvent e) {

	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("點擊位置2:" + e.getX() + "," + e.getY());
		//setMesgText("點擊位置:" + e.getX() + "," + e.getY());
		mesg2.setText("點擊位置2:" + e.getX() + "," + e.getY());
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
	//--------------------------------------------------------------------------
}

//-------------------<方法一>---------------------------------
//方法一：設計一個類別去實作MouseListene介面的所有方法
class MyMouseListener1 implements MouseListener{
	// 屬性
	// 為了解決MyMouseListener1和Tung38training的溝通問題，創建一個屬性為Tung38training物件
	private Tung38training Tung38training;
	
	// 建構式
	public MyMouseListener1(Tung38training t38) {  // 在new出MyMouseListener1要傳參數，參數為Tung38training物件
		Tung38training = t38; // 參數Tung38training物件傳進來後，放入屬性物件Tung38training，就可以完成溝通
	}
	
	@Override // mouseClicked 要在原地放開才會觸發
	public void mouseClicked(MouseEvent e) {  // 只要有大括號就是有實作
		System.out.println("click");	
	}

	@Override // mousePressed 點擊
	public void mousePressed(MouseEvent e) {
		System.out.println("點擊位置1:" + e.getX() + "," + e.getY());
		// 由於已經可以跟Tung38training類別溝通，所以可以呼叫Tung38training的方法
		Tung38training.setMesgText("點擊位置:" + e.getX() + "," + e.getY());
	}

	@Override // mouseReleased 放開
	public void mouseReleased(MouseEvent e) {
		System.out.println("放開位置:" + e.getX() + "," + e.getY());	
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
再加上MyMouseListener1和Tung38training是兩個類別，不好溝通，MyMouseListener1得到了XY值，但要怎麼呈現在視窗Tung38training是個問題
而且僅適用於Tung38training
 */
//----------------------------------------------------------------------------------------

//-------------------<方法三>---------------------------------------------------------------
// 方法三：利用抽象類別MouseAdapter針對裡面的一般方法做覆寫，好處是不用像法一法二需要把全部方法實作
// MouseAdapter這個抽象類別特別在於裡面沒有抽象方法，所以不用實作，直接找需要的一般方法做覆寫就好
class MyListener3 extends MouseAdapter{
	// 可以用選單選擇想覆寫的方法：先按右鍵 -> source -> Override/Implements Methods
	@Override
	public void mousePressed(MouseEvent e) {
		
	}
}
/*
<方法三>有個跟<方法一>一樣的缺點，就是一樣要互相認識、互相溝通，因為方法三的類別MyListener3在類別Tung38training的外面
 */
//-----------------------------------------------------------------------------------------




