package imooc.abstrclass;

public class Circle extends Shape {
	@Override
	public void Circumference(){
		System.out.println("Բ���ܳ�Ϊ��"+2*PI*radius);
	}
	@Override
	public void Area(){
		System.out.println("Բ�����Ϊ��"+PI*Math.pow(radius,2));
	}
}