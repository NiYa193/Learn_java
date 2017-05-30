package hello;

public class FlowControl{
	public static void main(String[] args) {
		String[] hobbys = {"sports", "game", "doudou"};
		for(int i = 0; i < hobbys.length; i ++){
			System.out.println("数组中第"+(i+1)+"个元素的值是"+hobbys[i]);
		}
	}
}