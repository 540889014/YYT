package com.yyt.orm.company;

import java.util.HashSet;
import java.util.Set;

import com.yyt.orm.store.StoreServicePrice;

/**
 * 服务项目
 * @author java_one
 *
 */
public class ServiceProject implements java.io.Serializable {

	private Integer id;
	private String projectName;
	private String servicePeople;
	private String bingzheng;
	private String serviceTime;//按照分钟
	private ServicePrice servicePrice;
	private Set<StoreServicePrice> servicePrices = new HashSet<StoreServicePrice>();
	public ServiceProject(){
		
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getServicePeople() {
		return servicePeople;
	}
	public void setServicePeople(String servicePeople) {
		this.servicePeople = servicePeople;
	}
	public String getBingzheng() {
		return bingzheng;
	}
	public void setBingzheng(String bingzheng) {
		this.bingzheng = bingzheng;
	}
	public String getServiceTime() {
		return serviceTime;
	}
	public void setServiceTime(String serviceTime) {
		this.serviceTime = serviceTime;
	}
	public ServicePrice getServicePrice() {
		return servicePrice;
	}
	public void setServicePrice(ServicePrice servicePrice) {
		this.servicePrice = servicePrice;
	}
	public Set<StoreServicePrice> getServicePrices() {
		return servicePrices;
	}
	public void setServicePrices(Set<StoreServicePrice> servicePrices) {
		this.servicePrices = servicePrices;
	}
	
}
