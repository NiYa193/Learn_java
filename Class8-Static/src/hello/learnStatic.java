package hello;

public class learnStatic{
	//����һ���Ǿ�̬������һ����̬����
	int score1 = 97;
	static int score2 = 93;
	
	public static int sum(){
		//�Ǿ�̬����ֻ��ͨ��������ܷ��ʣ���̬��������ֱ�ӷ���
		learnStatic fcc = new learnStatic();
		int sumScore = fcc.score1 + score2;
		return sumScore;
	}
	
	public static void main(String[] args) {
		int allScore = sum();
		System.out.println("�ܳɼ�Ϊ��"+allScore);
	}
}