package fcc.learnextends;
//���Animal����fianl���Σ���˴��޷���Dog��̳�
public class Dog extends Animal {
	//�Ը���ķ���������д�����ȵ��á�
	//���������ʹ����final���Σ����������޷�����д
	//����super�ؼ��ֵıȽ�
	public int dogage = 10;
	public void eat(){
		System.out.println("age: "+age+"; name: "+name+"; �����гԵ�������");
	}
	public Dog(){
		System.out.println("Dog�Ĺ���ִ���ˣ�");
	}
	public void method(){
		//��super�����࣬���е��ø��������
		System.out.println("�����age��"+super.age);
		System.out.println("�����dogage��"+dogage);
		//����super�����Ե��ø���ķ���
		super.eat();
		System.out.println("����eat����ִ���ˣ�");
		eat();
		System.out.println("����eat����ִ���ˣ�");
	}
	
}