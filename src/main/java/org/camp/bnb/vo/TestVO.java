package org.camp.bnb.vo;

public class TestVO {
	
	private Integer no; 
	private String name;
	
	public TestVO() {}

	
	
	public TestVO(Integer no, String name) {
		super();
		this.no = no;
		this.name = name;
	}



	@Override
	public String toString() {
		return "TestVO [no=" + no + ", name=" + name + "]";
	}



	public Integer getNo() {
		return no;
	}

	public void setNo(Integer no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	


}
