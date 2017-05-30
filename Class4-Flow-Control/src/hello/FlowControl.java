package hello;

public class FlowControl{
	public static void main(String[] args){
		int num = 999;
		int count = 0;
		for(; num != 0; num /= 10){
			count++;
		}
		System.out.println("它是个"+count+"位的数");
	}
}