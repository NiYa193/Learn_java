package hello;

public class idea{
	public static void main(String[] args){
		//建立一个名为stu的对象
		idea stu = new idea();
		//调用stu的calcAvg方法，并接收返回值
		double stuScore = stu.calcAvg();
		System.out.println("学生的成绩平均分是："+stuScore+"分！");
	}
	
	public double calcAvg(){
		double javaScore = 92;
		double phpScore = 97;
		double avg = (javaScore + phpScore) /2;
		//返回方法的运算结果
		return avg;
	}
}