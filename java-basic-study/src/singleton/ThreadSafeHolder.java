package singleton;

public class ThreadSafeHolder {
	// new 로 생성하지 못하도록 생성자는 private로 생성 
	private ThreadSafeHolder() {
	}

	// 클래스안에 클래스를 두고, JVM의 Class Loader 메커니즘과 Class가 로드되는 시점을 이용한 방법
	private static class LazyHolder {
		// Holder가 static이기 때문에 클래스 로딩시점에 한번만 호출되고, final이기 때문에 변경이 불가능하게 만듬
		private static final ThreadSafeHolder holder = new ThreadSafeHolder();
	}
	
	public static ThreadSafeHolder getInstance() {
		return LazyHolder.holder;
	}
	
}
