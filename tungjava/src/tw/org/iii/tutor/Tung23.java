package tw.org.iii.tutor;

//import tw.org.iii.classes.Scooter;

public class Tung23 {
	public static void main(String[] args) {
		Tung233 obj1 = new Tung233(); // 宣告一個Tung233的一個物件
	}
}

// 1.每個class都有建構式
// 2.物件的祖宗十八代都有初始化
// 底下類別因為沒有public，只能被相同的package存取
// 一個類別中，只會有一個主類別，被宣告public的類別是主類別，所以上方Tung23是主類別
class Tung231 extends Object {   // extends Object是可以不寫的
	Tung231() {
		System.out.println("Tung231()");
	}
}

class Tung232 extends Tung231{
	// 建構式
	Tung232(int a){
		System.out.println("Tung232()");
	}
}

class Tung233 extends Tung232{
	Tung233(){
		super(1);
		System.out.println("Tung233()");
	}
}
