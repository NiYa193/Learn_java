package hello;

public class FlowControl{
	public static void main(String[]args){
		System.out.println("˫��ѭ��ʵ�ִ�ӡ������");
		for(int i = 0; i < 3; i++){
			for(int j = 0; j <= i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}