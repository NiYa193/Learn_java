package hello;
import java.util.Scanner;

public class FlowControl{
	public static void main(String[] args) {
		int classNum = 3;
		int stuNum = 4;
		double sum = 0;
		double score = 0;
		double stuAvg = 0;
		Scanner input = new Scanner(System.in);
		for(int i = 1; classNum >= i ; i++){
			System.out.println("请输入第"+i+"个班级的学生信息：");
			for(int j =1; stuNum >= j; j++){
				System.out.print("请输入第"+j+"个学生的分数：");
				score = input.nextInt();
				sum += score;
			}
			stuAvg = sum / stuNum;
			System.out.println("第"+i+"个班级学生的平均分是"+stuAvg);
			sum = 0;
		}
		
	}
}