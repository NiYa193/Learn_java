package imooc.inner;

public class testInnerClass{
	//�����ⲿ�ྲ̬˽�б���
	private static int score = 98;
	//�����ⲿ�����
	int outScore = 93;
	//���徲̬�ڲ���
	public static class inner{
		int score = 89;
		public void show(){
			//�����ⲿ�ྲ̬��Ա�����ⲿ����.��̬��Ա
			System.out.println("�����ⲿ���score��"+ testInnerClass.score);
			//�����ڲ���Աֱ�ӷ���
			System.out.println("�����ڲ����score��"+ score);
			//�����ⲿ�Ǿ�̬��Ա new �ⲿ��().��Ա  �ķ�ʽ���� 
			System.out.println("�����ⲿ�ڵķ�˽��outScore��"+ new testInnerClass().outScore);
		}
	}
	
	public static void main(String[] args) {
		//������̬�ڲ���Ķ���ʱ�������ⲿ�����ֱ�Ӵ�������
		inner fcc = new inner();
		fcc.show();
	}
}