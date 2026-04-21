package hw8;
// 2.請寫一隻程式,讓Train物件印出時,能以班次編號由大到小印出:ArrayList集合

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestTrain2 {
	public static void main(String[] args) {
		List<Train> list = new ArrayList<>();
		Train t1 = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
		Train t2 = new Train(1254, "區間", "屏東", "基隆", 700);
		Train t3 = new Train(118, "自強", "高雄", "台北", 500);
		Train t4 = new Train(1288, "區間", "新竹", "基隆", 400);
		Train t5 = new Train(122, "自強", "台中", "花蓮", 600);
		Train t6 = new Train(1222, "區間", "樹林", "七堵", 300);
		Train t7 = new Train(1254, "區間", "屏東", "基隆", 700);
		
		list.add(t1);
		list.add(t2);
		list.add(t3);
		list.add(t4);
		list.add(t5);
		list.add(t6);
		list.add(t7);
		
		Collections.sort(list);
		
		// Iterator 取值
		Iterator objs = list.iterator();
		while(objs.hasNext()) {
			Train train = (Train)objs.next();
			System.out.println(train.getNumber() + ", " + train.getType() + ", " + train.getStart() + ", " + train.getDest() + ", " + train.getPrice());
		}
		
		// for-each 取值
		for(Train train : list)
			System.out.println(train.getNumber() + ", " + train.getType() + ", " + train.getStart() + ", " + train.getDest() + ", " + train.getPrice());
		
		//傳統 for 迴圈
		for (int i = 0; i < list.size();i++) {
			Train t = list.get(i);
			System.out.println(t.getNumber() + ", " + t.getType() + ", " + t.getStart() + ", " + t.getDest() + ", " + t.getPrice());
		}
		
	}

}
