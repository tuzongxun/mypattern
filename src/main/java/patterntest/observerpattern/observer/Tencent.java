package patterntest.observerpattern.observer;

public class Tencent implements WebSite {

	@Override
	public void update() {
		System.out.println("腾讯天气更新");
	}

}
