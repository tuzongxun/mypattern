package patterntest.factorypattern.consumer;

import patterntest.factorypattern.MyFactory;
import patterntest.factorypattern.MyFactory1;
import patterntest.factorypattern.MyFactory2;
import patterntest.factorypattern.MyFactory3;

/**
 * 消费者
 * 
 * @author tzx
 *
 */
public class Consumer {

	public static void main(String[] args) {
		// System.out.println("我需要一个产品，于是我向工厂买了一个");
		// MyProduct product = MySimpleFactory.getProduct(0);
		// System.out.println("我买的产品是这样的：" + product.getProductSize());
		MyFactory factory = null;
		// 我需要普通牙膏
		factory = new MyFactory1();
		factory.getProduct();
		System.out.println(factory.getProduct().getClass());
		// 我需要儿童牙膏
		factory = new MyFactory2();
		factory.getProduct();
		System.out.println(factory.getProduct().getClass());
		// 我需要特效美白牙膏
		factory = new MyFactory3();
		factory.getProduct();
		System.out.println(factory.getProduct().getClass());
	}

}
