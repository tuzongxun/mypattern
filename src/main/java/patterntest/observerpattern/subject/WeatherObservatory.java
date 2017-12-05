package patterntest.observerpattern.subject;

import patterntest.observerpattern.observer.WebSite;

public class WeatherObservatory implements MyObservatory {

	@Override
	public void addWebSite(WebSite webSite) {
		weblist.add(webSite);

	}

	@Override
	public void removeWebSite(WebSite webSite) {
		weblist.remove(webSite);

	}

	@Override
	public void pubMsg() {
		for (WebSite webSite : weblist) {
			webSite.update();
		}

	}

}
