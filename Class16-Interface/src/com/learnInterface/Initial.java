package com.learnInterface;

public class Initial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telephone cell = new CellPhone();
		cell.call();
		cell.message();
		//�ӿڵ�ʹ�÷���
		IPlayGame IP1 = new CellPhone();
		IP1.playGame();
		IPlayGame IP2 = new Psp();
		IP2.playGame();
		
		//�����ڲ����ʹ�÷���
		IPlayGame IP3 = new IPlayGame(){
			@Override
			public void playGame() {
				// TODO Auto-generated method stub
				System.out.println("�����ڲ���ʵ�ֽӿ�һ");
			}
		};//�˴��зֺ�
		IP3.playGame();

		//������ֱ���½�һ�������ڲ�������
		new IPlayGame(){
			@Override
			public void playGame() {
				// TODO Auto-generated method stub
				System.out.println("�����ڲ���ʵ�ֽӿڶ�");
			}
		}.playGame();//���������е���
	}
}
