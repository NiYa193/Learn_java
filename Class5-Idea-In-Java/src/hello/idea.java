package hello;

public class idea{
	//添加名为showMyLove的方法
	public void showMyLove(){
		System.out.println("Doudou I love you!");
	}
	
	public static void main(String[] args) {
		//添加一个fcc对象
		idea fcc = new idea();
		//调用fcc对象的showMyLove方法
		fcc.showMyLove();
	}
}