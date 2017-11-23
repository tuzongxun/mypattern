package patterntest.factorypattern;

import patterntest.factorypattern.product.FatherProduct1;
import patterntest.factorypattern.product.MyProduct2;

/**
 * 生产儿童牙膏的分厂
 * 
 * @author tzx
 *
 */
public class MyFactory2 implements MyFactory {

	@Override
	public FatherProduct1 getProduct() {
		return new MyProduct2();
	}

}
