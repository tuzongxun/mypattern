package patterntest.stategypattern.stategy;

/**
 * 直接从数据库读取数据导入另一个系统库
 * 
 * @author tzx
 * @date 2018年1月24日
 */
public class DbDataProcess extends AbsDataProcess {

	@Override
	public void readAndImportDb() throws Exception {
		// 从数据库读取数据并入库
		// 第一步，从oracle数据库读取数据
		// 第二步，把从oracle读取的数据组装成可以入库sybase的数据
		// 第三步，数据入库sybase

	}
}
