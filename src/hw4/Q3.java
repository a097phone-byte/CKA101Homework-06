package hw4;

//Q3.有個字串陣列如下 (八大行星):
//{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)

public class Q3 {

	public static void main(String[] args) {
		int count = 0;
		String[] planets = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };

		for (int i = 0; i < planets.length; i++) { 				// length是陣列屬性
			for (int j = 0; j < planets[i].length(); j++) { 	// 取用字串length方法需加()
				char c = planets[i].charAt(j); 					// 取出字元
				if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
					count++;
				}
			}
		}
		System.out.println("母音總數:" + count);
	}

}
