package patterntest.prototypepattern;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 学生实体类
 * 
 * @author tzx
 * @date 2017年12月4日
 */
public class StudentModel implements Serializable {

	private static final long serialVersionUID = 1L;
	/**
	 * 学生姓名
	 */
	private String name;
	/**
	 * 学生年龄
	 */
    private int age;
	/**
	 * 所属班级名称
	 */
	private String className;
	/**
	 * 性别
	 */
	private String sex;
	/**
	 * 班主任
	 */
	private HeadmasterModel headmaster;

	public StudentModel clone() {
		StudentModel studentModel = null;
		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		try {
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
			objectOutputStream.writeObject(this);

			ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
			ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
			studentModel = (StudentModel) objectInputStream.readObject();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return studentModel;
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

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public HeadmasterModel getHeadmaster() {
		return headmaster;
	}

	public void setHeadmaster(HeadmasterModel headmaster) {
		this.headmaster = headmaster;
	}

	@Override
	public String toString() {
		return "StudentModel [name=" + name + ", age=" + age + ", className=" + className + ", sex=" + sex
				+ ", headmaster=" + headmaster + "]";
	}

}
