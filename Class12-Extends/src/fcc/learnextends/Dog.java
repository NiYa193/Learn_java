package fcc.learnextends;

public class Dog extends Animal {
	//����super�ؼ��ֵıȽ�
	public int dogage = 10;
	public void eat(){
		System.out.println("age: "+age+"; name: "+name+"; �����гԵ�������");
	}
	public Dog(){
		//�˴��������ʽ�ĵ��ø��๹�췽����������ڵ�һ��
		//super(10);�˴�������Ӳε��ù��죬��������
		super(10);
		System.out.println("Dog�Ĺ���ִ���ˣ�");
		//super();�Ͳ����ԣ�
	}
	
}