package org.westos.iostream;

import java.io.Serializable;
import java.util.Objects;

/**
 * ѧ����
 * @author Administrator
 *
 */
public class Student implements Cloneable, Serializable,  Comparable<Student>{

	private String name;
	private int age ;
	
	public Student() {
		super();
	}
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Student student = (Student) o;
		return age == student.age &&
				Objects.equals(name, student.name);
	}

	@Override
	public int hashCode() {

		return Objects.hash(name, age);
	}


	// 根据姓名长度来排序
	@Override
	public int compareTo(Student o) {
		return this.name.length() - o.name.length();
	}


	// 根据姓名和你年龄大小来排序区别一个人
//	@Override
//	public int compareTo(Student o) {
//		int ret = this.name.compareTo(o.name);
//
//		ret = ret == 0 ? this.age - o.age : ret;
//
//		return ret;
//	}


	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
