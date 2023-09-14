package day09;

public class PolyTest {
	public static void main(String[] args) {
		printObjInfo(new Object());
		printObjInfo("가나다");
		printObjInfo(new String("abc"));
		printObjInfo(new java.util.Date());
		printObjInfo(new java.io.File("c:\\"));
		printObjInfo(new int[10]);
		printObjInfo(new double[5]);
		printObjInfo(Integer.valueOf(100));
	}
	static void printObjInfo(Object o)
	{
		System.out.println("전달된 객체의 클래스명(타입) : "
				             + o.getClass().getName());
	}
}
