package interfaceDefault;

public class ClassImplementInterface implements InterfaceHasDefaultMethod{
	
	public void print() {
		System.out.println("재정의한 print 메소드");
	}

//  재정의 가능 
//	public void defaultPrint() {
//		System.out.println("재정의한 deafultPrint 메소드");
//	}

}
