package hello;
import java.util.Arrays;

public class idea{
	public static void main(String[] args) {
		//����fcc����
		idea fcc = new idea();
		//����value���飬���շ���ֵ
		int[] value = fcc.getRandomSort(8);
		//��ӡtoString����ַ���
		System.out.println(Arrays.toString(value));
	}
	
	public int[] getRandomSort(int arrayLength){
		//����һ��arrayLength���ȵ�����
		int[] randomValue = new int[arrayLength];
		//ѭ����������������ֵ
		for(int i = 0; i < arrayLength; i++){
			randomValue[i] =(int)(Math.random()*100);
		}
		//�������������
		Arrays.sort(randomValue);
		//��������õ�����
		return randomValue;
	}
}