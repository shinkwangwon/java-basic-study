package callByValue;


class Person {
	public String name;
	
	public Person(String name) {
		this.name = name;
	}
}

public class Main {
	
	/**
	 * 자바는 CallByValue 방식으로 동작 한다 !! 
	 * CallByReference로 착각하지 말자!!
	 */

	public static void main(String[] args) {
		Person p1 = new Person("shin");
		Person p2 = new Person("kwang");
		
		System.out.println(p1.name + " : " + p2.name);
		likeCallByReferenceSwap1(p1, p2);
		System.out.println("call likeCallByReferenceSwap1");
		System.out.println(p1.name + " : " + p2.name);
		
		likeCallByReferenceSwap2(p1, p2);
		System.out.println("call likeCallByReferenceSwap2");
		System.out.println(p1.name + " : " + p2.name);
	}

	
	// 주소값을 넘겨주므로 swap이 일어날 것 같지만 일어나지 않음. 즉, 자바는 callByReference를 지원하지 않음  
	// 주소값을 "복사"받아서 p1, p2 매개변수로 들어오지만 p1, p2는 지역변수이기 때문에 메소드가 끝나면 복사받은 지역변수는 사라짐 
	public static void likeCallByReferenceSwap1(Person p1, Person p2) {
		Person temp = p1;
		p1 = p2;
		p2 = temp;
	}

	// 참조하고 있는 객체의 값을 직접적으로 바꿔주면 swap이 일어나지만, 실질적으로 callByReference가 일어나고 있는 것은 아님
	// 주소값을 "복사"받아서 p1, p2 매개변수로 들어오지만 해당 주소에 담겨 있는 "값"을 바꿔버리므로 swap이 일어난 것처럼 보임
	// "복사"받았다고 한들 주소가 같으므로 같은 공간을 바라보게 되고 그 공간의 변수값을 바꿔버리면 해당 주소에는 바뀐 값이 저장되어 있음. 
	// likeCallByReferenceSwap1 에서는 복사받은 주소안의 값에 실질적으로 접근하지 않기에 복사본끼리 swap하고 메소드가 끝나면 사라짐
	public static void likeCallByReferenceSwap2(Person p1, Person p2) {
		String temp = p1.name;
		p1.name = p2.name;
		p2.name = temp;
	}
}
