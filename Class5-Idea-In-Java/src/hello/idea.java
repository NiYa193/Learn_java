package hello;
import java.util.Arrays;

public class idea{
	public static void main(String[] args) {
		//定义fcc对象
		idea fcc = new idea();
		//定义value数组，接收返回值
		int[] value = fcc.getRandomSort(8);
		//打印toString后的字符串
		System.out.println(Arrays.toString(value));
	}
	
	public int[] getRandomSort(int arrayLength){
		//定义一个arrayLength长度的数组
		int[] randomValue = new int[arrayLength];
		//循环对数组进行随机赋值
		for(int i = 0; i < arrayLength; i++){
			randomValue[i] =(int)(Math.random()*100);
		}
		//对数组进行排序
		Arrays.sort(randomValue);
		//返回排序好的数组
		return randomValue;
	}
}