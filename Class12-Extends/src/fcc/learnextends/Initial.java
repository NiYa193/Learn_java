package fcc.learnextends;

public class Initial{
	public static void main(String[] args) {
		Dog dog001 = new Dog();
		Dog dog002 = new Dog();
		dog001.height = 1.1f;
		dog001.name = "xupao";
		dog001.weight = 76f;
		dog002.height = 1.1f;
		dog002.name = "xupao";
		dog002.weight = 76f;
		//如不对方法进行重写，则只判断方法的地址是否相同。那显然两个对象是不同的
		//重写后，则判断重写的方法内的属性是否相同
		if(dog001.equals(dog002)){
			System.out.println("两个对象是相同的！");
		}
		else{
			System.out.println("两个对象是不同的！");
		}
	}
}