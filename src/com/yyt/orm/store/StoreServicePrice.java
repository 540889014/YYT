package com.yyt.orm.store;

import java.util.HashSet;
import java.util.Set;

import com.yyt.orm.company.CompanyStore;
import com.yyt.orm.company.ServiceProject;

/**
 * 门店自定义自己的服务价钱
 * @author java_one
 *
 */
public class StoreServicePrice implements java.io.Serializable {
	private Integer id;
	private Float serviceprice;
	private CompanyStore companyStore;
	private Set<ServiceProject> serviceProjectes = new HashSet<ServiceProject>();
	public StoreServicePrice(){
		
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
	public CompanyStore getCompanyStore() {
		return companyStore;
	}
	public void setCompanyStore(CompanyStore companyStore) {
		this.companyStore = companyStore;
	}
	public Set<ServiceProject> getServiceProjectes() {
		return serviceProjectes;
	}
	public void setServiceProjectes(Set<ServiceProject> serviceProjectes) {
		this.serviceProjectes = serviceProjectes;
	}
	
}
