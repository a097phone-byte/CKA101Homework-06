//Q1.請寫一個程式讀取這個Sample.txt檔案,並輸出以下訊息:
//Sample.txt檔案共有xxx個位元組,yyy個字元,zzz列資料

package hw7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Q1{
	static void p(String s) {
		System.out.println(s);
	}

	public static void main(String args[]) {
		File f1 = new File ("c:\\javawork\\Sample.txt");
		long byteCount = f1.length();	// 計算位元
		long charCount = 0;				// 計算字元
		long lineCount = 0;				// 計算列數	
		try {  
			FileReader fr = new FileReader(f1);
			BufferedReader br = new BufferedReader(fr);
			
			String line;
			while((line = br.readLine()) != null) {
				charCount += line.length();
				lineCount++;
			}
			p("Sample.txt檔案共有" + byteCount + "個位元組，"+ charCount + "個字元， " + lineCount + "列資料");
			
			br.close();
			fr.close();
		
		}catch(IOException e){}
	}
}
