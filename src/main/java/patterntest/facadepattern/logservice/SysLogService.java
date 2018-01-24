package patterntest.facadepattern.logservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 系统日志接口
 * 
 * @author tzx
 * @date 2018年1月4日
 */
public class SysLogService {
	private Logger sysLog = LoggerFactory.getLogger(this.getClass());

	public void error(String msg, Object... args) {
		sysLog.error(msg, args);
	}
}
