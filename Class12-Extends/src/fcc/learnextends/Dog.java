package fcc.learnextends;
//如果Animal类用fianl修饰，则此处无法被Dog类继承
public class Dog extends Animal {
	//对父类的方法进行重写，优先调用。
	//如果父类中使用了final修饰，则子类中无法再重写
	public void eat(){
		System.out.println("age: "+age+"; name: "+name+"; 狗具有吃的能力！");
	}
	public Dog(){
		System.out.println("Dog的构造执行了！");
	}
}