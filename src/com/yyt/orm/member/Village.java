package com.yyt.orm.member;

import java.util.HashSet;
import java.util.Set;

import com.yyt.orm.company.CompanyStore;

/**
 * 小区
 * @author java_one
 *
 */
public class Village implements java.io.Serializable{
	private Integer id;
	private String villageName;
	private Integer memberNum;
	private String villageAddress;
	private String xingzheng;//行政区
	private String guimo;//小区规模
	private CompanyStore companyStore;//所属加盟店
	private Set<Member> memberes = new HashSet<Member>();
	public Village(){
		
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getVillageName() {
		return villageName;
	}
	public void setVillageName(String villageName) {
		this.villageName = villageName;
	}
	public Integer getMemberNum() {
		return memberNum;
	}
	public void setMemberNum(Integer memberNum) {
		this.memberNum = memberNum;
	}
	public String getVillageAddress() {
		return villageAddress;
	}
	public void setVillageAddress(String villageAddress) {
		this.villageAddress = villageAddress;
	}
	public String getXingzheng() {
		return xingzheng;
	}
	public void setXingzheng(String xingzheng) {
		this.xingzheng = xingzheng;
	}
	public String getGuimo() {
		return guimo;
	}
	public void setGuimo(String guimo) {
		this.guimo = guimo;
	}
	public Set<Member> getMemberes() {
		return memberes;
	}
	public void setMemberes(Set<Member> memberes) {
		this.memberes = memberes;
	}
	public CompanyStore getCompanyStore() {
		return companyStore;
	}
	public void setCompanyStore(CompanyStore companyStore) {
		this.companyStore = companyStore;
	}
	
	
}
