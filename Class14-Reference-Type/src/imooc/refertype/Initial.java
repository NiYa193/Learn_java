package imooc.refertype;

public class Initial {

	public static void main(String[] args) {
		Dog dog001 = new Dog();
		Animal animal = dog001;//������ת���Ϸ�
		//Dog dog002 = animal;//������ת������Ϊ���Ͳ�ͬ������
		Dog dog002 = (Dog)animal;//��������ת����ǿ������ת����
		//���������������ڷ��ա�
		//Cat cat = (Cat)animal;//������д�����������û�д��󣬵���ִ���д���
		//��Ϊ���Ͳ�ͬ������ת����
		//Ϊ�˱���������⣬����instanceof�����
		if(animal instanceof Dog){
			Dog dog003 = (Dog)animal;
		}
		else{
			System.out.println("�޷���������ת��dog");
		}
		if(animal instanceof Cat){
			Cat cat = (Cat)animal;
		}
		else{
			System.out.println("�޷���������ת��cat");
		}
	}
}