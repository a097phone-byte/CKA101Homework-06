package hw3;

import java.util.Scanner;

//Q2.請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜對則顯示正確訊息

public class Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("開始猜數字吧！ ");

		int r = (int) (Math.random() * 10);
		
		while (true) {
			int num = sc.nextInt();			//輸入數值指定給num
			
			if(num == r) {
				System.out.println("答對了！答案就是 " + num);
				break;
			}
			else {
				System.out.println("猜錯囉！");
			}
		}
	}
}
