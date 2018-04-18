package patterntest.stategypattern.stategy;

/**
 * 读取日志文件并导入系统数据库
 * 
 * @author tzx
 * @date 2018年1月24日
 */
public class LogFileDataProcess extends AbsDataProcess {

	@Override
	public void readAndImportDb() throws Exception {
		// 读取日志文件入库
		// 第一步，读取日志文件
		// 第二步，把读取的数据封装成可以入库sybase的数据格式
		// 第三步，数据入库

	}
}
