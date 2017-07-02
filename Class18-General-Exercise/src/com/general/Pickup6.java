package com.general;

public class Pickup6 extends Car {
//皮卡雪6：载重2吨，载人4人，价格450元/天
	public void property(){	
		Initial.sumMoney += 450;
		Initial.sumGoods += 2;
		Initial.sumMen += 4;
		Initial.sumLoadGoods += "皮卡雪6    ";
		Initial.sumLoadMen += "皮卡雪6    ";
	}
}
