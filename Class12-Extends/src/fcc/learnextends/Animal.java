package fcc.learnextends;
//����˴����Ϊ��final���Σ����޷����̳�
public class Animal {
//final public class Animal{
	//���ʹ��fianl���Σ����age��Ϊ������
	public int age = 10;
	public String name;
	//���final�����˸����еķ��������������޷����Ǹ���ķ���
	public void eat(){
		System.out.println("age: "+age+"\nname: "+name+"\n������гԵ�������");
	}
	public Animal(){
		System.out.println("Animal�Ĺ���ִ���ˣ�");
		age = 20;
		System.out.println("Animal�����н�age��ֵΪ20��");
	}
}