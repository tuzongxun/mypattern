package patterntest.prototypepattern;

import java.io.Serializable;

/**
 * 班主任实体类
 * 
 * @author tzx
 * @date 2017年12月4日
 */

public class HeadmasterModel implements Cloneable, Serializable {
	/**
	 * 老师姓名
	 */
	private String name;
	/**
	 * 老师年龄
	 */
	private int age;
	/**
	 * 管理班级的名称
	 */
	private String className;

	public HeadmasterModel clone() {
		// HeadmasterModel headmasterModel = new HeadmasterModel();
		// headmasterModel.setAge(this.age);
		// headmasterModel.setClassName(this.className);
		// headmasterModel.setName(this.name);
		// return headmasterModel;

		// Object object = null;
		HeadmasterModel headmasterMode = null;
		try {
			headmasterMode = (HeadmasterModel) super.clone();
			// headmasterMode = (HeadmasterModel) object;
		} catch (CloneNotSupportedException e) {
			// e.printStackTrace();
		}
		
		return headmasterMode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	@Override
	public String toString() {
		return "HeadmasterModel [name=" + name + ", age=" + age + ", className=" + className + "]";
	}

}
