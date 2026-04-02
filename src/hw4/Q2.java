package hw4;
//Q2.請建立一個字串,經過程式執行後,輸入結果是反過來的
//例如String s = “Hello World”,執行結果即為dlroW olleH

public class Q2 {
	
	public static void main(String[] args){
		
		String s = "Hello World";
		String s1 = "";
		
		for(int i = s.length() - 1; i >= 0; i--) { 		//取用字串區域變數length方法須加()
			s1 += s.charAt(i);
		}
		System.out.println(s1);
	}

}
