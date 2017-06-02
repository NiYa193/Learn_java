package hello;
//利用手机讲解类和对象的关系
//1、定义一个类
public class ClassAndObject {
	//2、属性（成员变量）：有什么
	float screen;
	float cpu;
	float memory;
	//3、方法：干什么
	void call(){
		System.out.println("Telephone有打电话的功能！");
	}
	void sentMessage(){
		System.out.println("screen:"+screen+" cpu:"+cpu+" memory:"+memory+" Telephone有发短信的功能！");
	}
}
