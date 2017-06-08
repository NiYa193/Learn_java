package fcc.learnextends;
//如果此处类改为用final修饰，则无法被继承
public class Animal {
//final public class Animal{
	//如果使用fianl修饰，则该age变为常量！
	public int age = 10;
	public String name;
	//如果final修饰了父类中的方法，则子类中无法覆盖父类的方法
	public void eat(){
		System.out.println("age: "+age+"\nname: "+name+"\n动物具有吃的能力！");
	}
	public Animal(){
		System.out.println("Animal的构造执行了！");
		age = 20;
		System.out.println("Animal构造中将age赋值为20！");
	}
}