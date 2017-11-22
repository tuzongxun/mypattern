package patterntest.absfactorypattern;

import patterntest.product.FatherProduct1;
import patterntest.product.FatherProduct2;
import patterntest.product.MyProduct2;
import patterntest.product.MyProduct4;

public class MyFactory2 implements MyAbsFactory {

	/**
	 * 儿童牙膏
	 */
	@Override
	public FatherProduct1 getProGroup1() {
		return new MyProduct2();
	}

	/**
	 * 儿童牙刷
	 */
	@Override
	public FatherProduct2 getProGroup2() {
		return new MyProduct4();
	}

}
