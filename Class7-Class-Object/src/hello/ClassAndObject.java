package hello;
//利用手机讲解类和对象的关系
//局部变量和成员变量的区别
public class ClassAndObject {
	float screen;
	float cpu;
	float memory;
	int Var;
	void call(){
		int localVar = 0;
		int copyVar = 0;
		System.out.println("一、作用域不同，例成员变量可被所有方法调用");
		System.out.println("而局部变量只能被该方法调用！");
		System.out.println("例如本方法中定义的localVar只能本方法使用");
		System.out.println("局部变量为："+localVar);
		System.out.println("二、初始值不同，局部变量需要初始化才能使用。");
		System.out.println("而成员变量不赋值的话，默认初始值为0");
		System.out.println("例如，Var的初始值为："+Var);
		System.out.println("三、在不 同方法中，允许有同名局部变量");
		System.out.println("例如：copyVar在两个方法中的定义");
		System.out.println("四、两类变量同名时，局部变量更有优先级！");
	}
	void sentMessage(){
		int copyVar = 0;
		//System.out.println("此处无法调用localVar，会报错");
		System.out.println("screen:"+screen+" cpu:"+cpu+" memory:"+memory+" Telephone有发短信的功能！");
	}
}
