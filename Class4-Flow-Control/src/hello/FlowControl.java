package hello;

public class FlowControl{
	public static void main(String[] args) {
		//�����ά�ַ�����
		String[][] names = {{"tom", "jack", "mike"}, {"zhangsan", "lisi", "wanger"}};
		//����˫��ѭ��������������
		for(int i = 0; i < names.length; i++){
			for(int j = 0; j < names[i].length; j++){
				System.out.println(names[i][j]);
			}
			System.out.println();
		}
	}
}