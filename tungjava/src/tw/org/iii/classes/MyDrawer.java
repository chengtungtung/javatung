package tw.org.iii.classes;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.LinkedList;

import javax.imageio.ImageIO;
import javax.swing.DebugGraphics;
import javax.swing.JPanel;

public class MyDrawer extends JPanel{
	private LinkedList<LinkedList<HashMap<String, Integer>>> lines , garbag;
	
	public MyDrawer(){
		lines = new LinkedList<>();
		garbag  = new LinkedList<>();
		setBackground(Color.YELLOW);
		MyListenter myListenter = new MyListenter();
		addMouseListener(myListenter);
		addMouseMotionListener(myListenter);
	}
	
	// 內部類別
	private class MyListenter extends MouseAdapter{
		@Override
		public void mousePressed(MouseEvent e) {
			int x = e.getX() , y = e.getY();
			HashMap<String, Integer> point = new HashMap<>();
			point.put("x", x); point.put("y", y);
			
			LinkedList<HashMap<String, Integer>> line = new LinkedList<>();
			line.add(point);
			
			lines.add(line);
//			repaint();
			
			garbag.clear();
		}
		
//      沒有用到mouseReleased		
//		@Override
//		public void mouseReleased(MouseEvent e) {
//		}
		
		@Override
		public void mouseDragged(MouseEvent e) {
			int x = e.getX() , y = e.getY();
			HashMap<String, Integer> point = new HashMap<>();
			point.put("x", x); point.put("y", y);
			
			lines.getLast().add(point);
			
//			line.add(point);
			repaint();
		}
		
	}
	
	@Override  // 不用呼叫，是被觸發的
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D)g;  // 多型概念(強制轉型)
		
		g2d.setColor(Color.BLUE);
		g2d.setStroke(new BasicStroke(4));  // 有順序問題
		
		for(LinkedList<HashMap<String, Integer>> line : lines) {
			for(int i=1 ; i<line.size() ; i++) {
				HashMap<String, Integer> p0 = line.get(i-1);
				HashMap<String, Integer> p1 = line.get(i);
				g2d.drawLine(p0.get("x"), p0.get("y"), p1.get("x"), p1.get("y"));
			}
		}
		
		
//		g2d.drawLine(0, 0, 100, 200);
		
	
//		判別g是哪個類別
//		if (g instanceof DebugGraphics) {
//			System.out.println("111");
//		}else if(g instanceof Graphics2D) {
//			System.out.println("222");
//		}else {
//			System.out.println("333");
//		}
//		System.out.println("ok");
	
	}
	
	public void clear() {
		lines.clear();
		garbag.clear();
		repaint();
	}
	
	public void undo() {
		if(lines.size()>0) {
			garbag.add(lines.removeLast()) ;
			repaint();
		}
	}
	
	public void redo(){
		if(garbag.size()>0) {
			lines.add(garbag.removeLast());
			repaint();
		}
	}
	
	public void saveJPEG() {
		System.out.println("saveJPEG()test1");
		BufferedImage img = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_RGB);
		Graphics g = img.getGraphics();
		paint(g);
		try {
			if(ImageIO.write(img, "jpg", new File("dir1/tung.jpg"))) {
				System.out.println("ok");
			}else {
				System.out.println("xx");
			}
			System.out.println("saveJPEG()test2");
			
		} catch (IOException e) {
			System.out.println(e);

		}
	}
	
	public void saveLines() throws Exception {
		try (ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream("dir1/tung.sign"))) {
			oout.writeObject(lines);
			oout.flush();
		}
	}
	
	public void loadLines() throws Exception{
		ObjectInputStream oin = new ObjectInputStream(new FileInputStream("dir1/tung.sign"));
		Object obj = oin.readObject();
		lines = (LinkedList<LinkedList<HashMap<String, Integer>>>)obj;
		oin.close();
		
		repaint();
	}
	
}
