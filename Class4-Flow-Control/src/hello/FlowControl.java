package hello;

public class FlowControl {
    public static void main(String[] args) {
		// ����һ���������飬������ֵ
		int[] nums = new int[] { 61, 23, 4, 74, 13, 148, 20 };
		int max = nums[0]; // �ٶ����ֵΪ�����еĵ�һ��Ԫ��
		int min = nums[0]; // �ٶ���СֵΪ�����еĵ�һ��Ԫ��
		double sum = 0;// �ۼ�ֵ
		double avg = 0;// ƽ��ֵ
		for(int i = 0; i < nums.length; i++){
			if(nums[i] > max){
				max = nums[i];
			}
			if(nums[i] < min){
				min = nums[i];
			}
			sum += nums[i];
		}
		avg = sum / nums.length;
		System.out.println("�����е����ֵ��" + max);
		System.out.println("�����е���Сֵ��" + min);
		System.out.println("�����е�ƽ��ֵ��" + avg);
	}
}