package imooc.inner;

public class testInnerClass{
	String name = "�ܶ���";
	int score = 80;
	//�����ⲿ���е�show����
	public void show(){
		//���巽���ڲ���
		class inner{
			
			public int add(int x){
				return x + 10;
			}
		}
		//�½������ڲ������
		inner fcc = new inner();
		int finalScore = fcc.add(score);
		System.out.println("������"+name);
		System.out.println("�ɼ���"+ finalScore);
	}
	public static void main(String[] args) {
		//�����ⲿ�����
		testInnerClass dou = new testInnerClass();
		dou.show();
	}
}