package hello;

public class learnStatic{
	String name = "fcc";
	static String hobby = "Java";
	//在此处声明一个静态的方法
	public static void print(){
		//静态方法中不可直接调用非静态变量
		//System.out.println("欢迎您："+name+"!");
		//静态方法中可以直接调用静态变量
		System.out.println("爱好："+hobby+"!");
	}
	
	public void normalPrint(){
		//普通成员方法，可以直接访问非静态变量和静态变量
		System.out.println("欢迎您"+name+"!");
		System.out.println("爱好"+hobby+"!");
	}
	
	public static void main(String[] args) {
		//可以使用类名调用静态方法
		learnStatic.print();
		//也可以使用对象名调用，更推荐使用类名调用的方式
		learnStatic fcc = new learnStatic();
		//静态方法中，静态方法可以直接调用，但需要对象来访问非静态方法
		print();
		fcc.normalPrint();
	}
}