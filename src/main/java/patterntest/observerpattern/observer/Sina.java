package patterntest.observerpattern.observer;

public class Sina implements WebSite {

	@Override
	public void update() {
		System.out.println("新浪天气更新");
	}

}
