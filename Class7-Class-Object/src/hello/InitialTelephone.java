package hello;

public class InitialTelephone{
	public static void main(String[] args) {
		Telephone phone = new Telephone();
		//还需在main里面再创建一个对象
		//且此对象要带上要传的参数值
		//通过有参的构造方法也可以创建对象
		//如果将无参的构造方法注释掉，则系统不会自动添加无参的构造方法，上面的构造将不成立。
		Telephone newPhone = new Telephone(3.0f, 1.3f, 2.0f);
	}
}