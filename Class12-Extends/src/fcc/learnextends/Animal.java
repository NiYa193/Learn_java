package fcc.learnextends;

public class Animal {
	//���ʹ��private���Σ����޷���������ʹ�á�
	public int age = 10;
	public String name;
	public void eat(){
		System.out.println("age: "+age+"\nname: "+name+"\n������гԵ�������");
	}
	public Animal(){
		System.out.println("Animal�Ĺ���ִ���ˣ�");
		age = 20;
		System.out.println("Animal�����н�age��ֵΪ20��");
	}
}