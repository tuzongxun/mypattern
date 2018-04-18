package patterntest.stategypattern.stategy;

/**
 * 不使用策略模式时的常规处理
 * 
 * @author tzx
 * @date 2018年1月24日
 */
public class DataProcessService {

	/**
	 * 读取数据并入库的方法
	 * 
	 * @return
	 */
	public String readAndImportDb(int type) throws Exception {
		try {
		if (type == 0) {
			// 读取日志文件入库
			// 第一步，读取日志文件
			// 第二步，把读取的数据封装成可以入库sybase的数据格式
			// 第三步，数据入库
		} else if (type == 1) {
			// 读取bcp文件入库
			// 第一步，使用bcp命令读取bcp文件
			// 第二步，使用bcp命令文件入库
		} else if (type == 2) {
			// 从数据库读取数据并入库
			// 第一步，从oracle数据库读取数据
			// 第二步，把从oracle读取的数据组装成可以入库sybase的数据
			// 第三步，数据入库sybase
		}
			return "success";
		} catch (Exception e) {
			return "fail";
		}

	}
}
