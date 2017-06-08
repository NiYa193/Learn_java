package fcc.learnextends;

public class Animal {
	//如果使用private修饰，则无法在子类中使用。
	public int age = 10;
	public String name;
	public void eat(){
		System.out.println("age: "+age+"\nname: "+name+"\n动物具有吃的能力！");
	}
	public Animal(){
		System.out.println("Animal的构造执行了！");
		age = 20;
		System.out.println("Animal构造中将age赋值为20！");
	}
}