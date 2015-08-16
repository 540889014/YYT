package com.yyt.orm.store;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.yyt.orm.company.CompanyStore;
import com.yyt.orm.member.util.Satisfaction;

/**
 * 员工类
 * @author java_one
 *
 */
public class Staff implements java.io.Serializable{

	private Integer id;
	private String staffName;
	private String sex;
	private String Idcard;//身份证号
	private String phoneNum;
	private String staffCode;
	private String serviceNum;//服务次数，通过预约 服务次数进行统计
	private Satisfaction satisfaction;//满意度，三个等级
	private String staffEmail;
	private String weixinNum;
	private Date joinTime;//入职时间
	private String nowState;//在职状态
	private Set<StoreRole> storerole = new HashSet<StoreRole>();//所拥有的权限
	private String loginname;
	private String loginpassword;
	private CompanyStore companyStore;
	private Set<StaffReport> reports = new HashSet<StaffReport>();//该员工的工作报告
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getStaffName() {
		return staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getIdcard() {
		return Idcard;
	}
	public void setIdcard(String idcard) {
		Idcard = idcard;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getStaffCode() {
		return staffCode;
	}
	public void setStaffCode(String staffCode) {
		this.staffCode = staffCode;
	}
	public String getServiceNum() {
		return serviceNum;
	}
	public void setServiceNum(String serviceNum) {
		this.serviceNum = serviceNum;
	}
	public Satisfaction getSatisfaction() {
		return satisfaction;
	}
	public void setSatisfaction(Satisfaction satisfaction) {
		this.satisfaction = satisfaction;
	}
	public String getStaffEmail() {
		return staffEmail;
	}
	public void setStaffEmail(String staffEmail) {
		this.staffEmail = staffEmail;
	}
	public String getWeixinNum() {
		return weixinNum;
	}
	public void setWeixinNum(String weixinNum) {
		this.weixinNum = weixinNum;
	}
	public Date getJoinTime() {
		return joinTime;
	}
	public void setJoinTime(Date joinTime) {
		this.joinTime = joinTime;
	}
	public String getNowState() {
		return nowState;
	}
	public void setNowState(String nowState) {
		this.nowState = nowState;
	}

	public Set<StoreRole> getStorerole() {
		return storerole;
	}
	public void setStorerole(Set<StoreRole> storerole) {
		this.storerole = storerole;
	}
	public String getLoginname() {
		return loginname;
	}
	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}
	public String getLoginpassword() {
		return loginpassword;
	}
	public void setLoginpassword(String loginpassword) {
		this.loginpassword = loginpassword;
	}
	public CompanyStore getCompanyStore() {
		return companyStore;
	}
	public void setCompanyStore(CompanyStore companyStore) {
		this.companyStore = companyStore;
	}
	public Set<StaffReport> getReports() {
		return reports;
	}
	public void setReports(Set<StaffReport> reports) {
		this.reports = reports;
	}
	
	
	
}
