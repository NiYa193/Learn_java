package hello;

public class FlowControl{
	public static void main(String[]args){
		System.out.println("双重循环实现打印三角形");
		for(int i = 0; i < 3; i++){
			for(int j = 0; j <= i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}