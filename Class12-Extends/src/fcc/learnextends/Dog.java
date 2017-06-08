package fcc.learnextends;

public class Dog extends Animal {
	//用于super关键字的比较
	public int dogage = 10;
	public void eat(){
		System.out.println("age: "+age+"; name: "+name+"; 狗具有吃的能力！");
	}
	public Dog(){
		//此处如果想显式的调用父类构造方法，必须放在第一行
		//super(10);此处如果不加参调用构造，则编译出错！
		super(10);
		System.out.println("Dog的构造执行了！");
		//super();就不可以！
	}
	
}