package hw5;

// 請設計一個方法為randAvg(),從10個 0~100(含100)的整數亂數中取平均值並印出這10個亂數與平均值

public class Q2 {
	public static void randAvg() {

		// 產生 10 個亂數存進陣列
		int[] r = new int[10];
		int sum = 0;
		for (int i = 0; i < r.length; i++) {
			r[i] = (int) (Math.random() * 101);
			sum += r[i];
		}

		// 列印 10 個亂數
		System.out.print("本次亂數結果:");
		for (int i = 0; i < r.length; i++) {
			System.out.print(r[i] + " ");
		}

		System.out.println();

		// 取平均值列印
		double avg = sum / r.length;
		System.out.print("平均值:" + avg);

	}
		// 直接呼叫方法
	public static void main(String[] args) {
		randAvg();
	}
}
