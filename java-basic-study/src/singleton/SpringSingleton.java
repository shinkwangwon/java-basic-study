package singleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SpringSingleton {
	
	/**
	 * 스프링에서의 싱글톤을 겉핥기 식으로 해봤다
	 * 스프링에서는 일반적인 싱글톤 패턴을 사용하지 않는다
	 * 일반적인 싱글톤 패턴은 생성자가 private이기 때문에 자바의 장점인 상속, 다형성이 불가능하다
	 * 또 생성자가 private여서 테스트케이스를 만들때 mock 객체를 주입하거나 new로 객체를 만들 수 없기 때문에 테스트가 힘들다는 단점이 있다
	 * 그래서 스프링에서는 싱글톤 레지스트리라는 걸 두고 아래와 같은 형식으로 싱글톤을 구현한다
	 * 
	 *  완벽히 재현한게 아니다. 좀더 공부하면서 봐야한다. ConcurrentHashMap을 쓰는 정도만 파악했다
	 */
	
	
	private final Map<String, Object> singletonOjbects = new ConcurrentHashMap<String, Object>(256);
	
	private static final Object NULL_OBJECT = new Object();
	
	public void registerSingleton(String beanName, Object singletonOjbect) {
		synchronized(this.singletonOjbects) {
			Object oldObject = this.singletonOjbects.get(beanName);
			if(oldObject != null) {
				System.out.println("Error : BeanName Already object :: " + beanName);
			} else {
				addSingleton(beanName, singletonOjbect);	
			}
		}
	}
	
	public void addSingleton(String beanName, Object singletonOjbect) {
		synchronized(this.singletonOjbects) {
			this.singletonOjbects.put(beanName, (singletonOjbect != null ? singletonOjbect : beanName));
		}
	}
	
	public Object getSingleton(String beanName) {
		Object obj = this.singletonOjbects.get(beanName);
		if(obj == null) {
			// 조회하면 넣어야하나 ?
		}
		return obj != NULL_OBJECT ? obj : null;
	}

}
