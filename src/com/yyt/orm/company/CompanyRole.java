package com.yyt.orm.company;

import java.util.HashSet;
import java.util.Set;
/**|
 * 总公司角色
 * @author java_one
 *
 */
public class CompanyRole implements java.io.Serializable {

	private Integer id;
	private String name;
	private String remark;
	private Set<CompanyStaff> companystaffes = new HashSet<CompanyStaff>();
	private Set<CompanyPower> companypoweres = new HashSet<CompanyPower>();
	public CompanyRole(){
		
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
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Set<CompanyStaff> getCompanystaffes() {
		return companystaffes;
	}
	public void setCompanystaffes(Set<CompanyStaff> companystaffes) {
		this.companystaffes = companystaffes;
	}
	public Set<CompanyPower> getCompanypoweres() {
		return companypoweres;
	}
	public void setCompanypoweres(Set<CompanyPower> companypoweres) {
		this.companypoweres = companypoweres;
	}
	
}
