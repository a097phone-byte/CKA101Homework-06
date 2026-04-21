package hw9;
//Q1 開啓2個執行緒模擬饅頭人與詹姆士參加快胃王比賽所做的競賽過程。
// 每個動作都以 Thread.sleep()暫停一下,以達到顯示效果。
// Sleep時間由亂數產生500~3000之間的毫秒數,如圖所示
// 參考範例:CounterRunnable.java
// 需留意主執行緒執行順序

public class Eating implements Runnable {
	String name;
	int count = 1;

	public Eating(String name) {
		this.name = name;
	}

	public void run() {
		while (count <= 10) {
			if (count == 10) {
				System.out.println(this.name + "吃第" + count + "碗飯");
				System.out.println(this.name + "吃完了！");
				break;
			} else {
				System.out.println(this.name + "吃第" + count + "碗飯");
				count++;
			}
			try {
				Thread.sleep((long)((Math.random() * 2501) + 500));
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		Eating r1 = new Eating("饅頭人");
		Eating r2 = new Eating("詹姆士");
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();
		System.out.println("-----大胃王快食比賽開始！-----");

		try {
			t1.join();	// 主執行緒等待 t1 結束
			t2.join();	// 主執行緒等待 t2 結束
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println("-----大胃王快食比賽結束！-----");

	}

}
