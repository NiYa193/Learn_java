package hello;
import java.util.Arrays;

public class idea{
	public static void main(String[] args) {
		int[] stuScores = {79, 52, 98, 81};
		idea fcc = new idea();
		int stuNum = fcc.sortArray(stuScores);
		System.out.println("共有"+stuNum+"个成绩信息！");
	}
	
	public int sortArray(int scores[]){
		Arrays.sort(scores);
		System.out.println(Arrays.toString(scores));
		return scores.length;
	}
}