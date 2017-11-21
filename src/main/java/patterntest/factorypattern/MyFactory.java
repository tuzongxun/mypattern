package patterntest.factorypattern;

import patterntest.product.MyProduct;

public interface MyFactory {
	/**
	 * 外部获取产品的工厂方法,父类工厂接口
	 */
	public MyProduct getProduct();
}
