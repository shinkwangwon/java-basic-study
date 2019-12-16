package extneds;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Parent p1 = new Parent();
		Parent p2 = new Child();
		Child c = new Child();
		
		p1.print();	// Parent의 static 메소드 호출됨
		p2.print();	// Parent의 static 메소드 호출됨 ==> 즉, static 메소드는 상속되지 않음
		
		System.out.println(p1.staticName);	// parent 변수 사용됨
		System.out.println(p2.staticName);	// parent 변수 사용됨 ==> static 변수 또한 상속되지 않음
		
		c.finalPrint();	// final 메소드는 상속됨 
		
		List<Integer> l = Arrays.asList(1,2,3,4);
		System.out.println(l.toString());
		
		Integer[] l2 = new Integer[] {1,2,3};
		System.out.println(l2.toString());
		
		
		FinalClass finalClass = new FinalClass();
		finalClass.print();
	}
}
