package patterntest.factorypattern;

import patterntest.factorypattern.product.FatherProduct1;
import patterntest.factorypattern.product.MyProduct1;

/**
 * 生产普通牙膏的分厂
 * 
 * @author tzx
 *
 */
public class MyFactory1 implements MyFactory {

	@Override
	public FatherProduct1 getProduct() {
		return new MyProduct1();

	}

}
