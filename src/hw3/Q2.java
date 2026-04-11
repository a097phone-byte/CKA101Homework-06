package hw3;

import java.util.Scanner;

//Q2.請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜對則顯示正確訊息

public class Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = (int) (Math.random() * 10);
		System.out.println("開始猜數字吧！");

		while (true) {
			int num = sc.nextInt();
			if (num == r) {
				System.out.println("答對了！答案就是" + num);
				break;
			}
			System.out.println("猜錯囉");
		}

		// 進階功能:產生0~100亂數,每次猜就會提示你是大於還是小於正確答案)
		int r1 = (int) (Math.random() * 101);
		System.out.println("開始猜數字吧！");

		while (true) {
			int num = sc.nextInt();
			if (num == r1) {
				System.out.println("答對了！答案就是" + num);
				break;
			} else if (num > r1) {
				System.out.println("猜錯囉，提示：猜的數字大於正確答案");
			} else {
				System.out.println("猜錯囉，提示：猜的數字小於正確答案");
			}
		}
	}
}
