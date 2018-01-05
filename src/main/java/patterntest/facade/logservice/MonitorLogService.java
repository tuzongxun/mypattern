package patterntest.facade.logservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 监控日志接口
 * 
 * @author tzx
 * @date 2018年1月4日
 */
public class MonitorLogService {
	private Logger sysLog = LoggerFactory.getLogger(this.getClass());

	public void error(String msg, Object... args) {
		String sys = "monitor";
		msg = "|" + msg + "|" + sys + "|";
		sysLog.error(msg, args);
	}
}
