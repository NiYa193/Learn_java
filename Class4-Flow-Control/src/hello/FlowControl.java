package hello;
import java.util.Scanner;

public class FlowControl{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);//创建Scanner对象
		System.out.print("请输入分数：");
		int count = 0;
		int score = input.nextInt(); //获取用户输入信息
		System.out.println("加分前的分数："+score);
		while(score<60){
			score++;
			count++;
		}
		System.out.println("加分前的分数："+score);
		System.out.println("共加了"+count+"次！");
	}
}