package patterntest.factorypattern.absfactorypattern;

import patterntest.factorypattern.product.FatherProduct1;
import patterntest.factorypattern.product.FatherProduct2;
import patterntest.factorypattern.product.MyProduct1;
import patterntest.factorypattern.product.MyProduct3;

public class MyFactory1 implements MyAbsFactory {
	/**
	 * 普通牙膏
	 */
	@Override
	public FatherProduct1 getProGroup1() {
		return new MyProduct1();
	}

	/**
	 * 普通牙刷
	 */
	@Override
	public FatherProduct2 getProGroup2() {
		return new MyProduct3();
	}

}
