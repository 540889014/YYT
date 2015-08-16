package com.yyt.orm.company;
/**
 * 线下预约
 * @author java_one
 *
 */
public class Yuyue implements java.io.Serializable {
	private Integer id;
	private String area;//地区
	public Yuyue(){
		
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	
}
