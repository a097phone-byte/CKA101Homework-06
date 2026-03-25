package hw2;

//Q1.請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)
public class Q1toQ7 {
	
	public static void main (String[] args) {
		float f1 = 15; 
		int sum = 0;
		for (int i = 1; i <= 1000; i++) {
			if(i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
		
//Q2.請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)

		int mult = 1;
		for(int num = 2; num <= 10; num++) {
			mult *= num; 
		}
		System.out.println(mult);
		
//Q3.請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
		
		int mult1 = 1, num1 = 2;
		while(num1 <= 10) {
			mult1 *= num1;
			num1++;
		}
		System.out.println(mult1);
		
		
//Q4.請設計一隻Java程式,輸出結果為以下:1 4 9 16 25 36 49 64 81 100
		
		for(int j = 1; j <= 10; j++) {
			int square = (int)Math.pow(j, 2);
			
			System.out.print(square + " ");
		}
		
//Q5.阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。請設計一隻程式,
//輸出結果為阿文可以選擇的數字有哪些?總共有幾個?

		int count = 0;
		for (int p = 1; p <= 49; p++) {
			int n = p % 10;		//判斷個位數是否有4
			int m = p / 10;		//判斷十位數是否有4
			
			if(n != 4 && m != 4) {
				System.out.print(p + " ");
				count++;
			}
		}
		System.out.print("\n");
		System.out.println("總共有" + count + "個");
		
		
//Q6.請設計一隻Java程式,輸出結果為以下:
//			1 2 3 4 5 6 7 8 9 10
//			1 2 3 4 5 6 7 8 9
//			1 2 3 4 5 6 7 8
//			1 2 3 4 5 6 7
//			1 2 3 4 5 6
//			1 2 3 4 5
//			1 2 3 4
//			1 2 3
//			1 2
//			1
		
		for(int t = 1; t <= 10; t++) {		//控制行數
			for(int y = 1; y <= 11-t; y++)	//控制每行幾個數字
				System.out.print(y + " ");
			System.out.println();
		}
		
		
//Q7.請設計一隻Java程式,輸出結果為以下:
//			A
//			BB
//			CCC
//			DDDD
//			EEEEE
//			FFFFFF
		
		for(char a = 'A';a <= 'F';a++) {				//字元'A'=65
			for(int f = 1; f <= (a - 'A' + 1); f++) {	//一行顯示幾個
				System.out.print(a);	
				}
			System.out.println();
		}
	}
}
