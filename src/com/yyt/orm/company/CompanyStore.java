package com.yyt.orm.company;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.yyt.orm.member.Member;
import com.yyt.orm.member.Village;
import com.yyt.orm.store.Staff;
import com.yyt.orm.store.StaffReport;
import com.yyt.orm.store.StorePower;
import com.yyt.orm.store.StoreRole;
import com.yyt.orm.store.StoreServicePrice;

public class CompanyStore implements java.io.Serializable {
	
	private Integer id;
	private String storename;
	private String storeManager;//加盟店店长
	private String storePhone;
	private String storeManagerPhone;
	private String storeManagerEmail;
	private String storeManagerWeixin;
	private CompanyStaff companyStaff;
	private Integer staffnum;//通过统计加盟店的员工数量获得
	private String storeAddress;
	private Date buildDate;
	private boolean shangxian = false;
	//这个加盟店包含的东西
	private Set<Member> members = new HashSet<Member>();
	private Set<Village> villages = new HashSet<Village>();
	private Set<Staff> staffes = new HashSet<Staff>();
	private Set<StaffReport> reportes = new HashSet<StaffReport>();
	private Set<StoreServicePrice> servicepirces = new HashSet<StoreServicePrice>();
	private Set<StoreRole> rolees = new HashSet<StoreRole>();
	public CompanyStore(){
		
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getStorename() {
		return storename;
	}
	public void setStorename(String storename) {
		this.storename = storename;
	}
	public String getStoreManager() {
		return storeManager;
	}
	public void setStoreManager(String storeManager) {
		this.storeManager = storeManager;
	}
	public String getStorePhone() {
		return storePhone;
	}
	public void setStorePhone(String storePhone) {
		this.storePhone = storePhone;
	}
	public String getStoreManagerPhone() {
		return storeManagerPhone;
	}
	public void setStoreManagerPhone(String storeManagerPhone) {
		this.storeManagerPhone = storeManagerPhone;
	}
	public String getStoreManagerEmail() {
		return storeManagerEmail;
	}
	public void setStoreManagerEmail(String storeManagerEmail) {
		this.storeManagerEmail = storeManagerEmail;
	}
	public String getStoreManagerWeixin() {
		return storeManagerWeixin;
	}
	public void setStoreManagerWeixin(String storeManagerWeixin) {
		this.storeManagerWeixin = storeManagerWeixin;
	}
	public CompanyStaff getCompanyStaff() {
		return companyStaff;
	}
	public void setCompanyStaff(CompanyStaff companyStaff) {
		this.companyStaff = companyStaff;
	}
	public Integer getStaffnum() {
		return staffnum;
	}
	public void setStaffnum(Integer staffnum) {
		this.staffnum = staffnum;
	}
	public String getStoreAddress() {
		return storeAddress;
	}
	public void setStoreAddress(String storeAddress) {
		this.storeAddress = storeAddress;
	}
	public Date getBuildDate() {
		return buildDate;
	}
	public void setBuildDate(Date buildDate) {
		this.buildDate = buildDate;
	}
	public Set<Member> getMembers() {
		return members;
	}
	public void setMembers(Set<Member> members) {
		this.members = members;
	}
	public Set<Village> getVillages() {
		return villages;
	}
	public void setVillages(Set<Village> villages) {
		this.villages = villages;
	}
	public Set<Staff> getStaffes() {
		return staffes;
	}
	public void setStaffes(Set<Staff> staffes) {
		this.staffes = staffes;
	}
	public Set<StaffReport> getReportes() {
		return reportes;
	}
	public void setReportes(Set<StaffReport> reportes) {
		this.reportes = reportes;
	}

	public Set<StoreRole> getRolees() {
		return rolees;
	}
	public void setRolees(Set<StoreRole> rolees) {
		this.rolees = rolees;
	}
	public boolean isShangxian() {
		return shangxian;
	}
	public void setShangxian(boolean shangxian) {
		this.shangxian = shangxian;
	}
	public Set<StoreServicePrice> getServicepirces() {
		return servicepirces;
	}
	public void setServicepirces(Set<StoreServicePrice> servicepirces) {
		this.servicepirces = servicepirces;
	}
	
}
