package fcc.learnextends;

public class Animal {
	//如果使用private修饰，则无法在子类中使用。
	int age;
	String name;
	public void eat(){
		System.out.println("动物具有吃的能力！");
	}
}
