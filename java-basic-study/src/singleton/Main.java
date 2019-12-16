package singleton;

public class Main {
	
	

	public static void main(String[] args) {
		ThreadSafeHolder holder1 = ThreadSafeHolder.getInstance();	
		ThreadSafeHolder holder2 = ThreadSafeHolder.getInstance();
		
		System.out.println(holder1);
		System.out.println(holder2);
		System.out.println(holder1 == holder2);
		System.out.println();
		
		ThreadSafeSynchronized threadSafeLazy1 = ThreadSafeSynchronized.getInstance();
		ThreadSafeSynchronized threadSafeLazy2 = ThreadSafeSynchronized.getInstance();
		
		System.out.println(threadSafeLazy1);
		System.out.println(threadSafeLazy2);
		System.out.println(threadSafeLazy1 == threadSafeLazy2);
		System.out.println();
		

		SpringSingleton springSingleton = new SpringSingleton();
		springSingleton.registerSingleton("testBean", new Object());
		springSingleton.registerSingleton("testBean", new Object());
		
		Object obj1 = springSingleton.getSingleton("testBean");
		Object obj2 = springSingleton.getSingleton("testBean");
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj1 == obj2);
		System.out.println();
	}

}
