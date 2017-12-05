package patterntest.observerpattern.subject;

import java.util.ArrayList;
import java.util.List;

import patterntest.observerpattern.observer.WebSite;

/**
 * 气象台接口
 * 
 * @author tzx
 * @date 2017年12月5日
 */
public interface MyObservatory {
	/*
	 * 存放观察者集合
	 */
	List<WebSite> weblist = new ArrayList<WebSite>();

	/**
	 * 增加新观察者
	 * 
	 * @param webSite
	 */
	public void addWebSite(WebSite webSite);

	/**
	 * 删除观察者
	 * 
	 * @param webSite
	 */
	public void removeWebSite(WebSite webSite);

	/**
	 * 发布天气信息
	 */
	public void pubMsg();

}
