//Q3. 請從無到有試著完成一個方法名為copyFile,這個方法有兩個參數。呼叫此方法時,第一個參數所
// 代表的檔案會複製到第二個參數代表的檔案

package hw7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Q3 {
	public static void copyFile(String src, String dest) throws IOException{
		FileInputStream in = new FileInputStream(src);
		FileOutputStream out = new FileOutputStream(dest);
		
		int p;
		while((p = in.read()) != -1) {
			out.write(p);
			System.out.print((char)p);
			System.out.flush();
		}
		out.close();
		in.close();
	}
	
	public static void main(String[] args) {
		try {
			copyFile("C:\\javawork\\Q3\\src.txt","C:\\javawork\\Q3\\dest.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
