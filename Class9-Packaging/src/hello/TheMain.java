package hello;

public class TheMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Packaging fcc =new Packaging();
		//���screenʹ��private���Σ���˴�ͨ�������޷����з���
		//fcc.screen = 5.4f
		//���Դ˴�ͨ���������з�������
		fcc.setScreen(6.0f);
		System.out.println("screen: "+fcc.getScreen());
	}
}