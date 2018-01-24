package patterntest.facadepattern;

import patterntest.facadepattern.logservice.AlarmLogService;
import patterntest.facadepattern.logservice.MonitorLogService;
import patterntest.facadepattern.logservice.SysLogService;

/**
 * 日志统一管理类，外观类
 * 
 * @author tzx
 * @date 2018年1月4日
 */
public class LogHandle {
	private SysLogService sysLogService = new SysLogService();
	private AlarmLogService alarmLogService = new AlarmLogService();
	private MonitorLogService monitorLogService = new MonitorLogService();

	public void error(String msg, Object... args) {
		sysLogService.error(msg, args);
		alarmLogService.error(msg, args);
		monitorLogService.error(msg, args);
	}
}
