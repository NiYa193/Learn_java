package hello;

public class FlowControl{
	public static void main(String[]args){
		int count = 0;
		int score = 53;
		System.out.println("�ӷ�ǰ�ķ�����"+score);
		while(score<60){
			score++;
			count++;
		}
		System.out.println("�ӷ�ǰ�ķ�����"+score);
		System.out.println("������"+count+"�Σ�");
	}
}