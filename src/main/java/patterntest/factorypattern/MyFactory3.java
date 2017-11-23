package patterntest.factorypattern;

import patterntest.factorypattern.product.FatherProduct1;
import patterntest.factorypattern.product.MyProduct3;

/*
 * 生产特效美白牙膏的分厂
 */
public class MyFactory3 implements MyFactory {

	@Override
	public FatherProduct1 getProduct() {
		return new MyProduct3();
	}

}
