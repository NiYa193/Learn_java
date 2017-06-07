package packaging.classcontrol;
import packaging.classcontrol.second.Telephone;
//import packaging.classcontrol.Telephone;//执行第一个构造
//import packaging.classcontrol.second.Telephone;//执行第二个构造

//根据导入的包不同，可以决定使用类中的哪个构造方法
//这也就是包的管理功能

public class InitailTelephone {
	public static void main(String[] args) {
		Telephone fcc = new Telephone();
	}
}
