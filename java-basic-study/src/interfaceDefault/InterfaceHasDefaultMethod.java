package interfaceDefault;

public interface InterfaceHasDefaultMethod {
	public void print();
	
	// java8 에서 나온 interface의 default 메소드
	
	
	// default 키워드로 메소드 구현까지 가능
	// 구현클래스에서 재정의 가능 
	public default void defaultPrint() {
		System.out.println("Interface의 default 메소드");
	}
	
	// static메소드 구현 가능 
	// 구현클래스에서 재정의가 불가능 하다
	public static void staticPrint() {
		System.out.println("Interface의 static 메소드");
	}
}
