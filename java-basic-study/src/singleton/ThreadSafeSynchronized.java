package singleton;

public class ThreadSafeSynchronized {
	private static ThreadSafeSynchronized instance;
	
	// new 로 생성하지 못하도록 생성자는 private로 생성 
	private ThreadSafeSynchronized() {}
	
	// Double Check Locking
	public static ThreadSafeSynchronized getInstance() {
		if(instance == null) {
			// synchronized 블록을 if안에 둬서 매번 getInstance 호출할때마다 Lock이 걸리지 않도록 함
			// synchronized(this) 불가능 : static메소드에서는 this사용 불가 -> static메소드는 객체 생성전에 로딩되기 때문에 this가 가리키고 있는게 없을 수 있음
			synchronized(ThreadSafeSynchronized.class) {
				if(instance == null) {
					instance = new ThreadSafeSynchronized();	
				}
			}
		}
		return instance;
	}

}
