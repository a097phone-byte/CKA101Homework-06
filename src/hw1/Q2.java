package hw1;

public class Q2 {

	public static void main (String[] args) {
		int num1 = 200 , num2 = 12;
		int dozen = num1 / num2;
		int grain = num1 % num2;
		
		System.out.println(dozen + "打" + grain + "顆");
	}
}
