package hello;

public class InitialTelephone{
	public static void main(String[] args) {
		Telephone phone = new Telephone();
		//还需在main里面再创建一个对象
		//且此对象要带上要传的参数值
		Telephone newPhone = new Telephone(3.0f, 1.3f, 2.0f);
	}
}