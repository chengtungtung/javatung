package tw.org.iii.tutor;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Tung41 {

	public static void main(String[] args) {
		// 堆疊的例外
		// throw
		Tung411 obj = new Tung411();
		//obj.m1();
	}

}

class Tung411 {
	void m1() throws Exception {
		m2(); // m1方法會呼叫m2方法
	}

	void m2() throws InterruptedException {
		try {
			m3(1);
		} catch (IOException e) {

		}
	}

	void m3(int a) throws IOException, InterruptedException {
		if (a == 1) {
			throw new IOException();
		} else if (a == 2) {
			throw new InterruptedException();
		} else if (a == 3) {
			throw new FileNotFoundException();
		}
	}
}
