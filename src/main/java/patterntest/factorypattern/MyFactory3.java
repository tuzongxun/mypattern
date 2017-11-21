package patterntest.factorypattern;

import patterntest.product.MyProduct;
import patterntest.product.MyProduct3;

/*
 * 生产特效美白牙膏的分厂
 */
public class MyFactory3 implements MyFactory {

	@Override
	public MyProduct getProduct() {
		return new MyProduct3();
	}

}
