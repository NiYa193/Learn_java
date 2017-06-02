package hello;

public class InitialTelephone {

	public static void main(String[] args) {
		//该类专用于新建对象
		ClassAndObject phone = new ClassAndObject();
		//给实例变量赋值
		phone.screen = 5.0f;
		phone.cpu = 1.4f;
		phone.memory = 2.0f;
		phone.sentMessage();
	}
}
