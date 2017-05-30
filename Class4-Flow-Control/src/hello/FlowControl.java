package hello;

import java.util.Arrays;

public class FlowControl {
    public static void main(String[] args) {
		// 定义一个整型数组，并赋初值
		String[] nums = new String[] {"sports", "game", "movie"};
		//对数组内元素进行排序，从小到大
		Arrays.sort(nums);
		for(int i = 0; i < nums.length; i++){
			System.out.println(nums[i]);
		}
		System.out.println("组合后的字符串为："+Arrays.toString(nums));
	}
}