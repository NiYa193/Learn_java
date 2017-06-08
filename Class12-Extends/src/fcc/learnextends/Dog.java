package fcc.learnextends;

public class Dog extends Animal {
	//对父类的方法进行重写，优先调用。
	public void eat(){
		System.out.println("age: "+age+"\nname: "+name+"\n狗具有吃的能力！");
	}
}