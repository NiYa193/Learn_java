package hello;
//�����ֻ�������Ͷ���Ĺ�ϵ
//�ֲ������ͳ�Ա����������
public class ClassAndObject {
	float screen;
	float cpu;
	float memory;
	int Var;
	void call(){
		int localVar = 0;
		int copyVar = 0;
		System.out.println("һ��������ͬ������Ա�����ɱ����з�������");
		System.out.println("���ֲ�����ֻ�ܱ��÷������ã�");
		System.out.println("���籾�����ж����localVarֻ�ܱ�����ʹ��");
		System.out.println("�ֲ�����Ϊ��"+localVar);
		System.out.println("������ʼֵ��ͬ���ֲ�������Ҫ��ʼ������ʹ�á�");
		System.out.println("����Ա��������ֵ�Ļ���Ĭ�ϳ�ʼֵΪ0");
		System.out.println("���磬Var�ĳ�ʼֵΪ��"+Var);
		System.out.println("�����ڲ� ͬ�����У�������ͬ���ֲ�����");
		System.out.println("���磺copyVar�����������еĶ���");
		System.out.println("�ġ��������ͬ��ʱ���ֲ������������ȼ���");
	}
	void sentMessage(){
		int copyVar = 0;
		//System.out.println("�˴��޷�����localVar���ᱨ��");
		System.out.println("screen:"+screen+" cpu:"+cpu+" memory:"+memory+" Telephone�з����ŵĹ��ܣ�");
	}
}
