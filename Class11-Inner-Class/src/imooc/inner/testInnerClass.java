package imooc.inner;

public class testInnerClass{
	//定义外部私有属性name
	private String name = "外部name!";
	//定义外部成员属性age
	int age = 23;
	//定义内部类
	public class Inner{
		String name = "内部name";
		public void show(){
			System.out.println("外部类的name调用："+ testInnerClass.this.name);
			System.out.println("内部类的name调用："+ name);
			System.out.println("外部age的调用："+ age);
		}
	}
	public static void main(String[] args) {
		//创建外部类对象
		testInnerClass fcc = new testInnerClass();
		//借用外部类对象创建内部类对象
		Inner dou = fcc.new Inner();
		dou.show();
	}
}