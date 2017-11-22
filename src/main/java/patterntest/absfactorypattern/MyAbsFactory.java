package patterntest.absfactorypattern;

import patterntest.product.FatherProduct1;
import patterntest.product.FatherProduct2;

/**
 * 产品族的抽象工厂
 * 
 * @author tzx
 *
 */
public interface MyAbsFactory {
	/**
	 * 获取牙膏
	 * 
	 * @return
	 */
	public FatherProduct1 getProGroup1();

	/**
	 * 获取牙刷
	 * 
	 * @return
	 */
	public FatherProduct2 getProGroup2();
}
