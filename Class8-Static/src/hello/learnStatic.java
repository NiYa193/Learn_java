package hello;

public class learnStatic{
	String name = "fcc";
	static String hobby = "Java";
	//�ڴ˴�����һ����̬�ķ���
	public static void print(){
		//��̬�����в���ֱ�ӵ��÷Ǿ�̬����
		//System.out.println("��ӭ����"+name+"!");
		//��̬�����п���ֱ�ӵ��þ�̬����
		System.out.println("���ã�"+hobby+"!");
	}
	
	public void normalPrint(){
		//��ͨ��Ա����������ֱ�ӷ��ʷǾ�̬�����;�̬����
		System.out.println("��ӭ��"+name+"!");
		System.out.println("����"+hobby+"!");
	}
	
	public static void main(String[] args) {
		//����ʹ���������þ�̬����
		learnStatic.print();
		//Ҳ����ʹ�ö��������ã����Ƽ�ʹ���������õķ�ʽ
		learnStatic fcc = new learnStatic();
		//��̬�����У���̬��������ֱ�ӵ��ã�����Ҫ���������ʷǾ�̬����
		print();
		fcc.normalPrint();
	}
}