package hw4;

import java.util.Scanner;

//Q4.阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個,其員工編號與身上現金。
//請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事有錢可借他;
//並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的員工編號: 25 19 27 共 3 人!」

public class Q4 {

	public static void main(String[] args) {
		int count = 0;
		int[][] poorGuy = { { 25, 32, 8, 19, 27 }, { 2500, 800, 500, 1000, 1200 } };

		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入借款金額");
		int borrow = sc.nextInt();

		System.out.print("有錢可借的員工編號: ");
		for (int i = 0; i < poorGuy[0].length; i++) {
			if (poorGuy[1][i] >= borrow) {					//鎖定金額陣列
				System.out.print(poorGuy[0][i] + " "); 	//取員工編號
				count++;
			}
		}
		System.out.println("共 " + count + " 人!");
	}

}
