package fcc.learnextends;

public class Initial{
	public static void main(String[] args) {
		Dog dog = new Dog();
		//如不对toString重写，则默认打印对象的地址：
		System.out.println(dog);
	}

}