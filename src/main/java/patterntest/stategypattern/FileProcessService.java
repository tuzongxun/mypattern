package patterntest.stategypattern;

import patterntest.stategypattern.stategy.AbsDataProcess;
import patterntest.stategypattern.stategy.BcpFileDataProcess;
import patterntest.stategypattern.stategy.DbDataProcess;
import patterntest.stategypattern.stategy.LogFileDataProcess;

/**
 * 策略模式具体使用策略的类，提供给外部调用的统一接口类
 * 
 * @author tzx
 * @date 2018年1月24日
 */
public class FileProcessService {

	@SuppressWarnings("unused")
	private static AbsDataProcess dataProcess;

	/**
	 * 模拟客户端调用
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// new DataProcessService().readAndImportDb(0);
		dataProcess(0);

	}

	/**
	 * 提供给外部系统调用的数据处理接口，这里为了测试，改为普通方法
	 * 
	 * @return
	 */
	public static String dataProcess(int type) {
		try {
			if (type == 0) {
				// 读取日志文件入库
				dataProcess = new LogFileDataProcess();
			} else if (type == 1) {
				// 读取bcp文件入库
				dataProcess = new BcpFileDataProcess();
			} else if (type == 2) {
				// 从数据库读取数据并入库
				dataProcess = new DbDataProcess();
			}
			return "success";
		} catch (Exception e) {
			return "fail";
		}

	}

}
