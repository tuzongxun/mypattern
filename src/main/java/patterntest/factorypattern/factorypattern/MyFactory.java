package patterntest.factorypattern.factorypattern;

import patterntest.factorypattern.product.FatherProduct1;

/**
 * 工厂方法模式
 * 
 * @author tzx
 *
 */
public interface MyFactory {
	/**
	 * 外部获取产品的工厂方法,父类工厂接口
	 */
	public FatherProduct1 getProduct();
}
