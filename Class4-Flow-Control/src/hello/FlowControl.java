package hello;
import java.util.Scanner;

public class FlowControl{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);//����Scanner����
		System.out.print("�����������");
		int count = 0;
		int score = input.nextInt(); //��ȡ�û�������Ϣ
		System.out.println("�ӷ�ǰ�ķ�����"+score);
		while(score<60){
			score++;
			count++;
		}
		System.out.println("�ӷ�ǰ�ķ�����"+score);
		System.out.println("������"+count+"�Σ�");
	}
}