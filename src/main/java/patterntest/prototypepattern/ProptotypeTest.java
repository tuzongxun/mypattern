package patterntest.prototypepattern;

/**
 * 原型模式测试
 * 
 * @author tzx
 * @date 2017年12月5日
 */
public class ProptotypeTest {

	public static void main(String[] args) {
		StudentModel student = new StudentModel();
		student.setName("张三");
		student.setAge(12);
		student.setClassName("六一班");
		student.setSex("男");
		HeadmasterModel headmaster = new HeadmasterModel();
		headmaster.setAge(32);
		headmaster.setClassName("六一班");
		headmaster.setName("张威");
		student.setHeadmaster(headmaster);
		System.out.println(student.getHeadmaster().hashCode());
		System.out.println(student.clone().getHeadmaster().hashCode());

	}

}
