package hello;

public class FlowControl{
	public static void main(String[]args){
		int sum = 0;
		for(int i =1; i <= 10; i++){
			if(i % 2 != 0){
				continue;
			}
			sum += i;
		}
		System.out.println("1��10֮�����е�ż���ĺ�Ϊ��"+sum);
	}
}