package com.yyt.orm.company;

import java.util.HashSet;
import java.util.Set;
/**
 * 总公司权限
 * @author java_one
 *
 */
public class CompanyPower implements java.io.Serializable {

	private Integer id;
	private String name;
	private String url;
	private CompanyPower parent;
	private Set<CompanyPower> childrens = new HashSet<CompanyPower>();
	private Set<CompanyRole> roles = new HashSet<CompanyRole>();
	public CompanyPower(){
		
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public CompanyPower getParent() {
		return parent;
	}
	public void setParent(CompanyPower parent) {
		this.parent = parent;
	}
	public Set<CompanyPower> getChildrens() {
		return childrens;
	}
	public void setChildrens(Set<CompanyPower> childrens) {
		this.childrens = childrens;
	}
	public Set<CompanyRole> getRoles() {
		return roles;
	}
	public void setRoles(Set<CompanyRole> roles) {
		this.roles = roles;
	}
	
}
