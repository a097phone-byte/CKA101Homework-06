package hw3;

import java.util.Scanner;

//Q3.阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討
//厭哪個數字,請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇的號碼與總數

public class Q3 {
	public static void main(String[] args) {
		
		//第一步:輸入討厭的數字
		Scanner sc = new Scanner(System.in);
		System.out.println("阿文...請輸入你討厭哪個數字？");
		int hate = sc.nextInt();				
		
		//第二步:過濾數字，存進陣列
		int[] lottery = new int[49];
		int count = 0;
		
		for(int i = 1; i <= 49; i++) {			
			if(i/10 != hate && i % 10 != hate) {	
				lottery[count] = i;
				count++;
			}
		}
		
		//第三步：印出結果
		for(int i = 0; i < lottery.length; i++) {
			System.out.print(lottery[i] + " ");
		}
		System.out.println();
		System.out.println("總共有" + count + "個");	
	}
}
