package hw8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// 請建立一個Collection物件並將以下資料加入:
// Integer(100)、Double(3.14)、Long(21L)、Short(“100”)、Double(5.1)、“Kitty”、Integer(100)、
// Object物件、“Snoopy”、BigInteger(“1000”)

public class Q1 {
	public static void main(String[] args) {
		List<Object> list = new ArrayList<>();
		list.add(new Integer(100));
		list.add(new Double(3.14));
		list.add(new Long(21L));
		list.add(new Short("100"));
		list.add(new Double(5.1));
		list.add("Kitty");
		list.add(new Integer(100));
		list.add(new Object());
		list.add("Snoopy");
		list.add(new BigInteger("1000"));

		// 1.印出這個物件裡的所有元素(使用Iterator, 傳統for與for-each)
		// 1-1.Iterator 取值
		Iterator objs = list.iterator();
		while(objs.hasNext()) {
			System.out.println(objs.next());
		}
		
		System.out.println("==================");

		// 1-2.傳統 for 迴圈取值
		for(int i = 0; i < list.size(); i++) {
			Object obj = list.get(i);
			System.out.println(obj);
		}

		System.out.println("==================");

		// 1-3.for-each 取值
		for(Object obj : list)
			System.out.println(obj);

		// 2.移除不是java.lang.Number相關的物件
		Iterator it = list.iterator();
		while (it.hasNext()) {
			Object obj = it.next();
			if (!(obj instanceof Number)) { // 如果元素無法轉型為 Number 就移除
				it.remove();
			}
		}
		
		System.out.println("==================");
		
		// 3.再次印出這個集合物件的所有元素,觀察是否已將非Number相關的物件移除成功
		Iterator it3 = list.iterator();
		while (it3.hasNext()) {
			Object obj3 = it3.next();
			if (obj3 instanceof Number) {
				System.out.println(obj3);
			} else {
				System.out.println("尚有非 Number 物件");
			}
		}
//		System.out.println("==================");
//		System.out.println(list);				// 陣列印出

	}

}
