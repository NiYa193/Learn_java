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
		//�������
		int rentFlag;//�ж��Ƿ��⳵����
		int carAccount;//�⳵��������
		int[] carNumber;//���峵���������
		int carAccountCache = 0;//���峵��������ʱ����
		int rentDay;//�����⳵����
		Scanner in = new Scanner(System.in);//�����������
		
		while(true){
			//�ʺ���
			System.out.println("��ӭʹ�ô���⳵ϵͳ��");
			System.out.println("���Ƿ�Ҫ�⳵��1����     2����");
			//�Ƿ��⳵�ж�
			rentFlag = in.nextInt();
			if(rentFlag == 2){
				System.out.println("��л����ʹ�ã���ӭ�ٴι��٣�");
				//System.exit(0);
				continue;
			}
			//��ʾ��Ŀ��
			System.out.println("�����⳵�����ͼ����Ŀ��");
			System.out.println("���   ��������         ���          ����");
			System.out.println("1.  �µ�A4 500Ԫ/��    ���ˣ�4��");
			System.out.println("2.  ���Դ�6 400Ԫ/��    ���ˣ�4��");
			System.out.println("3.  Ƥ��ѩ6 450Ԫ/��    ���ˣ�4��  �ػ���2��");
			System.out.println("4.  ����          800Ԫ/��    ���ˣ�20��");
			System.out.println("5.  �ɻ���      400Ԫ/��    �ػ���4��");
			System.out.println("6.  ��Ψ��   1000Ԫ/��    �ػ���20��");
			
			//�⳵����������
			System.out.println("��������Ҫ�⳵��������");
			carAccount = in.nextInt();
			//�⳵���������������
			carNumber = new int[carAccount];
			
			for(; carAccountCache < carAccount; carAccountCache++){
				System.out.println("�������"+(carAccountCache+1)+"��������ţ�");
				carNumber[carAccountCache] = in.nextInt();
			}
			
			//�⳵����������
			System.out.println("�������⳵������");
			rentDay = in.nextInt();
			
			//�������
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
			
			//�˵����
			System.out.println("�����˵���");
			System.out.println("***���˵ĳ��У�");
			System.out.println(sumLoadMen+"�����ˣ�"+sumMen+"��");
			System.out.println("***�ػ��ĳ��У�");
			System.out.println(sumLoadGoods+"���ػ�"+sumGoods+"��");
			System.out.println("***�⳵ʱ�䣺"+rentDay+"��    �⳵���ܼ۸�"+sumMoney*rentDay);
		}	
	}

}
