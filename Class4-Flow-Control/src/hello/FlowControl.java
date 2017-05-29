package hello;

public class FlowControl{
	public static void main(String[] args){
		int num = 2;
		int sum = 0;
		do{
			sum += num;
			num += 2;
		}while(num <= 50);
		System.out.println("The sum is:"+sum);
	}
}