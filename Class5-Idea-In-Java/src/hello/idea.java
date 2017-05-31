package hello;

public class idea{
	public static void main(String[] args) {
		idea fcc = new idea();
		fcc.calcAvg(99, 96);
	}
	//添加一个没有返回值，但是有参数的方法
	public void calcAvg(double javaScore, double phpScore){
		double avg = (javaScore + phpScore) / 2;
		System.out.println("平均分："+avg);
	}
}