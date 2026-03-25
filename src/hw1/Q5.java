package hw1;

public class Q5 {
	
	public static void main(String[] args) {
		int PresentValue = 1_500_000, periods = 10;
		double rate = 0.02;
	
		double FutureValue = PresentValue * Math.pow((1 + rate),periods);	//期末本利和=本金*[(1+利率)的期數次方]
		
		System.out.printf("共有 = %.2f%n ", FutureValue);  //取小數後2位數
	}
}
