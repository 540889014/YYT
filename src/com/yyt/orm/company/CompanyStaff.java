package com.yyt.orm.company;

import java.util.HashSet;
import java.util.Set;
/**
 * 总公司职员
 * @author java_one
 *
 */
public class CompanyStaff implements java.io.Serializable {
	private Integer id;
	private String username;
	private String password;
	private String staffPhone;
	private Set<CompanyStore> stores = new HashSet<CompanyStore>();
	private Set<CompanyRole> companyRoles= new HashSet<CompanyRole>();
	public CompanyStaff(){
		
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getStaffPhone() {
		return staffPhone;
	}
	public void setStaffPhone(String staffPhone) {
		this.staffPhone = staffPhone;
	}
	
	public Set<CompanyRole> getCompanyRoles() {
		return companyRoles;
	}
	public void setCompanyRoles(Set<CompanyRole> companyRoles) {
		this.companyRoles = companyRoles;
	}
	public Set<CompanyStore> getStores() {
		return stores;
	}
	public void setStores(Set<CompanyStore> stores) {
		this.stores = stores;
	}
	
}
