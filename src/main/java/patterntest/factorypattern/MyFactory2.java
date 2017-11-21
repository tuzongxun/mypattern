package patterntest.factorypattern;

import patterntest.product.MyProduct;
import patterntest.product.MyProduct2;

/**
 * 生产儿童牙膏的分厂
 * 
 * @author tzx
 *
 */
public class MyFactory2 implements MyFactory {

	@Override
	public MyProduct getProduct() {
		return new MyProduct2();
	}

}
