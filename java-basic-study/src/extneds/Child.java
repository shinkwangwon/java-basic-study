package extneds;

public class Child extends Parent{
	protected static String staticName = "childClass";
	

	// @Override 어노테이션을 사용하면 에러라고 나타남 => 재정의할때는 Override 어노테이션을 습관화 하자!
	// 재정의가 아닌 Child에만 있는 메소드로 만들어짐
	protected static void print() {
		System.out.println("Child Static Print");
	}
	
//	Override 불가능 : Cannot override the final method from Parent
//	protected final void finalPrint() {
//		System.out.println("Child Final Method Call");
//	}
}
