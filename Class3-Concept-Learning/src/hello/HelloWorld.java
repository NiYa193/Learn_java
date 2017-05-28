package hello;

public class HelloWorld{
    public static void main(String[] args) {
	    int one = 10 ;
        int two = 20 ;
        int three = 0 ;
        three = one + two;
        System.out.println("three = one + two ==> "+three);
        three += one;
        System.out.println("three += one ==>"+three);
        three -= one;
        System.out.println("three -= one ==>"+three);
        three *= one;
        System.out.println("three *= one ==>"+three);
        three /= one;
        System.out.println("three /= one ==>"+three);
        three %= one;
        System.out.println("three %= one ==>"+three);
	}
}