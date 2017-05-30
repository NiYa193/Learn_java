package hello;

public class FlowControl{
	public static void main(String[]args){
		int count = 0;
		int score = 53;
		System.out.println("加分前的分数："+score);
		while(score<60){
			score++;
			count++;
		}
		System.out.println("加分前的分数："+score);
		System.out.println("共加了"+count+"次！");
	}
}