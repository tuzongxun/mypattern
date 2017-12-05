package patterntest.observerpattern.observer;

/**
 * 观察者：网站接口
 * 
 * @author tzx
 * @date 2017年12月5日
 */
public interface WebSite {
	/**
	 * 根据观察到的信息采取行动
	 */
	public void update();
}
