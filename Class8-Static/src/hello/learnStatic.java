package hello;

public class learnStatic{
	//�ڴ˴�����һ����̬�ķ���
	public static void print(){
		System.out.println("�����ľ�̬����");
	}
	public static void main(String[] args) {
		//����ʹ���������þ�̬����
		learnStatic.print();
		//Ҳ����ʹ�ö��������ã����Ƽ�ʹ���������õķ�ʽ
		learnStatic fcc = new learnStatic();
		fcc.print();
	}
}