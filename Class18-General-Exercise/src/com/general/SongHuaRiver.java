package com.general;

public class SongHuaRiver extends Car {
//松花江：载重4吨，价格400元/天
	public void property(){	
		Initial.sumMoney += 400;
		Initial.sumGoods += 4;
		Initial.sumMen += 0;
		Initial.sumLoadGoods += "松花江    ";
		Initial.sumLoadMen += "";
	}
}
