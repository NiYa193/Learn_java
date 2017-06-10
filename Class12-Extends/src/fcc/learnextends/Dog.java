package fcc.learnextends;

public class Dog{
	public int age = 12;
	//对toString的重写
	//Eclipse中还会添加一句：@Override
	//不过删除没有影响
	public String toString() {
		return "Dog [age=" + age + "]";
	}
}