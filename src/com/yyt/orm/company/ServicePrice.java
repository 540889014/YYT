package com.yyt.orm.company;

public class ServicePrice implements java.io.Serializable {

	private Integer id;
	private Float serviceprice;//服务价格
	public ServicePrice(){
		
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Float getServiceprice() {
		return serviceprice;
	}
	public void setServiceprice(Float serviceprice) {
		this.serviceprice = serviceprice;
	}
	
}
