package hello;

public class learnStatic {
	//�ڴ˴�����һ��static�ַ��ͱ���
	static String className = "Java����һ��";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�ڴ˴���ֱ��ʹ�����������������
		System.out.println("ͨ���������ʣ�"+learnStatic.className);
		//��Ȼ����ʹ���½�������ʹ��
		learnStatic fcc = new learnStatic();
		System.out.println("ͨ��������ʣ�"+fcc.className);
		fcc.className = "Java��������";
		System.out.println("�ٴ�ͨ�����������޸ĺ�ı�����"+learnStatic.className);
	}

}
