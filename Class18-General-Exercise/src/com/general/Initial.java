package com.general;
import java.util.*;

public class Initial {
	public static int sumMoney = 0;
	public static int sumGoods = 0;
	public static int sumMen = 0;
	public static String sumLoadMen = "";
	public static String sumLoadGoods = "";
	
	public static void main(String[] args) {
		//sumLoadGoods = "hello";
		// TODO Auto-generated method stub
		//定义变量
		int rentFlag;//判断是否租车变量
		int carAccount;//租车数量变量
		int[] carNumber;//定义车辆序号数组
		int carAccountCache = 0;//定义车辆数量临时变量
		int rentDay;//定义租车天数
		Scanner in = new Scanner(System.in);//定义输入对象
		
		while(true){
			//问候语
			System.out.println("欢迎使用达达租车系统：");
			System.out.println("您是否要租车：1、是     2、否");
			//是否租车判断
			rentFlag = in.nextInt();
			if(rentFlag == 2){
				System.out.println("感谢您的使用，欢迎再次光临！");
				//System.exit(0);
				continue;
			}
			//显示价目表
			System.out.println("您可租车的类型及其价目表：");
			System.out.println("序号   汽车名称         租金          容量");
			System.out.println("1.  奥迪A4 500元/天    载人：4人");
			System.out.println("2.  马自达6 400元/天    载人：4人");
			System.out.println("3.  皮卡雪6 450元/天    载人：4人  载货：2吨");
			System.out.println("4.  金龙          800元/天    载人：20人");
			System.out.println("5.  松花江      400元/天    载货：4吨");
			System.out.println("6.  依唯柯   1000元/天    载货：20吨");
			
			//租车的数量输入
			System.out.println("请输入您要租车的数量：");
			carAccount = in.nextInt();
			//租车的序号输入至数组
			carNumber = new int[carAccount];
			
			for(; carAccountCache < carAccount; carAccountCache++){
				System.out.println("请输入第"+(carAccountCache+1)+"辆车的序号：");
				carNumber[carAccountCache] = in.nextInt();
			}
			
			//租车的天数输入
			System.out.println("请输入租车天数：");
			rentDay = in.nextInt();
			
			//计算过程
			for(carAccountCache = 0; carAccountCache < carAccount; carAccountCache++){
				switch(carNumber[carAccountCache]){
				case 1:
					AudiA4 audi = new AudiA4();
					audi.property();
					continue;
				case 2:
					Mazda6 mazd = new Mazda6();
					mazd.property();
					continue;
				case 3:
					Pickup6 pick = new Pickup6();
					pick.property();
					continue;
				case 4:
					GoldDragon gold = new GoldDragon();
					gold.property();
					continue;
				case 5:
					SongHuaRiver song = new SongHuaRiver();
					song.property();
					continue;
				case 6:
					Iveco iver = new Iveco();
					iver.property();
					continue;
				}
			}
			
			//账单输出
			System.out.println("您的账单：");
			System.out.println("***载人的车有：");
			System.out.println(sumLoadMen+"共载人："+sumMen+"人");
			System.out.println("***载货的车有：");
			System.out.println(sumLoadGoods+"共载货"+sumGoods+"吨");
			System.out.println("***租车时间："+rentDay+"天    租车的总价格："+sumMoney*rentDay);
		}	
	}

}
