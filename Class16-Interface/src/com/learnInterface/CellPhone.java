package com.learnInterface;

public class CellPhone extends Telephone implements IPlayGame{

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("�����ֻ��д�绰�Ĺ���");
	}

	@Override
	public void message() {
		// TODO Auto-generated method stub
		System.out.println("�����ֻ��з����ŵĹ���");
	}

	@Override
	public void playGame() {
		// TODO Auto-generated method stub
		System.out.println("�����ֻ�������Ϸ�Ĺ���");
	}

}
