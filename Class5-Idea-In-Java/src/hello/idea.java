package hello;

public class idea{
	//����һ�������������ķ���
	public int findMaxAge(){
		//������������
		int[] ages = {18, 23, 21, 19, 25, 29 ,17};
		//�ٶ��������Ϊ�����һ��Ԫ��
		int max = ages[0];
		//��������Ԫ�أ�����max��ȣ����ҳ������Ԫ��
		for(int i = 0; i < ages.length; i++){
			if(ages[i] > max){
				max = ages[i];
			}
		}
		//�����������
		return max;
	}
	
	public static void main(String[] args) {
		int maxScore;
		//�½�һ��fcc����
		idea fcc = new idea();
		//����fcc�����findMaxAge����
		maxScore = fcc.findMaxAge();
		//�������
		System.out.println("�������Ϊ��"+maxScore+"��");
	}
}