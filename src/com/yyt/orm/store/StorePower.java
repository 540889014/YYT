package com.yyt.orm.store;

import java.util.HashSet;
import java.util.Set;

import com.yyt.orm.company.CompanyStore;

/**
 * 加盟店的权限
 * @author java_one
 *
 */
public class StorePower implements java.io.Serializable{
	
	private Integer id;
	private String powerName;
	private String url;
	private StorePower parent;
	private Set<StorePower> childrens = new HashSet<StorePower>();
	private Set<StoreRole> storeRolees = new HashSet<StoreRole>();//这个权限关联的角色
	
	public StorePower(){
		
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPowerName() {
		return powerName;
	}
	public void setPowerName(String powerName) {
		this.powerName = powerName;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public StorePower getParent() {
		return parent;
	}
	public void setParent(StorePower parent) {
		this.parent = parent;
	}
	public Set<StorePower> getChildrens() {
		return childrens;
	}
	public void setChildrens(Set<StorePower> childrens) {
		this.childrens = childrens;
	}
	public Set<StoreRole> getStoreRolees() {
		return storeRolees;
	}
	public void setStoreRolees(Set<StoreRole> storeRolees) {
		this.storeRolees = storeRolees;
	}
	
	
}
