package imooc.inner;

public class testInnerClass{
	//�����ⲿ˽������name
	private String name = "�ⲿname!";
	//�����ⲿ��Ա����age
	int age = 23;
	//�����ڲ���
	public class Inner{
		String name = "�ڲ�name";
		public void show(){
			System.out.println("�ⲿ���name���ã�"+ testInnerClass.this.name);
			System.out.println("�ڲ����name���ã�"+ name);
			System.out.println("�ⲿage�ĵ��ã�"+ age);
		}
	}
	public static void main(String[] args) {
		//�����ⲿ�����
		testInnerClass fcc = new testInnerClass();
		//�����ⲿ����󴴽��ڲ������
		Inner dou = fcc.new Inner();
		dou.show();
	}
}