package hello;

public class idea{
    public static void main(String[] args) {
		// ��������
		idea hello = new idea();
		// �����޲εķ���
		hello.print();
		// ���ô���һ���ַ��������ķ���
	    hello.print("Doudou I love you");
		// ���ô���һ�����Ͳ����ķ���
	    hello.print(23);
	}

	public void print() {
		System.out.println("�޲ε�print����");
	}
	public void print(String name) {
		System.out.println("����һ���ַ���������print����������ֵΪ��" + name);
	}
	public void print(int age) {
		System.out.println("����һ�����Ͳ�����print����������ֵΪ��" + age);
	}
}