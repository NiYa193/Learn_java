package hello;

public class learnStatic{
	//在此处声明一个静态的方法
	public static void print(){
		System.out.println("声明的静态方法");
	}
	public static void main(String[] args) {
		//可以使用类名调用静态方法
		learnStatic.print();
		//也可以使用对象名调用，更推荐使用类名调用的方式
		learnStatic fcc = new learnStatic();
		fcc.print();
	}
}