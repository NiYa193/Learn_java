package hello;

import java.util.Arrays;

public class FlowControl{
	public static void main(String[] args) {
		int[] scores = { 89, 72, 64, 58, 93};
		//对数组进行排序
		Arrays.sort(scores);
		//使用foreach对数组元素进行输出
		for(int score : scores){
			System.out.println(score);
		}
	}
}