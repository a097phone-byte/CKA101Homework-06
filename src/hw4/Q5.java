package hw4;
//Q5.請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天

//例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("請分別輸入西元yyyy年/mm月/dd日");
		int yy = sc.nextInt();
		int mm = sc.nextInt();
		int dd = sc.nextInt();

		// 建立每月天數陣列
		int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int total = 0;

		// 年份能被4整除但不能被100整除，或是能被400整除，即為閏年
		if ((yy % 4 == 0 && yy % 100 != 0) || yy % 400 == 0)
			days[1] = 29;

		// 檢查輸入是否正確
		if (mm < 1 || mm > 12) {
			System.out.println("月份輸入錯誤！");
		} else if (dd < 1 || dd > days[mm - 1]) {
			System.out.println("日期輸入錯誤！");
		} else {
			for (int i = 0; i < mm - 1; i++) {
				total += days[i];
			}
			total += dd;
			System.out.println("輸入的日期為該年第" + total + "天");
		}
	}

}
