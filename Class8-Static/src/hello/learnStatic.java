package hello;

public class learnStatic {
	//在此处声明一个static字符型变量
	static String className = "Java开发一班";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//在此处可直接使用类名调用这个变量
		System.out.println("通过类名访问："+learnStatic.className);
		//依然可以使用新建对象再使用
		learnStatic fcc = new learnStatic();
		System.out.println("通过对象访问："+fcc.className);
		fcc.className = "Java开发二班";
		System.out.println("再次通过类名访问修改后的变量："+learnStatic.className);
	}

}
