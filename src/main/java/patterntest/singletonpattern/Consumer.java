package patterntest.singletonpattern;

/**
 * 单例模式测试
 * 
 * @author tzx
 * @date 2017年11月23日
 */
public class Consumer {
	public static void main(String[] args) {
		for (int i = 0; i < 20000; i++) {
		Thread thread1 = new Thread(new MyRunnable());
		thread1.start();
		}
		Thread thread2 = new Thread(new MyRunnable());
		thread2.start();
	}

}

class MyRunnable implements Runnable {
	public void run() {
		SingletonPattern2 singletonPattern2 = SingletonPattern2.getInstance();
		System.out.println(singletonPattern2 + ":" + singletonPattern2.hashCode());

		// SingletonPattern1 singletonPattern1 =
		// SingletonPattern1.getInstance();
		// System.out.println(singletonPattern1 + ":" +
		// singletonPattern1.hashCode());

	}
}



