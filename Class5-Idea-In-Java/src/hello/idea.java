package hello;

public class idea{
	public static void main(String[] args){
		//����һ����Ϊstu�Ķ���
		idea stu = new idea();
		//����stu��calcAvg�����������շ���ֵ
		double stuScore = stu.calcAvg();
		System.out.println("ѧ���ĳɼ�ƽ�����ǣ�"+stuScore+"�֣�");
	}
	
	public double calcAvg(){
		double javaScore = 92;
		double phpScore = 97;
		double avg = (javaScore + phpScore) /2;
		//���ط�����������
		return avg;
	}
}