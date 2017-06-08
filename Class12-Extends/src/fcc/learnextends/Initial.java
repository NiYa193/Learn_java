package fcc.learnextends;

public class Initial {

	public static void main(String[] args) {
		//执行子类构造时，就会先执行父类的构造，所以无需再次声明父类对象
		//Animal animal = new Animal();
		Dog dog = new Dog();
		dog.name = "梁旭炮";
		//dog.eat();
		System.out.println("Dog的eat函数执行了！");
		dog.method();
		System.out.println("Dog的method函数执行了！");
	}
}