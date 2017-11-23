package patterntest.factorypattern.product;

/**
 * 儿童牙膏
 * 
 * @author tzx
 *
 */
public class MyProduct2 extends FatherProduct1 {
	public MyProduct2() {
		addIngredient();
		delead();
	}

	/**
	 * 去铅
	 */
	public void delead() {

	}
}
