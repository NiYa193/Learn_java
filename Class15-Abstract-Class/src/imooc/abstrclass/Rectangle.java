package imooc.abstrclass;

public class Rectangle extends Shape {
	@Override
	public void Circumference() {
		// TODO Auto-generated method stub
		System.out.println("矩形的周长为："+(width + length)*2);
	}
	@Override
	public void Area() {
		// TODO Auto-generated method stub
		System.out.println("矩形的面积为："+(width * length));
	}
}