package imooc.transport;

public class Initial {
	public static void main(String[] args) {
		TheWhole bus = new Bus();
		TheWhole ship = new Ship();
		TheWhole bike = new Bike();
		TheWhole plane = new Plane();
		TheWhole subway = new Subway();
		
		bus.transport("陆地", 40);
		ship.transport("海上", 1000);
		bike.transport("陆地", 2);
		plane.transport("天空", 200);
		subway.transport("地下",2000);
	}
}