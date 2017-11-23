package patterntest.factorypattern.factorypattern;

import patterntest.factorypattern.product.FatherProduct1;

/*
 * 生产特效美白牙膏的分厂(后边抽象工厂的时候，myproduct3改了父类)
 */
public class MyFactory3 implements MyFactory {

	// @Override
	// public FatherProduct1 getProduct() {
	// return new MyProduct3();
	// }
	@Override
	public FatherProduct1 getProduct() {
		// return new MyProduct3();
		return null;
	}
}
