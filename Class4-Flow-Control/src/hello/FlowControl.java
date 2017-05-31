package hello;

public class FlowControl{
	public static void main(String[] args) {
		//定义二维字符数组
		String[][] names = {{"tom", "jack", "mike"}, {"zhangsan", "lisi", "wanger"}};
		//采用双重循环对数组进行输出
		for(int i = 0; i < names.length; i++){
			for(int j = 0; j < names[i].length; j++){
				System.out.println(names[i][j]);
			}
			System.out.println();
		}
	}
}