package patterntest.facade.service;

import patterntest.facade.LogHandle;

/**
 * 用户操作类
 * 
 * @author tzx
 * @date 2018年1月4日
 */
public class UserService {
	// private SysLogService sysLogService = new SysLogService();
	// private AlarmLogService alarmLogService = new AlarmLogService();
	// private MonitorLogService monitorLogService = new MonitorLogService();
	private LogHandle logHandle = new LogHandle();
	public void addUser() {
		try {
			System.out.println("");
		} catch (Exception e) {
			// sysLogService.error("系统异常{}", new Object[] { e.getMessage() });
			// alarmLogService.error("系统异常{}", new Object[] { e.getMessage() });
			// monitorLogService.error("系统异常{}", new Object[] { e.getMessage()
			// });
			logHandle.error("系统异常{}", new Object[] { e.getMessage() });
		}
	}
}
