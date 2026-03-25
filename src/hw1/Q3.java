package hw1;

public class Q3 {
	
	public static void main(String[] args) {
		int TotalSeconds = 256559;
		
		int days = TotalSeconds / 86400;		//取商數換成天，一天86400秒
		int remain1 = TotalSeconds % 86400;		//取餘數給小時
		
		int hours = remain1 / 3600;				//取商數換成小時，一小時3600秒
		int remain2 = remain1 % 3600;			//取餘數給分鐘
		
		int minutes = remain2 / 60;				//取商數換成分鐘，一分鐘60秒
		int seconds = remain2 % 60;				//取餘數換成秒
		
		System.out.println(days + "天" + hours + "小時" + minutes + "分" + seconds + "秒");
	}
}
