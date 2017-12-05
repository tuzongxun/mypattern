package patterntest.observerpattern;

import patterntest.observerpattern.observer.Sina;
import patterntest.observerpattern.observer.Tencent;
import patterntest.observerpattern.observer.WebSite;
import patterntest.observerpattern.subject.MyObservatory;
import patterntest.observerpattern.subject.WeatherObservatory;
import patterntest.observerpattern.subject.WindObservatory;

/**
 * 观察者模式测试
 * 
 * @author tzx
 * @date 2017年12月5日
 */
public class ObserverTest {

	public static void main(String[] args) {
		// 建立中央气象台
		MyObservatory observatory = new WeatherObservatory();
		// 创建新浪网
		WebSite sina = new Sina();
		// 新浪网开始观察中央气象台信息公告
		observatory.addWebSite(sina);
		// 创建腾讯网
		WebSite tencent = new Tencent();
		// 腾讯网开始观察中央气象台信息公告
		observatory.addWebSite(tencent);
		// 中央气象台发布新的天气信息
		int i = 0;
		do {
		observatory.pubMsg();
			i++;
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} while (i < 10);
		// 创建风向台
		MyObservatory observatory2 = new WindObservatory();
		// observatory2是MyObservatory的子类，而list是父类中创建的对象，因此这里不用再加入，相当于还是通过MyObservatory发布的信息
		// 风向台发布新的风向信息
		observatory2.pubMsg();
	}

}
