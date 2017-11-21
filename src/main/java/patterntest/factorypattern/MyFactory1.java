package patterntest.factorypattern;

import patterntest.product.MyProduct;
import patterntest.product.MyProduct1;

/**
 * 生产普通牙膏的分厂
 * 
 * @author tzx
 *
 */
public class MyFactory1 implements MyFactory {

	@Override
	public MyProduct getProduct() {
		return new MyProduct1();

	}

}
