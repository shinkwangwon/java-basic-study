package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;



public class StreamMain {
	public static void main(String[] args) {
		Person p1 = new Person("shin", 29, "SILVER");
		Person p2 = new Person("park", 30, "SILVER");
		Person p3 = new Person("kim", 31, "GOLD");
		Person p4 = new Person("lee", 31, "VIP");
		
		List<Person> personList = Arrays.asList(p1,p2,p3,p4);
		
		
		basicStream(personList, "SILVER");
		closureStream(personList, "GOLD");
	}
	
	public static void basicStream(List<Person> personList, String grade) {
		// 등급이 SILVER인 사람의 이름만 추출해내기
		List<String> silverPersonNameList = personList.stream()
				.filter(p -> p.getGrade().equals(grade))
				.map(Person::getName)
				.collect(Collectors.toList());
		
		System.out.println(silverPersonNameList);	
		// 결과 : [shin, park]
	}
	
	public static void closureStream(List<Person> personList, String grade) {
		
		// grade = "VIP"; // 2.컴파일에러
		List<String> silverPersonNameList = personList.stream()
		.filter(p -> {
			// grade = "VIP"; // 1. 컴파일 에러
			return p.getGrade().equals(grade);	// 2. 컴파일에러
		})
		.map(Person::getName)
		.collect(Collectors.toList());
		
		System.out.println(silverPersonNameList);
	}
}
