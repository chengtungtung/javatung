package tw.org.iii.classes;

// 繼承
public class Scooter extends Bike { 
	// extends代表擴增擴大的意思，摩托車將腳踏車發揚光大，此{}裡的內容就是想另外擴增腳踏車的東西
	// Bike為父類別，Scooter為子類別
	
	// Scooter的加速度跟Bike的加速度不一樣，所以再設計一個方法覆寫父類別
	@Override   // 覆寫
	public void upSpeed() {
		speed = speed < 1 ? 1 : speed *1.9; 
		// 目前的Bike類別中的屬性speed設為private，所以要調整成protected，就可以讓繼承的子類別存取
		/*
		錯誤：The field Bike.speed is not visible (由於父類別的屬性speed為private，所以會看不到)
		 */
	}
	
	//-------------------------------------------------------------------------------------
	
//	
//	private int gear; // 宣告完預設為0
//	
//	
//	
//	public void upSpeed() {
//		if(gear > 0) {
//		speed = speed < 1 ? 1 : speed * 1.9 * gear;
//		}
//	}
//	
//	public int upGear() {
//		if (gear < 4) gear++;
//		return gear;
//	}
//	
//	public int downGear() {
//		if (gear > 1) gear--;
//		return gear;
//	}
//	
}
