package hello;

public class Telephone{
	float screen;
	float cpu;
	float memory;
	public Telephone(){
		System.out.println("无参的构造方法执行了！");
	}
	//可直接再次定义，类似方法的重载
	//如果将无参的构造方法注释掉，则系统不会自动添加无参的构造方法
	public Telephone(float newScreen, float newCpu, float newMemory){
		if(newScreen < 3.5f){
			screen = 3.5f;
			System.out.println("您所输入的屏幕尺寸有错误，已改为默认值。");
		}else{
			screen = newScreen;
		}
		cpu = newCpu;
		memory = newMemory;
		System.out.println("Screen:"+screen+" Cpu:"+cpu+" Memory:"+memory);
	}
}