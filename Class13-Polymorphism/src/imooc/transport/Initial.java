package imooc.transport;

public class Initial {
	public static void main(String[] args) {
		TheWhole bus = new Bus();
		TheWhole ship = new Ship();
		TheWhole bike = new Bike();
		TheWhole plane = new Plane();
		TheWhole subway = new Subway();
		
		bus.transport("½��", 40);
		ship.transport("����", 1000);
		bike.transport("½��", 2);
		plane.transport("���", 200);
		subway.transport("����",2000);
	}
}