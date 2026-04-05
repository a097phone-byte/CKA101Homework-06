package hw4;
//Q2.請建立一個字串,經過程式執行後,輸入結果是反過來的
//例如String s = “Hello World”,執行結果即為dlroW olleH

public class Q2 {
	
	public static void main(String[] args){
		String s1 = "Hello World";
		char[] c1 = new char[s1.length()];
		
		for(int i = 0; i < s1.length(); i++) {
			c1[i] = s1.charAt(s1.length() - 1 - i);
		}
		
		String result = "";
		for(int i = 0; i < c1.length; i++) {
			result += c1[i];
		}
		System.out.print(result);
	}

}
