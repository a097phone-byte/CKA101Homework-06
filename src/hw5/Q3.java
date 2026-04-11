package hw5;

// 利用Overloading,設計兩個方法int maxElement(int x[][])與double maxElement(double x[][]),
// 可以找出二維陣列的最大值並回傳

public class Q3 {

	// 宣告 int 方法
	public static int maxElement(int x[][]) {
		int max = x[0][0]; // 假設第一個數字為最大值
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (x[i][j] > max) { // 和最大值比較後刷新
					max = x[i][j];
				}
			}
		}
		return max;
	}

	// 宣告 double 方法
	public static double maxElement(double x[][]) {
		double max = x[0][0]; // 假設第一個數字為最大值
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (x[i][j] > max) {
					max = x[i][j];
				}
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int[][] intArray = { { 3, 8, 2 }, { 7, 1, 9 }, { 4, 6, 5 } };
		double[][] doubleArray = { { 3.5, 8.2, 2.1 }, { 7.7, 1.3, 9.9 }, { 4.4, 6.6, 5.5 } };

		System.out.println("int最大值:" + maxElement(intArray));
		System.out.println("double最大值:" + maxElement(doubleArray));
	}

}
