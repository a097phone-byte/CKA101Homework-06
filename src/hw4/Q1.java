package hw4;

//Q1.有個一維陣列如下: {29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素

public class Q1 {
	public static void main(String[] args) {
		int sum = 0;
		int[] x = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		for (int i = 0; i < x.length; i++) {
			sum += x[i];
		}
		int avg = sum / x.length;
		System.out.println("平均值: " + avg);
		
		System.out.print("大於平均值:");
		for (int i = 0; i < x.length; i++) {
			if (x[i] > avg) {
				System.out.print(x[i] + " ");
			}
		}
	}

}
