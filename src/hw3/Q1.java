package hw3;

import java.util.Scanner;

//Q1.請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰三角形、其它三角形或不是三角形:

public class Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入三個整數:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int a2 = (int) Math.pow(a, 2);
		int b2 = (int) Math.pow(b, 2);
		int c2 = (int) Math.pow(c, 2);

		if (a + b > c || a + c > b || b + c > a) {
			if (a == b && a == c && b == c) {
				System.out.println("正三角形");
			} else if (a == b || a == c || b == c) {
				System.out.println("等腰三角形");
			} else if (a2 + b2 == c2 || a2 + c2 == b2 || b2 + c2 == a2) {
				System.out.println("直角三角形");
			} else {
				System.out.println("其它三角形");
			}
		}
		else {
			System.out.println("不是三角形");
		}
	}
}
