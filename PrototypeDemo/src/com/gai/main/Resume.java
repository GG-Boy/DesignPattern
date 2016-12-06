package com.gai.main;

public class Resume implements Cloneable {

	private String name;
	private String sex;
	private String age;
	private WorkExperience work;
	
	public Resume(String name) {
		this.name = name;
		work = new WorkExperience();
	}
	
	//提供Clone方法调用的私有构造函数，以便克隆“工作经历”的数据
	private Resume(WorkExperience work) {
		this.work = (WorkExperience) work.clone();
	}

	//设置个人信息
	public void setPersonalInfo(String sex, String age) {
		this.sex = sex;
		this.age = age;
	}
	
	//设置工作经历
	public void setWorkExperience(String workDate, String company) {
		work.setWorkDate(workDate);
		work.setCompany(company);
	}
	
	//显示
	public void display() {
		System.out.println(name+" "+sex+" "+age);
		System.out.println("工作经历："+work.getWorkDate()+" "+work.getCompany());
	}

	@Override
	protected Object clone() {
		Resume obj = new Resume(this.work);
		obj.name = this.name;
		obj.sex = this.sex;
		obj.age = this.age;
		return obj;
	}

	
	
}
