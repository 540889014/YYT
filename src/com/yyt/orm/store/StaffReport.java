package com.yyt.orm.store;

import java.util.Date;

import com.yyt.orm.company.CompanyStore;

/**
 * 员工报告
 * @author java_one
 *
 */
public class StaffReport implements java.io.Serializable {

	private Integer id;
	private String title;
	private String content;
	private Date createTime;//更新时间
	private Staff staff;
	private CompanyStore companyStore;
	public StaffReport(){
		
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public CompanyStore getCompanyStore() {
		return companyStore;
	}
	public void setCompanyStore(CompanyStore companyStore) {
		this.companyStore = companyStore;
	}
	public Staff getStaff() {
		return staff;
	}
	public void setStaff(Staff staff) {
		this.staff = staff;
	}
	
}
