package hello;

public class learnStatic{
	//建立一个非静态变量，一个静态变量
	int score1 = 97;
	static int score2 = 93;
	
	public static int sum(){
		//非静态变量只能通过对象才能访问，静态变量可以直接访问
		learnStatic fcc = new learnStatic();
		int sumScore = fcc.score1 + score2;
		return sumScore;
	}
	
	public static void main(String[] args) {
		int allScore = sum();
		System.out.println("总成绩为："+allScore);
	}
}