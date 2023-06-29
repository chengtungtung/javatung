package tw.org.iii.tutor;

public class Tung40 {

	public static void main(String[] args) {
		// Checked Exception
		Bird b1 = new Bird();
		try {
			b1.setLeg(2);
		} catch (Exception e) {
			System.out.println("錯誤");
		}
		
	}

}

class Bird {
	int leg;
	void setLeg(int n) throws Exception{
		if ( n >= 0 && n<=2) {
			leg = n;
		}else {
			throw new Exception();
		}
	}
	
}