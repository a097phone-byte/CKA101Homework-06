//Q5.承上題,請寫一個程式,能讀取Object.ser這四個物件,並執行speak()方法觀察結果如何 (請利用多
//型簡化本題的程式設計)

package hw7;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Q5 {
	public static void main(String[] args) throws Exception {
		File file = new File("c:\\data\\Object.ser");
	
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		try {
		while(true) {
			// 用 Pet 介面實現多型操作
			Pet pet = (Pet)ois.readObject();
			pet.speak();
//			((Dog)ois.readObject()).speak();
//			((Cat)ois.readObject()).speak();
			}
		}catch(EOFException e) {
			System.out.println("資料讀取完畢!");
		}
		ois.close();
		fis.close();

	}
}
