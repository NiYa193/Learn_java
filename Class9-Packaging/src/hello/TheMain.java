package hello;

public class TheMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Packaging fcc =new Packaging();
		//如果screen使用private修饰，则此处通过对象无法进行访问
		//fcc.screen = 5.4f
		//所以此处通过方法进行访问属性
		fcc.setScreen(6.0f);
		System.out.println("screen: "+fcc.getScreen());
	}
}