package com.general;

public class Iveco extends Car {
//依维柯：载重20吨，价格1000元/天
	public void property(){	
		Initial.sumMoney += 1000;
		Initial.sumGoods += 20;
		Initial.sumMen += 0;
		Initial.sumLoadGoods += "依维柯    ";
		Initial.sumLoadMen += "";
	}
}
