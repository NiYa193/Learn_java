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
			System.out.println("�������"+i+"���༶��ѧ����Ϣ��");
			for(int j =1; stuNum >= j; j++){
				System.out.print("�������"+j+"��ѧ���ķ�����");
				score = input.nextInt();
				sum += score;
			}
			stuAvg = sum / stuNum;
			System.out.println("��"+i+"���༶ѧ����ƽ������"+stuAvg);
			sum = 0;
		}
		
	}
}