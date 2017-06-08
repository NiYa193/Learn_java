package fcc.learnextends;

public class Dog extends Animal {
	//对父类的方法进行重写，优先调用。
	public void eat(){
		System.out.println("age: "+age+"; name: "+name+"; 狗具有吃的能力！");
	}
	public Dog(){
		System.out.println("Dog的构造执行了！");
	}
}