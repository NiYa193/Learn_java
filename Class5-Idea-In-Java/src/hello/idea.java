package hello;

public class idea{
	//定义一个查找最大年龄的方法
	public int findMaxAge(){
		//定义年龄数组
		int[] ages = {18, 23, 21, 19, 25, 29 ,17};
		//假定最大年龄为数组第一个元素
		int max = ages[0];
		//遍历查找元素，并与max相比，查找出最大找元素
		for(int i = 0; i < ages.length; i++){
			if(ages[i] > max){
				max = ages[i];
			}
		}
		//返回最大年龄
		return max;
	}
	
	public static void main(String[] args) {
		int maxScore;
		//新建一个fcc对象
		idea fcc = new idea();
		//调用fcc对象的findMaxAge方法
		maxScore = fcc.findMaxAge();
		//输出年龄
		System.out.println("最大年龄为："+maxScore+"岁");
	}
}