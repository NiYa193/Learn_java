package hello;

import java.util.Arrays;

public class FlowControl{
	public static void main(String[] args) {
		int[] scores = { 89, 72, 64, 58, 93};
		//�������������
		Arrays.sort(scores);
		//ʹ��foreach������Ԫ�ؽ������
		for(int score : scores){
			System.out.println(score);
		}
	}
}