package imooc.inner;

public class testInnerClass{
	String name = "熊豆豆";
	int score = 80;
	//定义外部类中的show方法
	public void show(){
		//定义方法内部类
		class inner{
			
			public int add(int x){
				return x + 10;
			}
		}
		//新建方法内部类对象
		inner fcc = new inner();
		int finalScore = fcc.add(score);
		System.out.println("姓名："+name);
		System.out.println("成绩："+ finalScore);
	}
	public static void main(String[] args) {
		//创建外部类对象
		testInnerClass dou = new testInnerClass();
		dou.show();
	}
}