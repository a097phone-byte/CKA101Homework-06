package hw1;

public class Q4 {
	
	public static void main(String[] args) {
		final double PI = 3.1415;
		int r = 5;
		
		double Area = PI * Math.pow(r,2);		//圓面積 = 圓週率 * 半徑平方
		double Circumference = 2 * PI * r;		//圓周長 = 2 * 圓周率 * 半徑
		
		System.out.printf("圓面積 = %.4f%n" , Area);				//取小數後4位數
		System.out.printf("圓面積 = %.4f%n" , Circumference);	//取小數後4位數
	}

}
