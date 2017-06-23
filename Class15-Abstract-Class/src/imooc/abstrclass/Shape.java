package imooc.abstrclass;
//定义抽象类
public abstract class Shape {
	int length = 5;
	int width = 10;
	int radius = 4;
	float PI = 3.1415f;
	//抽象类的方法无需实现，只需声明即可
	public abstract void Circumference();
	public abstract void Area();
}