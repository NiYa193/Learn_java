package hello;

public class idea{
	public static void main(String[] args) {
		idea fcc = new idea();
		fcc.calcAvg(99, 96);
	}
	//���һ��û�з���ֵ�������в����ķ���
	public void calcAvg(double javaScore, double phpScore){
		double avg = (javaScore + phpScore) / 2;
		System.out.println("ƽ���֣�"+avg);
	}
}