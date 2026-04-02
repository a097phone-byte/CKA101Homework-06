package hw4;

import java.util.Arrays;

//Q6.班上有8位同學,他們進行了6次考試結果，請算出每位同學考最高分的次數
//# 找出每次考試最高分，和每位同學比較最高分是否相等

public class Q6 {

	public static void main(String[] args) {
		int[][] scores = {  { 10, 35, 40, 100, 90, 85, 75, 70 }, 
							{ 37, 75, 77, 89, 64, 75, 70, 95 },
							{ 100, 70, 79, 90, 75, 70, 79, 90 }, 
							{ 77, 95, 70, 89, 60, 75, 85, 89 },
							{ 98, 70, 89, 90, 75, 90, 89, 90 }, 
							{ 90, 80, 100, 75, 50, 20, 99, 75 } };
		
		// 記數:紀錄每位同學最高分次數
		int[] count = new int [8];	
		
		for (int i = 0; i < scores.length; i++) {
			
			//找出該次考試最高分同學:以第一位同學作為基準，每次和下一位同學(j從1開始)比較，刷新最高分
			int maxScore = scores[i][0];
			for(int j = 1; j < scores[i].length; j++) {
				if(scores[i][j] > maxScore)
					maxScore = scores[i][j];
			}
			//依序對比每位同學是否和最高分相同，是:該同學計數+1
			for(int j = 0; j < scores[i].length; j++) {
				if(scores[i][j] == maxScore)
					count[j]++;		
			}
		}
		
		//顯示最高分次數
		for(int i = 0; i < count.length; i++) {
			System.out.println(i+1 + "號同學考最高分次數: " + count[i]);
		}	
	}

}
