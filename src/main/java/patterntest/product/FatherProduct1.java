package patterntest.product;

/**
 * 牙膏类产品父类
 * 
 * @author tzx
 *
 */
public abstract class FatherProduct1 {
	/**
	 * 产品名称
	 */
	protected String productName;
	/**
	 * 产品规格
	 */
	protected String productSize;

	/**
	 * 添加必要成分
	 */
	public void addIngredient() {

	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductSize() {
		return productSize;
	}

	public void setProductSize(String productSize) {
		this.productSize = productSize;
	}

	@Override
	public String toString() {
		return "MyProduct [productName=" + productName + ", productSize=" + productSize + "]";
	}

}
