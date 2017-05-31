package hello;
import java.util.Arrays;
public class sortScore {
	public static void main(String[] args) {
		int[] scores = {89, -23, 64, 91, 119, 52, 73};
		sortScore fcc = new sortScore();
		System.out.println("考试成绩的前三名为：");
		fcc.sort(scores);
	}
	
	public void sort(int[] scores){
		Arrays.sort(scores);
		int j = 1;
		for(int i = (scores.length - 1); i >= 0; i--){
			if((scores[i] >= 0) && (scores[i] <= 100)){
				j++;
				System.out.println(scores[i]);
			}
			if(j > 3){
				break;
			}
		}
	}
}
