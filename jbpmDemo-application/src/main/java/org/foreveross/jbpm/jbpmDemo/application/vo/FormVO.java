package org.foreveross.jbpm.jbpmDemo.application.vo;

public class FormVO {

	private String name;
	
	private String remark;
	
	private long id;
	
	public FormVO() {
	}

	public FormVO(long id,String name, String remark) {
		super();
		this.id = id;
		this.name = name;
		this.remark = remark;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
}
