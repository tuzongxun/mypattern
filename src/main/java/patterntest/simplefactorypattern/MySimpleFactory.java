package patterntest.simplefactorypattern;

import patterntest.product.MyProduct;
import patterntest.product.MyProduct1;
import patterntest.product.MyProduct2;

/**
 * 简单工厂模式
 * 
 * @author tzx
 *
 */
public class MySimpleFactory {

	/**
	 * 外部获取产品的工厂方法
	 */
	public static MyProduct getProduct(int type) {
		MyProduct product = null;
		if (0 == type) {
			// 普通牙膏
			product = new MyProduct1();
		} else if (1 == type) {
			// 儿童牙膏
			product = new MyProduct2();
		} else if (2 == type) {
			// 特效美白牙膏
		} else if (3 == type) {
			// 超级环保牙膏
		} else if (4 == type) {
			// 儿童牙刷
		} else if (5 == type) {
			// 成年人牙刷
		} else if (6 == type) {
			// 普通刷牙杯
		} else if (7 == type) {
			// 创意刷牙杯
		}
		return product;
	}
}
