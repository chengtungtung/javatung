package tw.org.iii.tutor;

public class Tung14 {

	public static void main(String[] args) {
		// 陣列 Array (電腦沒有空間，所以跟矩陣無關)
		int [] a;// 初始化後，3就不能換，就是只能放3個數，不能多放，型別宣告後，陣列裡面不能放不同型別
		a = new int[3]; // []裡面只能放int型別，且要大於0
		boolean[] b = new boolean[4];
		byte[] c = new byte[3];
		short[] d = new short[3];
		long[] e = new long[3];
		float[] f = new float[3];
		double[] g = new double[3];
		char[] h = new char[3];
//		
//		System.out.println(a.length); // 印出 3 
//		System.out.println(b.length); // 印出 4
		
		// 雖然只有宣告，只要一旦初始化，裡面就會有值，就算還沒放值進去，裡面會先有預設值
//		System.out.println(a[0]); // 印出0 (int預設值為0)
//		System.out.println(a[1]); // 印出0 
//		System.out.println(a[2]); // 印出0
//		System.out.println(b[0]); // 印出false (boolean預設值為false)
//		System.out.println(c[0]); // 印出0 (byte預設值為0)
//		System.out.println(d[0]); // 印出0 (short預設值為0)
//		System.out.println(e[0]); // 印出0 (long預設值為0)
//		System.out.println(f[0]); // 印出0.0 (float預設值為0.0)
//		System.out.println(g[0]); // 印出0.0 (double預設值為0.0)
//		System.out.println(h[0]); // 印出    (char預設值為0)
//		System.out.println("---------------------");
		
		// 放值進去
		a[0] = 44;
		a[1] = 12;
		a[2] = 11;
		
		// 印出a[]的全部值
//		for(int i = 0; i<a.length;i++) {
//			System.out.println(a[i]);
//		}
		
		// for-each 跑每一個元素
//		System.out.println("--------------");
		int sum =0 ;
		for(int v:a) {      // for(尋訪元素的型別 變數名稱 : 想要尋訪的元素(陣列)名稱)
			sum= sum + v;
		}
		System.out.println(sum);
		
		
		
		
	}

}
