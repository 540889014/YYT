package com.yyt.orm.member;

import java.util.Date;

import com.yyt.orm.company.CompanyStore;
import com.yyt.orm.member.util.MemberLevel;

public class Member implements java.io.Serializable  {
	
	private Integer id;
	private String memberId;
	private String childname;//会员姓名
	private String sex;//性别
	private MemberLevel memberLevel;//会员等级，通过美剧映射，会员等级分三个
	private Integer monthes;//月龄
	private String motherName;
	private Village village;//所属小区
	private Integer memberCode;//会员积分
	private Float accuracyRate;//准确率 通过预约的计算获得
	private String  fatherName;
	private String motherPhoneNum;
	private String familyPhoneNum;
	private String familyAddress;
	private String memberEmail;
	private Date registerDate;
	private CompanyStore companyStore;//所属的加盟店
	
	public Member(){
		
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getChildname() {
		return childname;
	}
	public void setChildname(String childname) {
		this.childname = childname;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public MemberLevel getMemberLevel() {
		return memberLevel;
	}
	public void setMemberLevel(MemberLevel memberLevel) {
		this.memberLevel = memberLevel;
	}
	public Integer getMonthes() {
		return monthes;
	}
	public void setMonthes(Integer monthes) {
		this.monthes = monthes;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public Village getVillage() {
		return village;
	}
	public void setVillage(Village village) {
		this.village = village;
	}
	public Integer getMemberCode() {
		return memberCode;
	}
	public void setMemberCode(Integer memberCode) {
		this.memberCode = memberCode;
	}
	public Float getAccuracyRate() {
		return accuracyRate;
	}
	public void setAccuracyRate(Float accuracyRate) {
		this.accuracyRate = accuracyRate;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getMotherPhoneNum() {
		return motherPhoneNum;
	}
	public void setMotherPhoneNum(String motherPhoneNum) {
		this.motherPhoneNum = motherPhoneNum;
	}
	public String getFamilyPhoneNum() {
		return familyPhoneNum;
	}
	public void setFamilyPhoneNum(String familyPhoneNum) {
		this.familyPhoneNum = familyPhoneNum;
	}
	public String getFamilyAddress() {
		return familyAddress;
	}
	public void setFamilyAddress(String familyAddress) {
		this.familyAddress = familyAddress;
	}
	public String getMemberEmail() {
		return memberEmail;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	public Date getRegisterDate() {
		return registerDate;
	}
	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}
	public CompanyStore getCompanyStore() {
		return companyStore;
	}
	public void setCompanyStore(CompanyStore companyStore) {
		this.companyStore = companyStore;
	}
	
	
}
