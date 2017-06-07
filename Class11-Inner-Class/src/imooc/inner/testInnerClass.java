package imooc.inner;

public class testInnerClass {
	public class Inner{
		public void show(){
			System.out.println("Fcc loves dou");
		}
	}
	
	public static void main(String[] args) {
		testInnerClass dou = new testInnerClass();
		Inner fcc = dou.new Inner();	
		fcc.show();
	}
}