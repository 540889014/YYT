package com.yyt.orm.store;

import java.util.HashSet;
import java.util.Set;

import com.yyt.orm.company.CompanyStore;

/**
 * 加盟店的角色
 * @author java_one
 *
 */
public class StoreRole implements java.io.Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String rolename;
	private String remark;
	private Set<StorePower> storepowers = new HashSet<StorePower>();
	private CompanyStore companyStore;
	public StoreRole(){
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRolename() {
		return rolename;
	}

	public void setRolename(String rolename) {
		this.rolename = rolename;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Set<StorePower> getStorepowers() {
		return storepowers;
	}

	public void setStorepowers(Set<StorePower> storepowers) {
		this.storepowers = storepowers;
	}

	public CompanyStore getCompanyStore() {
		return companyStore;
	}

	public void setCompanyStore(CompanyStore companyStore) {
		this.companyStore = companyStore;
	}
	
}
