package imooc.abstrclass;

public class Rectangle extends Shape {
	@Override
	public void Circumference() {
		// TODO Auto-generated method stub
		System.out.println("���ε��ܳ�Ϊ��"+(width + length)*2);
	}
	@Override
	public void Area() {
		// TODO Auto-generated method stub
		System.out.println("���ε����Ϊ��"+(width * length));
	}
}