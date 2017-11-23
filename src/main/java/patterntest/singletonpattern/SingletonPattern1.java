package patterntest.singletonpattern;

/**
 * 单例模式——饿汉式
 * 
 * @author tzx
 * @date 2017年11月23日
 */
public class SingletonPattern1 {
	private static SingletonPattern1 singletonPattern1 = new SingletonPattern1();

	private SingletonPattern1() {

	}

	public static SingletonPattern1 getInstance() {
		return singletonPattern1;
	}
}
