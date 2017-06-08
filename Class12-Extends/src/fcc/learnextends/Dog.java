package fcc.learnextends;
//如果Animal类用fianl修饰，则此处无法被Dog类继承
public class Dog extends Animal {
	//对父类的方法进行重写，优先调用。
	//如果父类中使用了final修饰，则子类中无法再重写
	//用于super关键字的比较
	public int dogage = 10;
	public void eat(){
		System.out.println("age: "+age+"; name: "+name+"; 狗具有吃的能力！");
	}
	public Dog(){
		System.out.println("Dog的构造执行了！");
	}
	public void method(){
		//用super代表父类，进行调用父类的属性
		System.out.println("父类的age："+super.age);
		System.out.println("子类的dogage："+dogage);
		//借用super还可以调用父类的方法
		super.eat();
		System.out.println("父类eat方法执行了！");
		eat();
		System.out.println("子类eat方法执行了！");
	}
	
}