package com.yyt.orm.company;
/**
 * 病症
 * @author java_one
 *
 */
public class BingZheng implements java.io.Serializable {
	private Integer id;
	private Integer title;
	private String bingzheng;
	private String miaoshu;
	public BingZheng(){
		
	}
	public Integer getTitle() {
		return title;
	}
	public void setTitle(Integer title) {
		this.title = title;
	}
	public String getBingzheng() {
		return bingzheng;
	}
	public void setBingzheng(String bingzheng) {
		this.bingzheng = bingzheng;
	}
	public String getMiaoshu() {
		return miaoshu;
	}
	public void setMiaoshu(String miaoshu) {
		this.miaoshu = miaoshu;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
}
