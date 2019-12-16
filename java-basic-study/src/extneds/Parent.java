package extneds;

public class Parent {
	
	protected static String staticName = "parentClass";
	
	// static 메소드는 상속되지 않음 -> 똑같은 메소드를 자식에 생성하면 그것은 override가 아니라 그냥 자식 클래스에 새로 만든 메소드가 되는 것임
	protected static void print() {
		System.out.println("Parent Static Print");
	}
	
	// final 메소드 상속 됨 -> 하지만 override는 불가능함
	protected final void finalPrint() {
		System.out.println("Parent Final Method Call");
	}
}
