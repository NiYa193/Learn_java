package imooc.refertype;

public class Initial {

	public static void main(String[] args) {
		Dog dog001 = new Dog();
		Animal animal = dog001;//该类型转换合法
		//Dog dog002 = animal;//该类型转换会因为类型不同而错误
		Dog dog002 = (Dog)animal;//向下类型转换（强制类型转换）
		//但是这样做，存在风险。
		//Cat cat = (Cat)animal;//这样编写编译器检查是没有错误，但是执行有错误
		//因为类型不同，不能转换。
		//为了避免这个问题，采用instanceof运算符
		if(animal instanceof Dog){
			Dog dog003 = (Dog)animal;
		}
		else{
			System.out.println("无法进行类型转换dog");
		}
		if(animal instanceof Cat){
			Cat cat = (Cat)animal;
		}
		else{
			System.out.println("无法进行类型转换cat");
		}
	}
}