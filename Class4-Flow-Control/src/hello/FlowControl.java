package hello;

import java.util.Arrays;

public class FlowControl {
    public static void main(String[] args) {
		// ����һ���������飬������ֵ
		String[] nums = new String[] {"sports", "game", "movie"};
		//��������Ԫ�ؽ������򣬴�С����
		Arrays.sort(nums);
		for(int i = 0; i < nums.length; i++){
			System.out.println(nums[i]);
		}
		System.out.println("��Ϻ���ַ���Ϊ��"+Arrays.toString(nums));
	}
}