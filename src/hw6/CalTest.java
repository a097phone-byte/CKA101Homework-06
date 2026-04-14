package hw6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("請輸入x的值");
			// 檢查x輸入格式，非自訂例外
			if (!sc.hasNextInt()) {
				throw new InputMismatchException("輸入格式不正確");
			}
			int x = sc.nextInt();

			System.out.println("請輸入y的值");
			// 檢查y輸入格式，非自訂例外
			if (!sc.hasNextInt()) {
				throw new InputMismatchException("輸入格式不正確");
			}
			int y = sc.nextInt();

			int result = Calculator.powerXY(x, y);		// Calculator:static類別，不用創建物件可存取
			System.out.println(x + "的" + y + "次方等於" + result);

		} catch (CalException e) {
			System.out.println(e.getMessage());
		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());
		}
	}

}
