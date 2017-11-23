package patterntest.singletonpattern;

/**
 * 单例模式——懒汉式
 * 
 * @author tzx
 * @date 2017年11月23日
 */
public class SingletonPattern2 {

	private volatile static SingletonPattern2 singletonPattern2;

	private SingletonPattern2() {

	}

	// public synchronized static SingletonPattern2 getInstance() {
	public static SingletonPattern2 getInstance() {
		// if (singletonPattern2 == null) {
		// try {
		// Thread.yield();
		// } catch (Exception e) {
		// e.printStackTrace();
		// }
		// singletonPattern2 = new SingletonPattern2();
		// }
		if (singletonPattern2 == null) {
			try {
				Thread.yield();
			} catch (Exception e) {
				e.printStackTrace();
			}
			synchronized (SingletonPattern2.class) {
				if (singletonPattern2 == null) {
				singletonPattern2 = new SingletonPattern2();
				}
			}

		}
		return singletonPattern2;
	}
}
