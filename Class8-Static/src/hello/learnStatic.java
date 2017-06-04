package hello;

public class learnStatic{
	String name;   //声明名字字符串变量
	String sex;    //声明性别字符串变量
	static int age;//声明年龄整形静态变量
	//通过构造方法初始化name
	public learnStatic(){
		name = "fcc";
		System.out.println("通过构造方法初始化name");
	}
	//通过静态初始化块初始化age
	static{
		age = 23;
		System.out.println("通过静态初始化块初始化age");
	}
	//通过初始化块初始化sex
	{
		sex = "男";
		System.out.println("通过初始化块初始化sex");
	}
	
	//新建方法
	public void show(){
		System.out.println("姓名："+name+" 性别："+sex+" 年龄："+age);
	}
	public static void main(String[] args) {
		//构造方法
		learnStatic fcc = new learnStatic();
		//通过对象调用show方法
		fcc.show();
	}
}