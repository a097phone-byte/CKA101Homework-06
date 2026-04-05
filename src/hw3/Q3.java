package hw3;

import java.util.Scanner;

//Q3.阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討
//厭哪個數字,請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇的號碼與總數

public class Q3 {
	public static void main(String[] args) {
		System.out.println("阿文...請輸入你討厭哪個數字？");
		int n = sc.nextInt();
		int count = 0, n1 = 0, n2 = 0;
		
		for (int i = 1; i <= 49; i++) {
			n1 = i / 10;
			n2 = i % 10;
			if (n != n1 && n != n2) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println("總共有 " + count + " 數字可選");

		// 進階挑戰:輸入不要的數字後,直接亂數印出6個號碼且不得重複
		int[] r = new int[49];

		for (int i = 1; i <= 49; i++) {
			n1 = i / 10;
			n2 = i % 10;
			if (n != n1 && n != n2) {
				r[count] = i;
				count++;

			}
		}
		// 隨機抽取不重複的 6 個數字
		int[] sel = new int[6];
		int selcount = 0;

		while (selcount < 6) {
			int index = (int) (Math.random() * count);  // 從號碼陣列中隨機產生一個索引
			int num = r[index]; 						// 用索引取出對應的號碼
			boolean duplicate = false; 					// 先假設沒有重複

			for (int i = 0; i < selcount; i++) {
				if (sel[i] == num) { 					// 發現重複
				duplicate = true; 						// 標記為重複
					break;
				} 										// 不用再比，跳出迴圈
			}
			// 沒有重複才存進去
			if (!duplicate) {
				sel[selcount] = num; 					// 存進已選陣列
			selcount++; 								// 已選數量加1
			}
		}
		
		// 印出最終選出的6個號碼
		System.out.print("本期號碼：");
		for (int i = 0; i < 6; i++) {
		    System.out.print(sel[i] + " ");  			// 逐一印出號碼
		}
	}
}
