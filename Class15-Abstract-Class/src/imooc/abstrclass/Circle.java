package imooc.abstrclass;

public class Circle extends Shape {
	@Override
	public void Circumference(){
		System.out.println("圆的周长为："+2*PI*radius);
	}
	@Override
	public void Area(){
		System.out.println("圆的面积为："+PI*Math.pow(radius,2));
	}
}