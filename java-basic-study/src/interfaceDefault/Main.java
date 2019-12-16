package interfaceDefault;

public class Main {

	public static void main(String[] args) {
		InterfaceHasDefaultMethod.staticPrint();
		
		InterfaceHasDefaultMethod inf = new ClassImplementInterface();
		inf.defaultPrint();
		inf.print();

	}
}
