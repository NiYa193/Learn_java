package fcc.learnextends;

public class Initial{
	public static void main(String[] args) {
		Dog dog001 = new Dog();
		Dog dog002 = new Dog();
		dog001.height = 1.1f;
		dog001.name = "xupao";
		dog001.weight = 76f;
		dog002.height = 1.1f;
		dog002.name = "xupao";
		dog002.weight = 76f;
		//�粻�Է���������д����ֻ�жϷ����ĵ�ַ�Ƿ���ͬ������Ȼ���������ǲ�ͬ��
		//��д�����ж���д�ķ����ڵ������Ƿ���ͬ
		if(dog001.equals(dog002)){
			System.out.println("������������ͬ�ģ�");
		}
		else{
			System.out.println("���������ǲ�ͬ�ģ�");
		}
	}
}