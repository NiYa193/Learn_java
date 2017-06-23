package com.learnInterface;

public class Initial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telephone cell = new CellPhone();
		cell.call();
		cell.message();
		//接口的使用方法
		IPlayGame IP1 = new CellPhone();
		IP1.playGame();
		IPlayGame IP2 = new Psp();
		IP2.playGame();
		
		//匿名内部类的使用方法
		IPlayGame IP3 = new IPlayGame(){
			@Override
			public void playGame() {
				// TODO Auto-generated method stub
				System.out.println("匿名内部类实现接口一");
			}
		};//此处有分号
		IP3.playGame();

		//还可以直接新建一个匿名内部类如下
		new IPlayGame(){
			@Override
			public void playGame() {
				// TODO Auto-generated method stub
				System.out.println("匿名内部类实现接口二");
			}
		}.playGame();//并在最后进行调用
	}
}
