package com.general;

public class GoldDragon extends Car {
//金龙：载人20人，价格800元/天
	public void property(){	
		Initial.sumMoney += 800;
		Initial.sumGoods += 0;
		Initial.sumMen += 20;
		Initial.sumLoadGoods += "";
		Initial.sumLoadMen += "金龙    ";
	}
}
