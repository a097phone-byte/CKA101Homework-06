//Q4.請寫一支程式,利用老師提供的Dog與Cat類別分別產生兩個物件,寫到C:\data\Object.ser裡。注
//意物件寫入需注意的事項,若C:\內沒有data資料夾,請用程式新增這個資料夾

package hw7;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Q4 {
	public static void main(String[] args) throws Exception {
		File dir = new File("c:\\data");
		
		// 建立資料夾
		if (!dir.exists()) {
		    dir.mkdir();  	
		    System.out.println("資料夾已建立");
		} else {
		    System.out.println("資料夾已存在");
		}
		
		File file = new File("c:\\data\\Object.ser");
		
		Dog[] dogs = new Dog[2];
		Cat[] cats = new Cat[2];
		dogs[0] = new Dog("小黑");
		dogs[1] = new Dog("來財");
		cats[0] = new Cat("小喵");
		cats[1] = new Cat("阿咪");
		
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		for(int i = 0; i < dogs.length; i++) {
			oos.writeObject(dogs[i]);
			oos.writeObject(cats[i]);
		}
		System.out.println("寫入成功");
		
		oos.close();
		fos.close();
		System.out.println("檔案已保存");
	}
}
