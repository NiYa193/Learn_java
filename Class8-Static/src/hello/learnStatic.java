package hello;

public class learnStatic{
	String name;   //���������ַ�������
	String sex;    //�����Ա��ַ�������
	static int age;//�����������ξ�̬����
	//ͨ�����췽����ʼ��name
	public learnStatic(){
		name = "fcc";
		System.out.println("ͨ�����췽����ʼ��name");
	}
	//ͨ����̬��ʼ�����ʼ��age
	static{
		age = 23;
		System.out.println("ͨ����̬��ʼ�����ʼ��age");
	}
	//ͨ����ʼ�����ʼ��sex
	{
		sex = "��";
		System.out.println("ͨ����ʼ�����ʼ��sex");
	}
	
	//�½�����
	public void show(){
		System.out.println("������"+name+" �Ա�"+sex+" ���䣺"+age);
	}
	public static void main(String[] args) {
		//���췽��
		learnStatic fcc = new learnStatic();
		//ͨ���������show����
		fcc.show();
	}
}