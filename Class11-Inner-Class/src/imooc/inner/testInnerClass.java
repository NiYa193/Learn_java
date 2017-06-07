package imooc.inner;

public class testInnerClass{
	//定义外部类静态私有变量
	private static int score = 98;
	//定义外部类变量
	int outScore = 93;
	//定义静态内部类
	public static class inner{
		int score = 89;
		public void show(){
			//访问外部类静态成员采用外部类名.静态成员
			System.out.println("访问外部类的score："+ testInnerClass.score);
			//访问内部成员直接访问
			System.out.println("访问内部类的score："+ score);
			//访问外部非静态成员 new 外部类().成员  的方式访问 
			System.out.println("访问外部内的非私有outScore："+ new testInnerClass().outScore);
		}
	}
	
	public static void main(String[] args) {
		//创建静态内部类的对象时，不需外部类对象，直接创建即可
		inner fcc = new inner();
		fcc.show();
	}
}