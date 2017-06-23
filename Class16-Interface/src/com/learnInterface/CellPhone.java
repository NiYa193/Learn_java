package com.learnInterface;

public class CellPhone extends Telephone implements IPlayGame{

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("智能手机有打电话的功能");
	}

	@Override
	public void message() {
		// TODO Auto-generated method stub
		System.out.println("智能手机有发短信的功能");
	}

	@Override
	public void playGame() {
		// TODO Auto-generated method stub
		System.out.println("智能手机有玩游戏的功能");
	}

}
